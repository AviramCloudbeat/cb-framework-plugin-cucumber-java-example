package io.cloudbeat.cucumber.glue.other;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class DayDefs {
    private String today;
    private String actualAnswer;
    public String var1 = System.getProperty("firstVar");
    public String var2 = System.getProperty("secondVar");
    public String var3 = System.getProperty("thirdVar");
    
    
    @Given("^today is \"([^\"]*)\"$")
    public void today_is(String today) {
        System.out.println("var1: " + var1 + ";var2: " + var2 + "var3: " + var3);
        this.today = today;
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_is_s_Friday_yet() {
        this.actualAnswer = isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    private static String isItFriday(String today) {
        if (today.equals("Friday")) {
            return "TGIF";
        }
        return "Nope";
    }
}
