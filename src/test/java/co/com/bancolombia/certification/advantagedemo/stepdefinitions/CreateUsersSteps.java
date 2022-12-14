package co.com.bancolombia.certification.advantagedemo.stepdefinitions;


import co.com.bancolombia.certification.advantagedemo.questions.ValidateText;
import co.com.bancolombia.certification.advantagedemo.tasks.CreateUsers;
import co.com.bancolombia.certification.advantagedemo.tasks.Login;
import co.com.bancolombia.certification.advantagedemo.utils.MyDriversWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import static co.com.bancolombia.certification.advantagedemo.utils.Constans.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.GivenWhenThen;
public class CreateUsersSteps {
    @Given("^I want to go to the page of Advantage demo$")
    public void iWantToGoToThePageOfAdvantageDemo() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_PAGE);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThepage(URL)));
    }

    @When("^I enter the information to create the user$")
    public void iEnterTheInformationToCreateTheUser() {
        theActorInTheSpotlight().attemptsTo(CreateUsers.createUsers(),
                Login.logeo());
    }

    @Then("^I validate the correct user creation$")
    public void iValidateTheCorrectUserCreation() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateText.valText()));
    }
}
