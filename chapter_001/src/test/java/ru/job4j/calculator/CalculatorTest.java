package ru.job4j.calculator;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**Это тест.
 *
 *@author Anna
 *@since 21th June 2019
 *@version 1.0
 */

public class CalculatorTest {
	@Test
	public void whenAddingSecondtoFirst() {
		Calculator calc = new Calculator();
		double result = calc.add(1D, 1D);
		double expected = 2D;
		assertThat(result, is(expected));
	}

	@Test
	public void whenDiv4On2Then2() {
		Calculator calc = new Calculator();
		double result = calc.divide(4, 2);
		double expected = 2d;
		assertThat(result, is(expected));
	}

	@Test
	public void whenMultiply3on4Then12() {
		Calculator calc = new Calculator();
		double result = calc.multiply(3, 4);
		double expected = 12;
		assertThat(result, is(expected));
	}
	@Test
	public void whenSubtract3From5() {
		Calculator calc = new Calculator();
		double result = calc.subtract(5, 3);
		double expected = 2;
		assertThat(result, is(expected));
	}
}

