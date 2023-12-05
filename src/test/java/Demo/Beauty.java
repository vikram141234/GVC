package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Beauty {

	@Test
	public void beauty()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tkmaxx.com/uk/en/");
		driver.manage().window().maximize();
		
		WebElement beauty = driver.findElement(By.xpath("(//a[@title='Beauty'])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(beauty).perform();
		
		List<WebElement> element = driver.findElements(By.xpath("//div[@class='level-1-navigation-container ']"));
		
		for(WebElement ele : element)
		{
			System.out.println(ele.getText());
		}
		
	}
}
