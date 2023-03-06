package core;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BaseSelenium {

	
	protected static String navegador = Browser.CHROME.toString();
	private static long timeOut = 20;
	protected static String url = "https://www.carteiraglobal.com/";
	private static String chromeAgent = "webdriver.chrome.driver";
	private static String caminhoDoPrintErro = System.getProperty("user.dir") + File.separator +"target" + File.separator
			+ "screnshot" + File.separator;
	public static String caminhoDoPrintOk = System.getProperty("user.dir") + File.separator +"target" + File.separator
			+ "screnshot" + File.separator + "PrintsConcluido" + File.separator;
	private static String caminhoDriver = System.getProperty("user.dir") + File.separator + "src" + File.separator
			+ "driver" + File.separator + "chromedriver.exe";
	protected static WebDriver driver;
	@SuppressWarnings("unused")
	private static WebDriverWait wait;

	public static void iniciaChrome() {
		System.setProperty(chromeAgent, caminhoDriver);
		driver = new ChromeDriver();
		
		
	}
	
	
	public static void inicializador() {
		if (driver == null) {
			iniciaChrome();
		}
	}

	public static void fechaNavegador() {
		driver.quit();
		
		
		
	}
	public static void proximaAba() {
		driver.switchTo().newWindow(WindowType.TAB);
	}
	
	
	public static void fechaChrome() {
		if (driver != null) {
			if (System.getProperty("os.name").toLowerCase().contains("windows"))
				finalizarNavegadorWindows();
			else
				finalizarNavegadorLinux();
			driver = null;
		}
	}
	
	private static void finalizarNavegadorLinux() {
		if (navegador.toUpperCase().equals("CHROME")) {
			finalizarProcessoChromeLinux();
		} else if (navegador.toUpperCase().equals("FIREFOX")) {
			finalizarProcessoFirefox();
		}
	}
	
	
	private static void finalizarNavegadorWindows() {
		if (navegador.toUpperCase().equals("CHROME")) {
			finalizarProcessoChrome();
		} else if (navegador.toUpperCase().equals("FIREFOX")) {
			finalizarProcessoFirefox();
		}
	}
	
	private static void finalizarProcessoChromeLinux() {
		try {
			Process process = Runtime.getRuntime().exec("pkill chrome");
			@SuppressWarnings("resource")
			Scanner leitor = new Scanner(process.getInputStream());
			while (leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private static void finalizarProcessoFirefox() {
		try {
			Process process = Runtime.getRuntime().exec("taskkill /f /im geckodriver.exe");
			@SuppressWarnings("resource")
			Scanner leitor = new Scanner(process.getInputStream());
			while (leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private static void finalizarProcessoChrome() {
		try {
			Process process = Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
			@SuppressWarnings("resource")
			Scanner leitor = new Scanner(process.getInputStream());
			while (leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public WebElement procurar(By elemento) {
		return driver.findElement(elemento);

	}

	
	public void clicar(By elemento) {
		procurar(elemento).click();
	}

	public void escreveNoCampo(By elemento, String textoParaSerDigitado) {
		procurar(elemento).sendKeys(textoParaSerDigitado);
	}

	public String extrairTextoDoElemento(By elemento) {
		return procurar(elemento).getText();
	}

	public void comboBoxPorTexto(By elemento, String itemDoCombo) {
		comboBox(elemento).selectByVisibleText(itemDoCombo);
	}

	public void comboBoxPorValor(By elemento, String valorDoCombo) {
		comboBox(elemento).selectByValue(valorDoCombo);
	}

	public void comboBoxPorIndex(By elemento, int indexDoCombo) {
		comboBox(elemento).selectByIndex(indexDoCombo);
	}

	private Select comboBox(By elemento) {
		return new Select(procurar(elemento));
	}

	public void navegarParaUrl() {
		driver.navigate().to(url);
		maximize();
	}

	public Navigation navegador() {
		return driver.navigate();
	}

	public void urlDoSite(String urlDoSite) { //String urlDoSite
		navegador().to(urlDoSite);
	}

	public void botaoVoltarDoNavegador() {
		navegador().back();
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	
	public WebElement esperarSerVisivel(By elemento) {
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.presenceOfElementLocated(elemento));
	}
	public WebElement esperarSerClicavel(By elemento) {
		return new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.elementToBeClickable(elemento));
	}

	public WebElement esperarElementoExistir(By elemento) {
		return new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.visibilityOf(procurar(elemento)));
	}

	public WebElement aguardaElementoDinamico(By elemento){
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(15))
			.pollingEvery(Duration.ofSeconds(20))
			.ignoring(NoSuchElementException.class);
		
			return wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
	}

	public Boolean aguardaElementoDinamicoPorTexto(By elemento){
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(15))
			.pollingEvery(Duration.ofSeconds(2))
			.withMessage("Concluido")
			.ignoring(NoSuchElementException.class)
			.ignoring(TimeoutException.class);
			
			return wait.until(ExpectedConditions.textToBePresentInElementLocated(elemento,"concluido"));
}
	public String extrairAtributo(By elemento, String atributo) {
		return procurar(elemento).getAttribute(atributo);
	}
	
	public Boolean esperarElementoSelect(By elemento) {
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.elementToBeSelected(procurar(elemento)));
		}
	public Boolean esperarSelect(By elemento) {
		return new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeSelected(procurar(elemento)));
	}
	
	public void moverParaElemento(By elemento) {
		Actions action = new Actions(driver);
		WebElement element = procurar(elemento);
		action.moveToElement(element).build().perform();

	}
	public void moverParaElemento(WebElement elemento) {
		Actions action = new Actions(driver);
		action.moveToElement(elemento).click().build().perform();
}
	public Boolean existe(By elemento) {
		try {
			return !driver.findElements(elemento).isEmpty();
		} catch (Exception e) {
			return false;
		}
	}
	public void tirarPrintDaTela() throws IOException {
		File print = ((TakesScreenshot) BaseSelenium.driver).getScreenshotAs(OutputType.FILE);
		File destino = new File(caminhoDoPrintErro + "test" + new Random().nextInt(20) + ".png");
		FileUtils.copyFile(print, destino);
	
	}
	public void tirarPrintPassou() {
		File print = ((TakesScreenshot) BaseSelenium.driver).getScreenshotAs(OutputType.FILE);
		File destino = new File(caminhoDoPrintOk + "test" + new Random().nextInt(20) + ".png");
		try {
			FileUtils.copyFile(print, destino);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public void esperarPadrao (int tempoEmSegundos) {
			try {
				Thread.sleep(tempoEmSegundos * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		public void mudarPagina (String indice) {
			indice = driver.getCurrentUrl();
			driver.switchTo().window(indice);
		}
		
		public void mudarFrame() {
			
		}
		public void trocarJanela(Integer indice) {
				Set<String> handles = driver.getWindowHandles();
				Object[] it = handles.toArray();
				driver.switchTo().window((String) it[indice]);
		}	
		
		public static WebDriver getDriver() {
			return driver;	
		}
		
		public void moverParaElementoeClicar(WebElement elemento, String descricaoDoPasso) {
			WebDriver driver = null;
			Actions action = new Actions(((BaseSelenium) driver).getDriver());
						action.moveToElement(elemento).click().perform();
				
		}
			
		
}