package apps.calculator;

import apps.calculator.interfaces.Console;

public class ConsoleMessages implements Console {

    @Override
    public void chooseTypeOfOperationMessage() {
        System.out.print("Choose type operation (1 - scalar, 2 - vector, 3 - matrix, 0 - close the application)\nOperation number: ");
    }

    @Override
    public void valueShouldConsistOfNumberMessage() {
        System.out.println("ERROR! Value should consists of number");
    }

    @Override
    public void wrongTypeOfOperationMessage() {
        System.out.println("Wrong type of operation. Choose again.");
    }

    @Override
    public void wrongTypeOfOperatorMessage() {
        System.out.println("Wrong type of operator. Choose again.");
    }

    @Override
    public void closeTheApplicationMessage() {
        System.out.println("Application closes");
    }

    @Override
    public void enterValueMessage() {
        System.out.print("Enter value: ");
    }

    @Override
    public void enterAnotherValueMessage() {
        System.out.print("Enter another value: ");
    }

    @Override
    public void chooseAnOperatorMessage() {
        System.out.print("Choose an operator (+, -, *, or /): ");
    }

}
