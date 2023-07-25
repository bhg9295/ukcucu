package uk.visa.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.visa.utility.Utility;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());
    public WorkTypePage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
            @FindBy(xpath = "//input[@id='response-0']")
            WebElement selectHealthAndCareProvision;
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    public void clickOnHealthAndCareProvision(){clickOnElement(selectHealthAndCareProvision);
        log.info("Click on HealthAndCareProvision" + selectHealthAndCareProvision.toString());}
    public void clickNextStepButton(){clickOnElement(nextStepButton);
        log.info("Click on next button" + nextStepButton.toString());
    }
}
