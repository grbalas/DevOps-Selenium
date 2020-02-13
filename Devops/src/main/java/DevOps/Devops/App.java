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
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div/a[1]/i")).click();
		Thread.sleep(1000);
		System.out.println("Getting the wordings");
		Thread.sleep(5000);
		//*[@id="twotabsearchtextbox"]
		//*[@id="tsf"]/div[2]/div[1]/div[1]/div[1]/div/div[2]/input
		//*[@id="tsf"]/div[2]/div[1]/div[1]/div/div[2]/input
		//*[@id="gsc-i-id1"]
		driver.findElement(By.xpath("//*[@id=\"gsc-i-id1\"]")).sendKeys("Selenium");
		System.out.println("Launching the Google");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/form/table/tbody/tr/td[2]/button")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
    	}
}
