package ru.job4j.oop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class BatteryTest {
    @Test

    public void whenEnergyExchange() {
        Battery giver = new Battery(50);
        Battery receiver = new Battery(30);
        giver.giveEnergyTo(receiver);
        assertThat(giver.getLoad(), is(0));
        assertThat(receiver.getLoad(), is(80));
    }

}
