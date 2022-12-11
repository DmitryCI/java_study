package apps.calculator;

public enum Operators {
    FOLD ("+"),
    DEDUCT ("-"),
    MULTIPLY ("*"),
    DIVIDE ("/");

    private String operator;

    Operators(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}
