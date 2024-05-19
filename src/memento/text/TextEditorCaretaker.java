package memento.text;

import java.util.ArrayList;
import java.util.List;

public class TextEditorCaretaker {
    private List<TextEditorState> mementoList = new ArrayList<>();
    private int currentIndex = -1;

    public void add(TextEditorState state) {
        if (currentIndex != mementoList.size() - 1) {
            mementoList = new ArrayList<>(mementoList.subList(0, currentIndex + 1));
        }
        mementoList.add(state);
        currentIndex++;
    }

    public TextEditorState undo() {
        if (currentIndex > 0) {
            currentIndex--;
            return mementoList.get(currentIndex);
        }
        return null;
    }

    public TextEditorState redo() {
        if (currentIndex < mementoList.size() - 1) {
            currentIndex++;
            return mementoList.get(currentIndex);
        }
        return null;
    }

    public TextEditorState get(int index) {
        if (index >= 0 && index < mementoList.size()) {
            return mementoList.get(index);
        }
        return null;
    }

    public int getSize() {
        return mementoList.size();
    }

    public List<TextEditorState> getAllMementos() {
        return mementoList;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }
}

