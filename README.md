# demo_project_Mamadou

package framework.web_pages;
import framework.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.util.ArrayList;

public class DarkSkyHomePage extends BasePage {

    private By verifyTimeline = By.xpath("//div[@id='timeline']//div[@class='hours']");
    private By expendTodayTimelineLocator = By.xpath("//a[@class='day'][@data-day='0']//span[@class='toggle']");
    private By verifyMinTemerature = By.xpath("");
    private By verifyHighTemperature = By.xpath("");
    private By verifyLowerTemperature = By.xpath("//div[3]//div[1]//div[2]//div[1]//span[1]//span[1]");
    private By verifyMaxTemperature = By.xpath("//div[@id='week']//div[3]//div[1]//div[2]//div[1]//span[3]");

    public void setVerifyMinTemerature(String minTem) {
        setVerifyMinTemerature(minTem);
        String minTemp = getTextFromElement(verifyMinTemerature);
    }

    public void setVerifyHighTemperature(String highTemp) {
        this.setVerifyHighTemperature(highTemp);
        String highTem = getTextFromElement(verifyHighTemperature);
    }

    public void setVerifyLowerTemperature(String lowerTemperature) {
        this.setverifyLowerTemperature(lowerTemperature);
        String lowerTemp = getTextFromElement(verifyLowerTemperature);
    }

    public void setVerifyMaxTemperature(String maxTemperature) {
        this.setVerifyMaxTemperature(maxTemperature);
        String maxTempature = getTextFromElement(verifyMaxTemperature);
    }

    public void setVerifyTimeline(String timeline) {
        this.setVerifyTimeline(timeline);
        String timeLine = getTextFromElement(verifyTimeline);
    }

    public void clickOnExpandTodayTimeline() {
        clickOn(expendTodayTimelineLocator);
        String low1 = getTextFromElement(expendTodayTimelineLocator);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {

        }
    }

    public void setverifyLowerTemperature(String lowerTemperature) {
        this.setVerifyLowerTemperature(lowerTemperature);
        String lowTemp = getTextFromElement(verifyLowerTemperature);
    }

    public void verifyMaxTemperature(String maxTemperature) {
        this.setVerifyMaxTemperature(maxTemperature);
        String maxTemp = getTextFromElement(verifyMaxTemperature);
    }

    // In this section I want to convert the Strings into numbers to be able to add the 2hours in each hour.

    //this is for the array list of the time expansion

    public void verifyPageTitle() {

        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Dark Sky");
    }

    public void getLists() {
        String strValue = "";
        Integer intValue = Integer.parseInt(strValue);
        ArrayList[] lists = new ArrayList[12];
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 0; i <= 12; i++) {
            intArray[i] = intArray[i] + 2;

        }
    }
}

