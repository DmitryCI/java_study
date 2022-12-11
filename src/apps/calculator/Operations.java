package apps.calculator;

public enum Operations {

    CLOSE ("0"),
    SCALAR ("1"),
    VECTOR ("2"),
    MATRIX ("3");

    private String operation;

    Operations(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
}
