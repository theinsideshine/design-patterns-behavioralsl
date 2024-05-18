package visitor.example;

import visitor.*;

public class visitorApp {

    public static void main(String[] args) {
        Element[] elements = {new ConcreteElementA(), new ConcreteElementB()};
        Visitor visitor = new ConcreteVisitor();

        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
