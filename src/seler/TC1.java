package seler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String baseURL = "https://www.qiagen.com/userregistration/form/personal";
		String email = "vip45@wp.pl";
		
		System.setProperty("webdriver.gecko.driver", "/home/gros/eclipse/firefox/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//lets start
		driver.get(baseURL);
		
		//co to jest
        WebDriverWait wait;
        wait = new WebDriverWait(driver, 2);
        //co to jest
        
        driver.findElement(By.name("email")).sendKeys(email);


	}

}