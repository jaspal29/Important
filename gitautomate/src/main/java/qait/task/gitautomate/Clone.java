package qait.task.gitautomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clone {
	
	
	public static void main(String []args)
	{   WebDriver driver=new FirefoxDriver();
		driver.get("https://github.com/jaspal29/Advance");
		WebElement webElement=driver.findElement(By.xpath("//*[@id=\"js-repo-pjax-container\"]/div[2]/div[1]/div[5]/div[1]/button/span"));
		webElement.click();
		//driver.switchTo().activeElement();
		
		WebElement webElement1=driver.findElement(By.xpath("//*[@id=\"js-repo-pjax-container\"]/div[2]/div[1]/div[5]/div[1]/div/div/div[1]/div/input"));
		System.out.println(webElement1.getText());
		
	}
	
	
	
	

}
