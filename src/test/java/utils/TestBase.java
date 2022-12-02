package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
		
		public static WebDriver driver;
		public static Properties prop;

		public TestBase()
		{
			File file = new File("C:\\Users\\SANTU GOSWAMI\\elipse-workspace4\\CucumberProject\\src\\test\\resources\\global.properties");
			try {
				prop = new Properties();
				FileInputStream fis = new FileInputStream(file);
				prop.load(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
				}
		public static void initializeDriver() {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			   driver=new ChromeDriver();
			
		}
		public static void openBrowser() {
			
			driver.get(prop.getProperty("QAUrl"));
			
		}
		public static void maximizeWindows() throws InterruptedException {
			
			driver.manage().window().maximize();
			Thread.sleep(8000);
		}
		
		
		
		
		
	


}
