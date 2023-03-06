package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.Browser;

import core.BaseSelenium;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		glue = "steps",		
		tags = "",     //pode ser usar o parametro ~ antes do a@ Explo  "~@ignore"  neste caso ele ira ignorar o cenario que tiver esta tag
		plugin = {"pretty","html:target/report.html", "json:target/report.json"},    //opção para executar pelo cucumber e reports
		snippets = SnippetType.CAMELCASE  
		
		
		)   

public class Runner {
		
	@BeforeClass
	public static void iniciaCargaDeTeste() {
		BaseSelenium.iniciaChrome();
	}
	
	@AfterClass
	public static void finalizaTestes() {
		BaseSelenium.fechaNavegador();
		
}
}