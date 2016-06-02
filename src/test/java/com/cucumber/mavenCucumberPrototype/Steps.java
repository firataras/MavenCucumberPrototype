package com.cucumber.mavenCucumberPrototype;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	@Given("^This is my first dummy given step$")
	public void firststep() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This is my first dummy GIVEN step");
	}

	@When("^This is my second when step$")
	public void secondstep() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is my second  dummy WHEN step");
	}

	@Then("^This is my third then step$")
	public void thirdstep() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is my third dummy THEN step");
	}

}
