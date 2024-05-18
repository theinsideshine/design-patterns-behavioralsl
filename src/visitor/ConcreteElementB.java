package visitor;

// Elemento Concreto B
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "Operation B";
    }
}
