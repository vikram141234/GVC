package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clearance {

	@Test
	public void clearance()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tkmaxx.com/uk/en/");
		driver.manage().window().maximize();
		
		WebElement clearance = driver.findElement(By.xpath("(//a[@title='Clearance'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(clearance).perform();
		
		List<WebElement> element = driver.findElements(By.xpath("//div[@id='ClearanceCategoryLink']"));
		
		for(WebElement ele : element)
		{
			System.out.println(ele.getText());
		}
		
	}
}
