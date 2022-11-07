package ua.com.hrv.task_2.interface_2;

import ua.com.hrv.task_2.interface_1.Numerable;

public class MyCalculator implements Numerable {
    private double a;
    private double b;
    private double c;

    public MyCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double devide() {
        return this.c = a / b;
    }

    @Override
    public double minus() {
        return this.c = a - b;
    }

    @Override
    public double multiply() {
        return this.c = a * b;
    }

    @Override
    public double add() {
        return this.c = a + b;
    }
}
