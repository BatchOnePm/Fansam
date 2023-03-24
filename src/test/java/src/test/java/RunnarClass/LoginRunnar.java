package RunnarClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\makes\\eclipse-workspace\\oraCucum\\Feature\\Concepts.feature",
		glue = "Stepdef", 
plugin = {"html:Reports/Reports.html"}
)


public class LoginRunnar {

}


