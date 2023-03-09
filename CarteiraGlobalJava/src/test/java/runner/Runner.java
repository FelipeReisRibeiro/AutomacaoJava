package runner;


import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import core.BaseSelenium;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		plugin = {"pretty","html:target/report.html", "json:target/report.json"},    //opção para executar pelo cucumber e reports
		glue = "",		
		tags = "",     //pode ser usar o parametro ~ antes do a@ Explo  "~@ignore"  neste caso ele ira ignorar o cenario que tiver esta tag
		snippets = SnippetType.CAMELCASE  
		
		
		)   

public class Runner {
	
		
	@BeforeClass
	public static void iniciaCargaDeTeste() {
		BaseSelenium.iniciaChrome();
	}
	
	@AfterClass
	
	public static void finalizaTestes() throws IOException {
		BaseSelenium.fechaNavegador();
		
	}
}