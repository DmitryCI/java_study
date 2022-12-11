package apps.calculator;

import apps.calculator.interfaces.Actions;

import java.util.Scanner;

public class Functional extends ConsoleMessages implements Actions {
    Scanner scanner = new Scanner(System.in);
    Constants constants = new Constants();

    private String value;
    private String anotherValue;
    private String operator;

    public String getValue() {
        return this.value;
    }

    public String getAnotherValue() {
        return this.anotherValue;
    }

    public String getOperator() {
        return this.operator;
    }

    @Override
    public boolean integerValueCheck(String value) {
        if (value.matches(constants.getRegularNumber()))
            return false;
        valueShouldConsistOfNumberMessage();
        return true;
    }

    @Override
    public boolean operatorValueCheck(String operator) {
        Operators[] operators = Operators.values();
        for (Operators item : operators) {
            if (operator.contains(item.getOperator())) {
                return false;
            }
        }
        wrongTypeOfOperatorMessage();
        return true;
    }

    @Override
    public int parseStringToInt(String value) {
        return Integer.parseInt(value);
    }

    @Override
    public int chooseTypeOfOperation() {
        String typeOfOperation;
        do {
            chooseTypeOfOperationMessage();
            typeOfOperation = scanner.next();
        } while (integerValueCheck(typeOfOperation));
        int operation = parseStringToInt(typeOfOperation);
        if (operation > constants.getOperations().length || operation < 0) {
            wrongTypeOfOperationMessage();
            chooseTypeOfOperation();
        }
        return operation;
    }

    @Override
    public void initializationValue() {
        do
            enterValueMessage();
        while (integerValueCheck(value = scanner.next()));
    }

    @Override
    public void initializationAnotherValue() {
        do
            enterAnotherValueMessage();
        while (integerValueCheck(anotherValue = scanner.next()));
    }

    @Override
    public void initializationOperator() {
        do
            chooseAnOperatorMessage();
        while (operatorValueCheck(operator = scanner.next()));
    }

    @Override
    public int fold(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    @Override
    public int deduct(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    @Override
    public int multiply(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }

    @Override
    public int divide(int firstValue, int secondValue) {
        return firstValue / secondValue;
    }
}
