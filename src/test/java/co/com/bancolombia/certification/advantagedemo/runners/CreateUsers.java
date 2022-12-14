package co.com.bancolombia.certification.advantagedemo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features  = "src/test/resources/Features/create_users.feature",
        glue = "co.com.bancolombia.certification.advantagedemo.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class CreateUsers {
}
