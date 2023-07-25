package uk.visa.pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.visa.utility.Utility;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());
    public DurationOfStayPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//input[@id='response-0']")
    WebElement lessThanSixMonths;
    @CacheLookup
    @FindBy(xpath="//input[@id='response-1']")
    WebElement moreThanSixMonths;
    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
public void selectLengthOfStay(String moreOrLess)
{


    switch (moreOrLess){
        case "more":
            clickOnElement(moreThanSixMonths);
            break;
        case "less":

            clickOnElement(lessThanSixMonths);
            break;
         default:
             System.out.println("enter less or more");
             break;
    }
}
   public void clickNextStepButton()
   {
       clickOnElement(nextStepButton);
       log.info("Clicking on NextStep Button : " +nextStepButton.toString());
   }



}
