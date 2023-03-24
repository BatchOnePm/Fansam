package FacebookLocater;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class goole {
	
	public static void main(String[]args) {
		
	
	ChromeOptions co = new ChromeOptions();
	   
       co.addArguments("--remote-allow-origins=*");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com/");
       System.out.println(driver.getTitle());
	
	}
}
