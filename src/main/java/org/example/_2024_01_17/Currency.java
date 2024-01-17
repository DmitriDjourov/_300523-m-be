package org.example._2024_01_17;

public enum Currency {

    USD(1.25),
    EUR(1.11);

    private double index;

    Currency(double index) {
        this.index = index;
    }


}

class Currency2 {
    private Currency currency;

    private float index;
}