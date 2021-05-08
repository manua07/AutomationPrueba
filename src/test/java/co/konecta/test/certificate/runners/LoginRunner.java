package co.konecta.test.certificate.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.konecta.test.certificate.stepsdefinitions",
        features = "src/test/resources/features/login.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)

public class LoginRunner {
}
