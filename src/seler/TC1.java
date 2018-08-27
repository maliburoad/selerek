package seler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/gros/eclipse/firefox/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//System.out.println("Hello Google...");
		driver.get("https://www.qiagen.com/userregistration/form/personal");		

	}

}