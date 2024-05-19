package memento.text.example;

import memento.text.TextEditor;
import memento.text.TextEditorCaretaker;
import memento.text.TextEditorState;

import java.util.Scanner;

public class TextEditorDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorCaretaker caretaker = new TextEditorCaretaker();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nEstados guardados:");
            for (int i = 0; i < caretaker.getSize(); i++) {
                String prefix = (i == caretaker.getCurrentIndex()) ? "-> " : "   ";
                TextEditorState state = caretaker.getAllMementos().get(i);
                System.out.println(prefix + (i + 1) + ". Contenido: " + state.getContent());
            }
            System.out.println("\nMenu:");
            System.out.println("1. Agregar estado");
            System.out.println("2. Deshacer último estado");
            System.out.println("3. Rehacer último estado");
            System.out.println("4. Restaurar estado");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Ingrese nuevo contenido: ");
                    String content = scanner.nextLine();
                    editor.setContent(content);
                    // Suponiendo que también ajustamos el cursor y la selección de alguna manera
                    editor.setCursorPosition(content.length());
                    editor.setSelection(0, content.length());
                    caretaker.add(editor.saveStateToMemento());
                    System.out.println("Estado agregado.");
                    break;
                case 2:
                    TextEditorState undoneState = caretaker.undo();
                    if (undoneState != null) {
                        editor.getStateFromMemento(undoneState);
                        System.out.println("Último estado deshecho. Contenido actual: " + editor.saveStateToMemento().getContent());
                    } else {
                        System.out.println("No hay estados para deshacer.");
                    }
                    break;
                case 3:
                    TextEditorState redoneState = caretaker.redo();
                    if (redoneState != null) {
                        editor.getStateFromMemento(redoneState);
                        System.out.println("Último estado rehecho. Contenido actual: " + editor.saveStateToMemento().getContent());
                    } else {
                        System.out.println("No hay estados para rehacer.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el número del estado a restaurar: ");
                    int stateNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    TextEditorState state = caretaker.get(stateNumber - 1);
                    if (state != null) {
                        editor.getStateFromMemento(state);
                        caretaker.undo();  // Update the current index to the restored state
                        caretaker.redo();
                        System.out.println("Estado restaurado. Contenido actual: " + editor.saveStateToMemento().getContent());
                    } else {
                        System.out.println("Número de estado inválido.");
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}

