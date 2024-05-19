package memento.text;

public class TextEditorState {
    private String content;
    private int cursorPosition;
    private int selectionStart;
    private int selectionEnd;

    public TextEditorState(String content, int cursorPosition, int selectionStart, int selectionEnd) {
        this.content = content;
        this.cursorPosition = cursorPosition;
        this.selectionStart = selectionStart;
        this.selectionEnd = selectionEnd;
    }

    public String getContent() {
        return content;
    }

    public int getCursorPosition() {
        return cursorPosition;
    }

    public int getSelectionStart() {
        return selectionStart;
    }

    public int getSelectionEnd() {
        return selectionEnd;
    }
}
