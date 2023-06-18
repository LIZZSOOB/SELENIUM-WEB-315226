package Scripts;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sesion4 {
    private WebDriver driver;
    private Poms.AmazonPOM AmazonPOM;
    @Before
    public void setup() {
    	ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        //Instancia del WebDriver
        driver = new ChromeDriver(options);
        // POM de Amazon
        AmazonPOM = new Poms.AmazonPOM(driver);
    }
    @Test
    public void testAmazonProductSearch() {
        //ABRIR AMAZON
        AmazonPOM.navigateToAmazon();
        //PRODUCTO
        AmazonPOM.searchProduct("Celulares");
        // Hacer clic en el primer producto en los resultados de búsqueda
        AmazonPOM.clickOnProductLink(0);
        //Producto (nombre)
        String productName = AmazonScript.getProductName();
        System.out.println("El nombre del producto es: " + productName);
        // Realizar una búsqueda de los celulares más baratos
        AmazonPOM.searchProduct("Celulares baratos");
        // Hacer clic en el primer producto en los resultados de búsqueda de celulares baratos
        AmazonPOM.clickOnProductLink(0);
        // Obtener el nombre del celular más barato
        String cheapestProductName = AmazonPOM.getProductName();
        System.out.println("El celular más barato es: " + cheapestProductName);
    }
    @After
    public void cleanup() {
        // Cerrar ventana navegador
        driver.quit();
    }
}