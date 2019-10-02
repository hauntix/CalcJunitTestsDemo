import calculator.Calc;
import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

	@Test
	public void addTest(){
		Calc calc = new Calc();

		int x = 1;
		int y = 2;

		int expected = 3;

		// when
		int actual = calc.add(x,y);

		// then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void subtractTest(){
		Calc calc = new Calc();

		int x = 3;
		int y = 2;

		int expected = 1;

		int actual = calc.subtract(x,y);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void multiplyTest(){
		Calc calc = new Calc();

		int x = 3;
		int y = 2;

		double expected = 6;

		double actual = calc.multiply(x,y);

		Assert.assertEquals(expected,actual, .0001);
	}

	@Test
	public void divideTest() {
		Calc calc = new Calc();

		int x = 6;
		int y = 2;

		int expected = 3;

		double actual = calc.divide(x,y);

		Assert.assertEquals(expected, actual, .0001);
	}

	@Test
	public void squareTest() {
		Calc calc = new Calc();

		int x = 3;

		int expected = 9;

		int actual = calc.square(x);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void squareRootTest() {
		Calc calc = new Calc();

		int x = 9;

		int expected = 3;

		double actual = calc.squareRoot(x);

		Assert.assertEquals(expected, actual, .0001);
	}

	@Test
	public void exponentsTest(){
		Calc calc = new Calc();

		int x = 3;
		int y = 2;

		double expected = 9;

		double actual = calc.exponents(x,y);

		Assert.assertEquals(expected, actual, .0001);
	}

	@Test
	public void sineMethodTest() {
		Calc calc = new Calc();

		int x = 3;

		double expected = Math.sin(3);

		double actual = calc.sineMethod(x);

		Assert.assertEquals(expected,actual, .0001);
	}
}
