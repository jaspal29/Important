package qait.task.gitautomate;

import java.io.File;
import java.io.IOException;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckInTest {
  @Test(dataProvider = "test1")
  public void f(WebDriver driver,String Url) throws InterruptedException, IOException  {
	  driver.get(Url);
	String CloneUrl=Url+".git";
	
	Process pi = Runtime.getRuntime().exec("chmod +x /home/jaspalchandramola/Desktop/Clone.sh");
	 pi.destroy();		
	  Process p = new ProcessBuilder("/home/jaspalchandramola/Desktop/Clone.sh",CloneUrl,"/home/jaspalchandramola/Desktop","Vibhav").start();
       int rc = p.waitFor();
  System.out.println(rc);
  
  
  }
  @DataProvider(name = "test1")
  public static Object[][] primeNumbers() {
     return new Object[][] {{new FirefoxDriver(),"https://github.com/jaspal29/Advance"}};
  }

}
