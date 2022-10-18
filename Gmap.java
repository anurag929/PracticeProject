/**
 * 
 */
package johogadekhajayega;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author ANURAG
 *
 */
public class Gmap {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANURAG\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/maps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/maps/@22.5411072,88.358912,12z");//invoke browser
		WebElement Loc =driver.findElement(By.xpath("//input[@id='searchboxinput']"));
		Loc.sendKeys("Dhauli");
		Loc.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[4]/div[1]/button")).sendKeys(Keys.ENTER);
		WebElement loc2=driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']"));
		loc2.sendKeys("Balakati");
		loc2.sendKeys(Keys.ENTER);
	}

}
