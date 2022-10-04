package cucumber.helper;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class DifferenceCalculatorHelper implements CalculatorHelper {
    public int calculate(int a, int b) {
        return a - b;
    }

    public float calculate(float a, float b) {
        return a - b;
    }

    public BigDecimal calculate(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    public double calculate(double a, double b) {
        return a - b;
    }

    public BigInteger calculate(BigInteger a, BigInteger b) {
        return a.subtract(b);
    }

    public byte calculate(byte a, byte b) {
        return (byte) (a - b);
    }

    public short calculate(short a, short b) {
        return (short) (a - b);
    }

    public long calculate(long a, long b) {
        return a - b;
    }

    /**
     * Add method for calculating that have list as an input for the last task
     * @param integers
     * @return
     */
    public Integer calculate(List<Integer> integers) {
        int diff = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (i == 0) {
                diff = integers.get(i);
            } else {
                diff -= integers.get(i);
            } }
            return diff;
        }

    }