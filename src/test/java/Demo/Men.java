package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Men {

	@Test
	public void men()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tkmaxx.com/uk/en/");
		driver.manage().window().maximize();
		
		WebElement men = driver.findElement(By.xpath("(//a[@title='Men'])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(men).perform();
		
		List<WebElement> element = driver.findElements(By.xpath("//div[@id='MenCategoryLink']"));
		
		for(WebElement ele : element)
		{
			System.out.println(ele.getText());
		}
		
	}
}
