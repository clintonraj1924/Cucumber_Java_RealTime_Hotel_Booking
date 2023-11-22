package com.runner;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features=".//Feature/Cancellation.feature",
		glue="com.step",
		dryRun=true,
		plugin= {"pretty", 
				"html:test-output"}
		)


public class RunnerClass {

}
