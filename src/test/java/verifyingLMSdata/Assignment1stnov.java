package verifyingLMSdata;


//import java.time.Duration;
//import java.util.List;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import java.util.ArrayList;
//import java.util.List;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1stnov {
	@Test
	public static void Currency1() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaurg\\eclipse-workspace\\hi-selenium\\src\\test\\resources\\driver2\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		WebDriver chrome = new ChromeDriver();
		chrome.get("http://the-internet.herokuapp.com/tables");
		chrome.manage().window().maximize();
		int noofitems = chrome.findElements(By.xpath("//table[@id=\"table1\"]//tr")).size();
		System.out.println(noofitems);
		ArrayList<String> lastname1 = new ArrayList<String>();
		for(int i=1;i<noofitems;i++) {
			WebElement lastname = chrome.findElement(By.xpath("//table[@id=\"table1\"]//tr["+i+"]/td[1]"));
			String lastnametext = lastname.getText();
			System.out.println("last name is : "+lastnametext);
			//ArrayList<String> lastname1 = new ArrayList<String>();
			lastname1.add(lastnametext);
			
		}
		System.out.println(lastname1);
		ArrayList<String> sortedList = new ArrayList<>();
		for (String s : lastname1) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		System.out.println(sortedList);
		boolean b = true;
		b = sortedList.equals(lastname1);
		System.out.println(b);
		Collections.sort(sortedList, Collections.reverseOrder());
		System.out.println(sortedList);
		boolean c = true;
		c = sortedList.equals(lastname1);
		System.out.println(c);
		System.out.println("Data is there  " + lastname1.contains("doe"));
		ArrayList<String> lowerlastname = new ArrayList<>();
		for (String s : lastname1) {
			lowerlastname.add(s.toLowerCase());
		}
		System.out.println(lowerlastname);
		String searchdata = "Smith";
		System.out.println("Data is there  "+lowerlastname.contains(searchdata.toLowerCase()));
		
	}	
		
	
public static void main(String[] args) throws InterruptedException {

		
			Currency1();
		
}
}
