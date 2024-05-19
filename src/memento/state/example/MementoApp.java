package memento.state.example;

import memento.state.Caretaker;
import memento.state.Memento;
import memento.state.Originator;

import java.util.Scanner;

public class MementoApp {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nEstados guardados:");
            for (int i = 0; i < caretaker.getSize(); i++) {
                String prefix = (i == caretaker.getCurrentIndex()) ? "-> " : "   ";
                System.out.println(prefix + (i + 1) + ". " + caretaker.getAllMementos().get(i).getState());
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
                    System.out.print("Ingrese nuevo estado: ");
                    String state = scanner.nextLine();
                    originator.setState(state);
                    caretaker.add(originator.saveStateToMemento());
                    System.out.println("Estado agregado.");
                    break;
                case 2:
                    Memento undoneMemento = caretaker.undo();
                    if (undoneMemento != null) {
                        originator.getStateFromMemento(undoneMemento);
                        System.out.println("Último estado deshecho. Estado actual: " + originator.getState());
                    } else {
                        System.out.println("No hay estados para deshacer.");
                    }
                    break;
                case 3:
                    Memento redoneMemento = caretaker.redo();
                    if (redoneMemento != null) {
                        originator.getStateFromMemento(redoneMemento);
                        System.out.println("Último estado rehecho. Estado actual: " + originator.getState());
                    } else {
                        System.out.println("No hay estados para rehacer.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el número del estado a restaurar: ");
                    int stateNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Memento memento = caretaker.get(stateNumber - 1);
                    if (memento != null) {
                        originator.getStateFromMemento(memento);
                        caretaker.undo();  // Update the current index to the restored state
                        caretaker.redo();
                        System.out.println("Estado restaurado. Estado actual: " + originator.getState());
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