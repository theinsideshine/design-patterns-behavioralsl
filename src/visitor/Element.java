package visitor;

// Interfaz Visitable
public interface Element {
    void accept(Visitor visitor);
}
