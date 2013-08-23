package example;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CalculatorSteps {
	private Calculator calc;
	
	@Given("a calculator")
	public void givenACalculator(){
		this.calc = new Calculator();
	}
	
	@When("the first number is <num1> and the second number is <num2>")
	public void whenTheNumbersIs(@Named("num1") int num1, @Named("num2") int num2) {
		this.calc.setArguments(num1, num2);
	}
	
	@Then("the result is <sum>")
	public void thenTheResultIs(@Named("sum") int sum) {
		assertThat(sum, equalTo(this.calc.getSum()));
	}
}
