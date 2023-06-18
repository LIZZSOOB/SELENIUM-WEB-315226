//SESIÓN 6 ABRIR 5 PESTAÑAS DIFERENTES EN EL NAVEGADOR GOOGLE

package Scripts;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Poms.GooglePage;
import Poms.TAP;
public class Sesion6 {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);	}
	
	@Test
	public void test() throws InterruptedException {
		//driver.get("https://testauto");
		//GooglePage gp = new GooglePage(driver);
		driver.get("https://testautomationpractice.blogspot.com/");
		TAP tap = new TAP(driver);
		Thread.sleep(1000);
		tap.clickWikipediaIcon();
		tap.clickWikipediaIcon();
		tap.clickWikipediaIcon();
		tap.clickWikipediaIcon();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		
		driver.switchTo().window(tabs2.get(1));	
		driver.get("https://www.mercadolibre.com.mx/");
		driver.switchTo().window(tabs2.get(2));	
		driver.get("https://www.youtube.com/");
		driver.switchTo().window(tabs2.get(3));	
		driver.get("https://www.amazon.com.mx/");
		driver.switchTo().window(tabs2.get(4));
		driver.get("https://www.google.com.mx/");
		driver.switchTo().window(tabs2.get(5));
		driver.get("https://open.spotify.com/");
		tap.goToPage("Google", driver, tabs2);
		//System.out.println(driver.getTitle());
//		driver.switchTo().window(tabs2.get(1));			
		//driver.get("https://www.google.com.mx/");
//		driver.get("https://www.youtube.com/");
//		driver.switchTo().window(tabs2.get(0));
//		tap.clickWikipediaIcon();
//		driver.switchTo().window(tabs2.get(1));
//		driver.get("https://www.amazon.com.mx/");
//		driver.switchTo().window(tabs2.get(0));
//		tap.clickWikipediaIcon();
//		driver.switchTo().window(tabs2.get(1));
//		driver.get("https://www.mercadolibre.com.mx/");
//		driver.switchTo().window(tabs2.get(0));
	}
	@After
	public void teardown() {
		//driver.quit();
	}
	
}
