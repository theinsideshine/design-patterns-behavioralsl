package interpreter;

// Nonterminal Expression for division
public class Divide implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Divide(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() / rightExpression.interpret();
    }

    @Override
    public String toString() {
        return "(" + leftExpression + " / " + rightExpression + ")";
    }
}
