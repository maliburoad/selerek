package seler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class TC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String baseURL = "https://www.qiagen.com/userregistration/form/personal";
		String email = "vip45@wp.pl";
		String password = "Qiagen1234!";
		
		//System.setProperty("webdriver.gecko.driver", "/home/gros/eclipse/firefox/geckodriver");
		System.setProperty("webdriver.gecko.driver", "c:\\tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//lets start
		driver.get(baseURL);
		
		//co to jest
        WebDriverWait wait;
        wait = new WebDriverWait(driver, 2);
        //co to jest
        
        driver.findElement(By.xpath("/html/body/urs-root/div/main/urs-registration/urs-form-personal/section/form/div/button")).click();
        System.out.println(driver.findElement(By.xpath("/html/body/urs-root/div/main/urs-registration/urs-form-personal/section/form/fieldset[1]/div/div[1]/urs-field-with-errors/div/p")).getText());


	}

}