package verifyingLMSdata;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	public static void BrokenLinks() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaurg\\eclipse-workspace\\hi-selenium\\src\\test\\resources\\driver2\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https:");
		
	}
	
public static void main(String[] args) throws InterruptedException {

		
		    BrokenLinks();
		
}
}
