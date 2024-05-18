package interpreter.example;

import interpreter.*;
import interpreter.Number;


public class InterpreterApp {

    public static void main(String[] args) {
        String expression = "52*3+";
        int result = ExpressionEvaluator.evaluateExpression(expression);
        System.out.println("Resultado: " + result); // Resultado: 13
    }
}
