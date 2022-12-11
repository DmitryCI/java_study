package apps.calculator;

public class Calculator extends Functional {

    private final int close = parseStringToInt(Operations.CLOSE.getOperation());
    private final int scalar = parseStringToInt(Operations.SCALAR.getOperation());
    private final int vector = parseStringToInt(Operations.VECTOR.getOperation());
    private final int matrix = parseStringToInt(Operations.MATRIX.getOperation());

    public void runCalculator() {
        int numberOfOperation;
        do {
            numberOfOperation = chooseTypeOfOperation();
            if (numberOfOperation == scalar) {
                initializationValue();
                initializationAnotherValue();
                initializationOperator();
                printResult();
            }
            if (numberOfOperation == vector) {
                System.out.println("Coming soon... Choose other operation.");
            }
            if (numberOfOperation == matrix) {
                System.out.println("Coming soon... Choose other operation.");
            }
        } while (numberOfOperation != 0);
        closeTheApplicationMessage();
    }

    private int scalarOperation() {
        int firstValue = parseStringToInt(getValue());
        int secondValue = parseStringToInt(getAnotherValue());
        String operator = getOperator();
        int result = 0;
        switch(operator) {
            case "+":
                result = fold(firstValue, secondValue);
                break;
            case "-":
                result = deduct(firstValue, secondValue);
                break;
            case "*":
                result = multiply(firstValue, secondValue);
                break;
            case "/":
                result = divide(firstValue, secondValue);
                break;
            default:
                System.out.println("Invalid operator");
        }
        return result;
    }

    private void printResult() {
        System.out.println("Result = " + scalarOperation());
    }

}
