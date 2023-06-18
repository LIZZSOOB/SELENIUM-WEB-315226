//HOLA MUNDO 1.1 COMPILA BUSQUEDA DIRECTA EN GOOGLE 
package Scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Hola_mundo {
	private WebDriver driver;
	String searchBarXpath = "//*[@name='q']";
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);	}
	@Test
	public void test() throws InterruptedException {
		driver.get("https:/www.google.com");
		Thread.sleep(3000);
		WebElement searchBar = driver.findElement(By.xpath(searchBarXpath));
		searchBar.sendKeys("Hola Mundo Selenium Webdriver");
		Thread.sleep(3000);
	}
	@After
	public void teardown() {
		//driver.quit();
	}
}
