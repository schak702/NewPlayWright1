package Runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\SHREYACH\\IdeaProjects\\AutomationPlaywright\\src\\test\\resources\\features\\Scenario_playwright.feature"
        ,glue={"C:\\Users\\SHREYACH\\IdeaProjects\\AutomationPlaywright\\src\\test\\java\\StepDefinations\\PlaywrightStepDefinations.java"}
)

public class Runner {

}