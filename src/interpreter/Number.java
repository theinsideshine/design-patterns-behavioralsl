package interpreter;

// Terminal Expression
public class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
