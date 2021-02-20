package RetoTecnico.stepdefinitions;

import RetoTecnico.model.PruebaChoucairData;
import RetoTecnico.tasks.Login;
import RetoTecnico.tasks.OpenUp;
import RetoTecnico.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class PruebaChoucairStepDefintions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Ibra wants to open the Utest page$")
    public void thanIbraWantsToOpenTheUtestPage(List<PruebaChoucairData> pruebaChoucairData) {
        OnStage.theActorCalled("Ibra").wasAbleTo(OpenUp.thePage());
    }


    @When("^register the data in the form$")
    public void registerTheDataInTheForm(List<PruebaChoucairData> pruebaChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(pruebaChoucairData.get(0).getStrfirstName(),pruebaChoucairData.get(0).getStrlastName(),pruebaChoucairData.get(0).getStrEmail(),pruebaChoucairData.get(0).getStrlanguage()));

    }

    @Then("^valid that the user has been created$")
    public void validThatTheUserHasBeenCreated(List<PruebaChoucairData> pruebaChoucairData) {
       OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage(pruebaChoucairData.get(0).getStrUser(),pruebaChoucairData.get(0).getStrPassword()));

    }
}
