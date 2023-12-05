package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Christmas {

	@Test
	public void christmas()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tkmaxx.com/uk/en/");
		driver.manage().window().maximize();
		
		WebElement christmas = driver.findElement(By.xpath("(//a[@title='Christmas'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(christmas).perform();
		
		List<WebElement> element = driver.findElements(By.xpath("//div[@id='cmsitem_00268066']"));
		
		for(WebElement ele : element)
		{
			System.out.println(ele.getText());
		}
		
	}
	
}
