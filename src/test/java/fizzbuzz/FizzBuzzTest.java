package fizzbuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	FizzBuzz fizzBuzz;
	
	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void shouldBeAbleToCreateNewFizzBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void shouldSay1For1() {
		String result = fizzBuzz.say(1);
		assertThat(result, is("1"));
	}

	@Test
	public void shouldSay2For2() {
		String result = fizzBuzz.say(2);
		assertThat(result, is("2"));
	}
	
	@Test
	public void shouldSayFizzFor3() {
		String result = fizzBuzz.say(3);
		assertThat(result, is("Fizz"));
	}
	
	@Test
	public void shouldSayBuzzFor5() {
		String result = fizzBuzz.say(5);
		assertThat(result, is("Buzz"));
	}

	@Test
	public void shouldSayFizzFor6() {
		String result = fizzBuzz.say(6);
		assertThat(result, is("Fizz"));
	}
	
	@Test
	public void shouldSayFizzBuzzFor15() {
		String result = fizzBuzz.say(15);
		assertThat(result, is("FizzBuzz"));
	}
	
}