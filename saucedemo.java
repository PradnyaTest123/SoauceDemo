package SeleniumIntroduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pradnyakatkar.PROCENTIA\\DriverChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.saucedemo.com/");
	
		driver.manage().window().maximize();
		
	   //Login using the Standard user credential
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("User logged in sucessfully");
	
		//Add to cart
		driver.findElement(By.id("item_4_title_link")).click();
		System.out.println("Item is selected sucessfully");
		
		
		driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']")).click();
		System.out.println("Item is Added to the cart");
		
		//Click to cart check out
		driver.findElement(By.id("shopping_cart_container")).click();
		
		
		//checkout
		 driver.findElement(By.id("checkout")).click();
		 System.out.println("Checkout: Your Information - title displayed");
		 
		//Enter details name/ last name / Post code
	    driver.findElement(By.id("first-name")).sendKeys("Test12");		
		driver.findElement(By.id("last-name")).sendKeys("user");
		driver.findElement(By.id("postal-code")).sendKeys("BS7 0QB");
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("finish")).click();
		
		//Checkout complete
		driver.findElement(By.className("title")).isDisplayed();
		System.out.println("Checkout: Complete!");
		
		
		//logout 
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		System.out.println("Logout sucessfully");
		
		driver.close();

	}
	

}
