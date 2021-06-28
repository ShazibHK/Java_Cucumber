package testingLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class totalMarks {


	@Given("I want to enter marks of six subject of a student")
	public void i_want_to_enter_marks_of_six_subject_of_a_student() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("inside:I want to enter marks of six subject of a student");
	}

	@When("I click on create total")
	public void i_click_on_create_total() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("inside:I click on create total");
	}

	@Then("I should get total marks")
	public void i_should_get_total_marks() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("inside:I should get total marks");
	}



}
