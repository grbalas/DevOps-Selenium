package DevOps.Devops;

import org.openqa.selenium.By;

import Testbase.Testbase;

/**
 * Hello world!
 *
 */
public class App extends Testbase
{
    public void test()throws Throwable
    {
    	System.out.println("Getting user.dir" +System.getProperty("user.dir"));
//		driver.get(System.getProperty("user.dir")+"/src/main/java/CEPAT/DEMO/Demo.html");
//		System.out.println("Getting the TExt" +		driver.findElement(By.xpath("/html/body")).getText());
//		driver.findElement(By.xpath("/html/body")).getText();
		driver.get("https://www.google.com");
		System.out.println("Getting the wordings");
		Thread.sleep(5000);
		//*[@id="twotabsearchtextbox"]
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//*[@id=\"lga\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
    	}
}
