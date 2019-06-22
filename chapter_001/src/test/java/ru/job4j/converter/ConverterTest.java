package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**Это тест конвертера.
 *
 *@author Anna
 *@since 22th June 2019
 *@version 1.0
 */

public class ConverterTest {

    @Test
    public void when120RubletoDollarThen2() {
        Converter converter = new Converter();
        double result = converter.rubleToDollar(120);
        double expected = 2;
        assertThat(result, is(expected));
    }

    @Test
    public void when140RubletoEuroThen2() {
        Converter converter = new Converter();
        double result = converter.rubleToEuro(140);
        double expected = 2;
        assertThat(result, is(expected));
    }

    @Test
    public void when2DollarsToRubleThen120() {
        Converter converter = new Converter();
        double result = converter.dollarToRuble(2);
        double expected = 120;
        assertThat(result, is(expected));
    }

    @Test
    public void when2EuroToRubleThen140() {
        Converter converter = new Converter();
        double result = converter.euroToRuble(2);
        double expected = 140;
        assertThat(result, is(expected));
    }
}
