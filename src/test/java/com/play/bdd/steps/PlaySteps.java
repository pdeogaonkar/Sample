package com.play.bdd.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PlaySteps {


    @Given("^Play a learning platform$")
    public void i_have_a_play() throws Throwable {
        //System.out.println("This will print about play");
        
    }

    @When("^I want to learn$")
    public void love_for_play() throws Throwable {
        //System.out.println("This will print love for play");
    }

    @Then("^I open play to learn and earn$")
    public void benefits_of_play() throws Throwable {
        //System.out.println("This will print benefits of play");
    }
}
