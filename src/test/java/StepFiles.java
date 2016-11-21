package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepFiles {

@Given("^Numbers are (\\d+) and (\\d+) and operation is +$")
public void Numbers_are_and_and_operation_is_add(int arg1, int arg2) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}
		
@When("^I hit calculate$")
public void I_hit_calculate() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^the total sum should be (\\d+)$")
public void the_total_sum_should_be(int arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Given("^Numbers are (\\d+) and (\\d+) and operation is -$")
public void Numbers_are_and_and_operation_is_sub(int arg1, int arg2) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Given("^Numbers are (\\d+) and (\\d+) and operation is \\*$")
public void Numbers_are_and_and_operation_is_mul(int arg1, int arg2) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}


}
