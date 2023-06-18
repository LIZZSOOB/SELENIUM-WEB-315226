//SESIÓN 3 Reedirecciona al navegador de google y realiza la busqueda de lo que se pide
//y se esfecifica dentro del google page
package Scripts;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Poms.GooglePage;
import Poms.TAP;
public class Sesion3 {
	private WebDriver driver;
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);	}
	@Test
	public void test() throws InterruptedException {
		driver.get("https:/www.google.com");
		GooglePage gp = new GooglePage(driver);
		TAP tap = new TAP(driver);
		Thread.sleep(1000);
		//Se desea buscar:
		gp.typeOnSearchBar("Selenuim webdriver");
		Thread.sleep(1000);
		gp.clicResultById(0);
		//gp.printTitle();
		tap.clickAlertButton();
		Thread.sleep(1000);
		tap.acceptAlert();
		Thread.sleep(2000);
		tap.printFirstText();
		Thread.sleep(1000);
		tap.clickButton();
		Thread.sleep(1000);
		tap.dismissAlert();
		Thread.sleep(2000);
		tap.printFirstText();
	}
	@After
	public void teardown() {
		
		//driver.quit();
	}
}
