package uk.visa.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.visa.utility.Utility;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());
    public ReasonForTravelPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement reasonForVisitListTourismAndFamily;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement reasonForVisitListWorkAcademicVisit;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement resonForVisitIsJoinPartnerAndFamily;
   /* public void selectReasonForVisit(String reason){
        selectByContainsTextFromDropDown(reasonForVisitList,reason);
    }*/
    public void clickOnReasonForVisitTourism()
    {
        clickOnElement(reasonForVisitListTourismAndFamily);
        log.info("Click on ReasonForVisitTourism " + reasonForVisitListTourismAndFamily.toString());
    }
    public void clickOnReasonForVisitAcademic()
    {
        clickOnElement(reasonForVisitListWorkAcademicVisit);
        log.info("Click on ReasonForVisitAcademic " + reasonForVisitListWorkAcademicVisit.toString());
    }
    public void clickOnReasonForJoinPartnerAndFamily()
    {
        clickOnElement(resonForVisitIsJoinPartnerAndFamily);
        log.info("Click on ReasonForJoinPartnerAndFamily" + resonForVisitIsJoinPartnerAndFamily.toString());
    }
    public void clickNextStepButton()
    {
        clickOnElement(nextStepButton);
        log.info("Click on next button" + nextStepButton.toString());
    }

}
