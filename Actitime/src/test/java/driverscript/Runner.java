package driverscript;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={".//Features/Login.feature"},
		glue={"com.actitime.StepsDefinition"},
		plugin= {"json:target/cucumber.json"}
	
		)
public class Runner {

}



		
