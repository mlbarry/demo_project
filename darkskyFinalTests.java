package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.web_pages.DarkSky;
import framework.web_pages.HomePage;
import org.testng.Assert;

import static org.testng.Assert.*;

public class darkskyFinalTests extends HomePage{
        private HomePage homePage = new HomePage();
        private DarkSky darksk = new DarkSky();

        @Given("^I am on Darksky home page$")
        public void searcHomePage() {

            Assert.assertEquals(SharedSD.getDriver().getTitle(), "DarkSkyFinal");
        }

        @Then("^I verify timeline is displayed with two hours incremented")
        public void verifyTimeline() {

            darksk.setVerifyTimeline();
        }

        @Given("^I am on Darksky Home Page$")
        public void setHomePage() {

            Assert.assertEquals(SharedSD.getDriver().getTitle(), "DarkskyFinal");
        }

        @When("^I expand todays timeline$")
        public void expendTodayTimeline() {
            expendTodayTimeline();
        }

        @Then("^I verify lowest and highest temp is displayed correctly$")
        public void verifyLowerAndHigher() { verifyLowerAndHigher();

        }

}