package uk.visa.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.visa.utility.Utility;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    public ResultPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = " //h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement resultMessage;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement resultMessageForHealthAndCare;
    public String getResultMessage()
    {
      String message =   getTextFromElement(resultMessage);
        log.info("getting Result Message" + resultMessage.toString());
        return message;
    }
    public String getResultMessageforHealthAndCare()
    {
        String element = getTextFromElement(resultMessageForHealthAndCare);
        log.info("Click on next button" + resultMessageForHealthAndCare.toString());
        return element;
    }
   public void confirmResultMessage(String expectedMessage)
   {

   }


}
