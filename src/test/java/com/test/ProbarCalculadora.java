package com.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class ProbarCalculadora {

    int numero1;
    int numero2;

    int actualAnswer;

    @Given("numero1 is {int} and numero2 is {int}")
    public void today_is(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @When("I do the sum")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = Calculadora.sumar(this.numero1, this.numero2);
    }

    @Then("I should return {int}")
    public void i_should_be_told(int expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
