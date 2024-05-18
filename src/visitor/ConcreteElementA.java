package visitor;

// Elemento Concreto A
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "Operation A";
    }
}
