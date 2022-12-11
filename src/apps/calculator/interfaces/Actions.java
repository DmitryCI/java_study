package apps.calculator.interfaces;

public interface Actions {

    boolean integerValueCheck(String value);

    boolean operatorValueCheck(String operator);

    int parseStringToInt(String value);

    int chooseTypeOfOperation();

    void initializationValue();

    void initializationAnotherValue();

    void initializationOperator();

    int fold(int firstValue, int secondValue);

    int deduct(int firstValue, int secondValue);

    int multiply(int firstValue, int secondValue);

    int divide(int firstValue, int secondValue);
}
