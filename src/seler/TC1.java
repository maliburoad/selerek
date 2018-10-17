package seler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class TC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://www.qiagen.com/userregistration/form/personal";
		String mail = "vip44@wp.pl";
		String password = "VerySecretPwd1234!";
		String location = "Poland";
		String title = "Mr.";
		String academic = "Dr.";
		String telephone = "123456789";
		String firstName = "Alpha";
		String lastName = "Omega";
		
		System.setProperty("webdriver.gecko.driver", "/home/gros/eclipse/firefox/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
		
        //to check if page is loaded
        //use Implicit Wait implicity and Explicit Wait + ExpectedConditions where needed
		
        driver.findElement(By.name("email")).sendKeys(mail);
        driver.findElement(By.xpath("/html/body/urs-root/div/main/urs-registration/urs-form-personal/section/form/fieldset[1]/div/div[2]/urs-field-with-errors/div/label/urs-password-field/div/input")).sendKeys(password);
        
        Select dropdown = new Select(driver.findElement(By.name("country")));
        dropdown.selectByVisibleText(location);
        
        driver.findElement(By.xpath("/html/body/urs-root/div/main/urs-registration/urs-form-personal/section/form/fieldset[2]/div/div[2]/urs-field-with-errors/div/label/input")).sendKeys(telephone);

        Select dropdown2 = new Select(driver.findElement(By.name("title")));
        dropdown2.selectByVisibleText("Mr.");
        
        Select dropdown3 = new Select(driver.findElement(By.xpath("/html/body/urs-root/div/main/urs-registration/urs-form-personal/section/form/fieldset[3]/div/div[2]/urs-field-with-errors/div/label/select")));
        dropdown3.selectByVisibleText("Dr."); 
        
        driver.findElement(By.xpath("/html/body/urs-root/div/main/urs-registration/urs-form-personal/section/form/fieldset[4]/div/div[1]/urs-field-with-errors/div/label/input")).sendKeys(firstName);
        driver.findElement(By.xpath("/html/body/urs-root/div/main/urs-registration/urs-form-personal/section/form/fieldset[4]/div/div[2]/urs-field-with-errors/div/label/input")).sendKeys(lastName);   
        driver.findElement(By.xpath("/html/body/urs-root/div/main/urs-registration/urs-form-personal/section/form/div/button")).submit();
        
        //to check if next page is loaded
        //use Implicit Wait implicity and Explicit Wait + ExpectedConditions where needed
        
        driver.findElement(By.xpath("/html/body/urs-root/div/main/urs-registration/urs-form-company/section/urs-collapsible-group/urs-collapsible-panel[2]/a")).click();
        //driver.findElement(By.xpath("/html/body/urs-root/div/main/urs-registration/urs-form-company/section/div/button[2]")).click();
        
        
        //to add text check
        //You are registered for My QIAGEN
        
        //to add check if address already in use and other negative TC's
        
	}

}