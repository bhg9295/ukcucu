package uk.visa.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.visa.pages.*;

public class VisaConformationSteps {
    @Given("I am on gov.uk  page")
    public void iAmOnGovUkPage() {
    }

    @When("I click  Start new page button")
    public void iClickStartNewPageButton() {
        new StartPage().stratNowButton();
    }

    @And("I select nationality {string}")
    public void iSelectNationality(String countryName) {
     new  SelectNationalityPage().selectNationality(countryName);
    }


    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
       new SelectNationalityPage().clickNextStepButton();
    }

    @And("I Select reason for travel")
    public void iSelectReasonForTravel() {
      new  ReasonForTravelPage().clickOnReasonForVisitTourism();
    }


    @Then("I should  verify message {string}")
    public void iShouldVerifyMessage(String expectedResultMessage) {
        String actualResultMessage = new ResultPage().getResultMessage();
        Assert.assertEquals(actualResultMessage,expectedResultMessage);
    }

    @And("I   Select a Nationality {string}")
    public void iSelectANationalityChile(String country) {
      new  SelectNationalityPage().selectNationality(country);
    }
    @And("I select  a reason Work, academic visit or business")
    public void iSelectAReasonWorkAcademicVisitOrBusiness() {
      new   ReasonForTravelPage().clickOnReasonForVisitAcademic();
    }
    @And("I select longer than {int} months")
    public void iSelectLongerThanMonths(int months) {
      new   DurationOfStayPage().selectLengthOfStay("more");
    }


    @And("I select  have planning to work for Health and care professional")
    public void iSelectHavePlanningToWorkForHealthAndCareProfessional() {
       new  WorkTypePage().clickOnHealthAndCareProvision();
    }

    @Then("I verify the message {string}")
    public void iVerifyTheMessage(String message) {
        String actualSuccessMessage= new ResultPage().getResultMessageforHealthAndCare();
        Assert.assertTrue(actualSuccessMessage.contains(message));
    }


    @When("I  Select a Nationality {string}")
    public void iSelectANationality(String countryc) {
        new SelectNationalityPage().selectNationality(countryc);
    }

    @And("I   Select reason Join partner or family for a long stay")
    public void iSelectReasonJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().clickOnReasonForJoinPartnerAndFamily();
    }

    @And("I Select state My partner of family member have uk immigration status yes")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes() {
      new  FamilyImmigrationStatusPage().selectImmigrationStatus("yes");
    }
}
