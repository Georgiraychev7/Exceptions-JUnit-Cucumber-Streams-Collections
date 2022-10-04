package cucumber.helper;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;


public interface CalculatorHelper {

    int calculate(int a, int b);

    float calculate(float a, float b);

    BigDecimal calculate(BigDecimal a, BigDecimal b);

    double calculate(double a, double b);

    BigInteger calculate(BigInteger a, BigInteger b);

    byte calculate(byte a, byte b);

    short calculate(short a, short b);

    long calculate(long a, long b);

    public Integer calculate (List<Integer> integers);
}
