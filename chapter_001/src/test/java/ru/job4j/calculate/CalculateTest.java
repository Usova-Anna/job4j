package ru.job4j.calculate;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**???? ???
*
*@author ????
*@since 18th June 2019
*@version 1.0
*/

public class CalculateTest { 
@Test
	public void echoName() {
	String input = "Petr";
	String expect = "Echo, echo, echo : Petr";
	Calculate calc = new Calculate();
	String result = calc.echo(input);
	assertThat(result, is(expect));
	}
}


