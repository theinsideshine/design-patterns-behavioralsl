package interpreter;

import java.util.Stack;


// Clase evaluadora de expresiones en notación postfija (RPN)
public class ExpressionEvaluator {

    // Método estático que evalúa una expresión en notación postfija
    public static int evaluateExpression(String expression) {
        // Pila para almacenar las subexpresiones y resultados intermedios
        Stack<Expression> stack = new Stack<>();

        // Itera sobre cada carácter en la expresión
        for (char c : expression.toCharArray()) {
            // Si el carácter es un dígito, se convierte a número y se apila
            if (Character.isDigit(c)) {
                stack.push(new Number(Character.getNumericValue(c)));
            } else {
                // Si el carácter es un operador, se desapilan dos operandos
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operation = null;

                // Se crea una instancia de la operación correspondiente
                switch (c) {
                    case '+':
                        operation = new Add(leftExpression, rightExpression);
                        break;
                    case '-':
                        operation = new Subtract(leftExpression, rightExpression);
                        break;
                    case '*':
                        operation = new Multiply(leftExpression, rightExpression);
                        break;
                    case '/':
                        operation = new Divide(leftExpression, rightExpression);
                        break;
                }

                // Se imprime la operación actual
                System.out.println("Evaluando: " + operation);
                // Se apila el resultado de la operación
                stack.push(operation);
            }
        }
        // El resultado final de la evaluación es el único elemento restante en la pila
        return stack.pop().interpret();
    }
}