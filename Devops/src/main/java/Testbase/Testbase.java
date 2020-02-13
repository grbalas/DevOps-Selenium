/*
 *  Description: Removed the database String from the OS variable, since its already declared globally
 *  Updated by: Feros
 *  Date: 05-08-2019
 */

/*
 * Descirption: Created an object CCR for Currency rates
 * Updated y: Shubha
 * Date: 05-08-2019
 */

package Testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;


import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.xerces.impl.dv.util.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
public class Testbase {
    static Logger logs = Logger.getLogger(Testbase.class);
    public static WebDriver driver;
    public static FileInputStream fip;
    public static Properties prop;
    public static Properties text;
    public static WebElement url;
    public static Document document = new Document();
    public String URL;
    protected static JavascriptExecutor jse = (JavascriptExecutor) driver;
    
    static String path = null;
    protected static String os = null;
     protected static boolean Production=false;

    static boolean excelcount = false;
    static boolean dataPresent = false;

    /*--------------------------------------------------Launch Browser---------------------------------------------------------------------------------------*/
    @BeforeTest
    public static void initialization() throws Throwable
    {
        System.out.println("Initialization Start");
        logs.info("Hello Inside Initilization Page for Logger");

        os = System.getProperty("os.name").toLowerCase();
        System.out.println("Os version is: " + os);
        File f = null;
        File f1 = null;
        if (os.equals("windows 7") || os.equals("windows 10")) 
        {
        	System.out.println("Inside windows 10");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAHANTHGADDAM\\git\\DevOps-Selenium\\Devops\\chromedriver.exe");
            driver = new ChromeDriver();
        } 
        else
        if (os.equals("mac os x")) 
        {
        	System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        	ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
    		driver = new ChromeDriver(options);
        } 
        else 
        	if (os.equals("linux")) 
        	{
        		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        		ChromeOptions options = new ChromeOptions();
        		options.addArguments("disable-infobars");
        		options.addArguments("--no-sandbox");
        		options.addArguments("--start-maximized");
        		options.setBinary("/opt/google/chrome/google-chrome");
        	} 
        	else 
        	{
        		System.out.println("Its inside none of the borwsers");
        	}
    }
}