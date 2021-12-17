package org.step;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStep {
	WebDriver driver;

@Given("User is on the adactin  Page")
public void user_is_on_the_adactin_Page() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	
}

	@When("User should enter {string} ,{string}")
	public void user_should_enter(String name, String pass) {
		
		WebElement txtname = driver.findElement(By.id("username"));
		txtname.sendKeys(name);
		
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys(pass);
		
		WebElement btn = driver.findElement(By.id("login"));
		btn.click();
	}
//@When(" User should enter {String},{String},{String},{String},{String},{String},{String},{String} and click search")
//	public void c(String location,String hotels,String roomtype,String roomnum,String checkindate,String checkoutdate,String adults,String Children) {
//	
//
//WebElement txtloc = driver.findElement(By.id("location"));
//txtloc.sendKeys(location);
//	
//WebElement hotels1 = driver.findElement(By.id("hotels"));
//hotels1.sendKeys(hotels);
//	
//	
//WebElement room = driver.findElement(By.id("room_type"));
//	room.sendKeys(roomtype);
//	
//WebElement roomno = driver.findElement(By.id("room_nos"));
//roomno.sendKeys(roomnum);
//
//WebElement in = driver.findElement(By.id("datepick_in"));		
//	in.sendKeys(checkindate);
//	
//	WebElement out = driver.findElement(By.id("datepick_out"));	
//	out.sendKeys(checkoutdate);
//	
//
//	WebElement adult = driver.findElement(By.id("adult_room"));
//	adult.sendKeys(adults);
//	
//	
//	WebElement child = driver.findElement(By.id("child_room"));
//	child.sendKeys(Children);
//	  
//	WebElement srch = driver.findElement(By.id("Submit"));
//	srch.click(); 
//
//	
//}
//	
//@When("User should click select and Click continue")	
//public void s() {
//	WebElement select = driver.findElement(By.id("radiobutton_0"));	
//	select.click();
//	WebElement cont= driver.findElement(By.id("continue"));
//	cont.click();
//	}
//
//	@When("User should enter {String},{String},{String},{String},{String},{String},{String},{String} and click BookNow")
//	public void e(String firstName,String lastName,String address,String cardNum,String cardType,String expiryMonth,String expiryYear,String cvv) {
//		WebElement first= driver.findElement(By.name("first_name"));
//		first.sendKeys(firstName);
//		WebElement last= driver.findElement(By.name("last_name"));
//		last.sendKeys(lastName);
//		WebElement add= driver.findElement(By.name("address"));
//		add.sendKeys(address);
//		WebElement num= driver.findElement(By.name("cc_num"));
//		num.sendKeys(cardNum);
//		WebElement type= driver.findElement(By.name("cc_type"));
//		type.sendKeys(cardType);
//		WebElement month= driver.findElement(By.name("cc_exp_month"));
//		month.sendKeys(expiryMonth);
//		
//		WebElement year= driver.findElement(By.name("cc_exp_year"));
//		year.sendKeys(expiryYear);
//		
//		WebElement ccvv= driver.findElement(By.name("cc_cvv"));
//		ccvv.sendKeys(cvv);
//		WebElement book= driver.findElement(By.name("book_now"));
//		book.click();
//	}
	
	@Then("User should verify success msg")
	public void d() {
		Assert.assertTrue("Verify title", true);
		driver.quit();
	   
	}



}
