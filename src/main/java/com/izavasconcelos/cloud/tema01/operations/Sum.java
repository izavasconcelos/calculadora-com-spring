package com.izavasconcelos.cloud.tema01.operations;

import org.springframework.beans.factory.annotation.Autowired;

public class Sum implements Operation {

    private double firstValue;
    private double secondValue;

    public Sum(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public double getFirstValue() {
        return this.firstValue;
    }

    @Override
    public double getSecondValue() {
        return this.secondValue;
    }

    @Override
    public double doOperation() {

        return firstValue + secondValue;
    }

    @Override
    public String toString() {
        return  "\n" + this.firstValue + "  + " + this.secondValue + "  = " + doOperation();
    }

}
