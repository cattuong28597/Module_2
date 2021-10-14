package com.codegym.week5.day4.Proxy;

public class MathCalculatorProxy implements ICalculator{
    private MathCalculator mathCalculator;

    public MathCalculatorProxy() {
        this.mathCalculator = new MathCalculator();
    }

    @Override
    public double add(double first, double second) {
        if (first / 2 + second / 2 >= Double.MAX_VALUE/2) {
            throw new RuntimeException("Out of ranger");
        }
        if (first / 2 + second / 2 <= Double.MIN_VALUE / 2) {
            throw new RuntimeException("Out of ranger");
        }
        return mathCalculator.add(first, second);
    }

    @Override
    public double sub(double first, double seccond) {
        if (first/2-seccond/2 >= Double.MAX_VALUE) {
            throw new RuntimeException("Out of ranger");
        }
        if (first/2-seccond/2 <= Double.MIN_VALUE) {
            throw new RuntimeException("Out of ranger");
        }
        return mathCalculator.sub(first, seccond);
    }

    @Override
    public double mul(double first, double second) {
        double result = mathCalculator.mul(first, second);
        if(first != 0 && result / first != second){
            throw new RuntimeException("Out of range");
        }
        return result;
    }

    @Override
    public double div(double first, double second) {
        if(second == 0){
            throw new RuntimeException("Can't divide by zero");
        }
        return mathCalculator.div(first, second);
    }

}
