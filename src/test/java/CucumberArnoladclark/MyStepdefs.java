package CucumberArnoladclark;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by DIPAK on 4/24/2017.
 */
public class MyStepdefs extends BasePage
{
    @Given("^I am  on already homepage$")
    public void I_am_on_already_homepage()
    {
        openBrowser();
    }

    @When("^I click on find a dealer$")
    public void I_click_on_find_a_dealer() {
       driver.findElement(By.xpath("//a[contains(text(),'Find a dealer')]")).click();
    }

    @Then("^I See find a dealer page load sucessfully$")
    public void I_See_find_a_dealer_page_load_sucessfully() {
        Assert.assertTrue("user not on find a dealer search page",driver.getCurrentUrl().contains("find-a-dealer"));

    }

    @Then("^I enter location or postcode$")
    public void I_enter_location_or_postcode() {
        driver.findElement(By.xpath("//input[@id='branch-location']")).sendKeys("HA8 6BB");

    }

    @Then("^I enter car name$")
    public void I_enter_car_name() {
        driver.findElement(By.xpath("//option[@value='bmw']")).click();

    }

    @When("^I click on find a dealer button$")
    public void I_click_on_find_a_dealer_button() {
     driver.findElement(By.xpath("//button[text()='Find a dealer']")).click();
    }

    @Then("^I see all nearest dealer  sucessfully$")
    public void I_see_all_nearest_dealer_sucessfully() {
     Assert.assertTrue("user not on nearest dealer page",driver.getPageSource().contains("nearest Arnold Clark dealership..."));
    }

}
