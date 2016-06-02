package com.cucumber.mavenCucumberPrototype;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	@Given("^This is my first dummy given step$")
	public void this_is_my_first_dummy_given_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is my first dummy GIVEN step");
	}

	@When("^This is my second when step$")
	public void this_is_my_second_when_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is my second  dummy WHEN step");
	}

	@Then("^This is my third then step$")
	public void this_is_my_third_then_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is my third dummy THEN step");
	}

}
