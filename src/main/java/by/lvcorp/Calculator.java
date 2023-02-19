package by.lvcorp;

public class Calculator {
    private double numBefore;
    private double numCurrent;
    private String operator;

    public double getNumBefore() {
        return numBefore;
    }

    public void setNumBefore(double numBefore) {
        this.numBefore = numBefore;
    }

    public double getNumCurrent() {
        return numCurrent;
    }

    public void setNumCurrent(double numCurrent) {
        this.numCurrent = numCurrent;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getResult(){
        return switch (operator) {
            case ("+") -> numBefore + numCurrent;
            case ("-") -> numBefore - numCurrent;
            case ("*") -> numBefore * numCurrent;
            case ("/") -> numBefore / numCurrent;
            default -> 0.0;
        };
    }
}
