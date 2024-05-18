package visitor;

// Visitante Concreto
public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("Visited " + elementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("Visited " + elementB.operationB());
    }
}
