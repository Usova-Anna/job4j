package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int energy) {
        this.load = energy;
    }

    public void giveEnergyTo(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery giver = new Battery(10);
        Battery receiver = new Battery(6);
        System.out.println("Battery giver charged: " + giver.load);
        System.out.println("Battery receiver charged: " + receiver.load);
        giver.giveEnergyTo(receiver);
        System.out.println("Exchanging in process...");
        System.out.println("Battery giver charged: " + giver.load);
        System.out.println("Battery receiver charged: " + receiver.load);
    }
}
