package ru.job4j.oop;

public class Battery {
    private int load;

    public void setLoad(int load) {
        this.load = load;
    }

    public int getLoad() {
        return this.load;
    }

    public Battery(int energy) {
        this.load = energy;
    }

    public Battery() {
    }

    public void giveEnergyTo(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }
}
