package interpreter;

// Nonterminal Expression for multiplication
public class Multiply implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Multiply(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() * rightExpression.interpret();
    }

    @Override
    public String toString() {
        return "(" + leftExpression + " * " + rightExpression + ")";
    }
}
