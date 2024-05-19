package memento.text;

public class TextEditor {
    private String content = "";
    private int cursorPosition = 0;
    private int selectionStart = 0;
    private int selectionEnd = 0;

    public void setContent(String content) {
        this.content = content;
    }

    public void setCursorPosition(int cursorPosition) {
        this.cursorPosition = cursorPosition;
    }

    public void setSelection(int selectionStart, int selectionEnd) {
        this.selectionStart = selectionStart;
        this.selectionEnd = selectionEnd;
    }

    public TextEditorState saveStateToMemento() {
        return new TextEditorState(content, cursorPosition, selectionStart, selectionEnd);
    }

    public void getStateFromMemento(TextEditorState memento) {
        this.content = memento.getContent();
        this.cursorPosition = memento.getCursorPosition();
        this.selectionStart = memento.getSelectionStart();
        this.selectionEnd = memento.getSelectionEnd();
    }
}

