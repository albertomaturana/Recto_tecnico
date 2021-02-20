package RetoTecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/PruebaChoucair.feature",
        tags = "@stories",
        glue = "RetoTecnico.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}