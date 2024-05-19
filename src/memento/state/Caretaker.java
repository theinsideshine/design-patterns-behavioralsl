package memento.state;

import java.util.ArrayList;
import java.util.List;



public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();
    private int currentIndex = -1;

    public void add(Memento state) {
        if (currentIndex != mementoList.size() - 1) {
            mementoList = new ArrayList<>(mementoList.subList(0, currentIndex + 1));
        }
        mementoList.add(state);
        currentIndex++;
    }

    public Memento getLast() {
        if (currentIndex >= 0) {
            return mementoList.get(currentIndex);
        }
        return null;
    }

    public Memento undo() {
        if (currentIndex > 0) {
            currentIndex--;
            return mementoList.get(currentIndex);
        }
        return null;
    }

    public Memento redo() {
        if (currentIndex < mementoList.size() - 1) {
            currentIndex++;
            return mementoList.get(currentIndex);
        }
        return null;
    }

    public Memento get(int index) {
        if (index >= 0 && index < mementoList.size()) {
            return mementoList.get(index);
        }
        return null;
    }

    public int getSize() {
        return mementoList.size();
    }

    public List<Memento> getAllMementos() {
        return mementoList;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }
}


