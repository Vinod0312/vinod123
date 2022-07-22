package com.stepdefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
public static WebDriver dr;
@Given("User launch Adactin hotel application.")
public void user_launch_Adactin_hotel_application() {
	WebDriverManager.chromedriver().setup();
	dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("https://adactinhotelapp.com/"); 
}

@When("User enters valid {string} and valid {string}")
public void user_enters_valid_and_valid(String string, String string2) {
	dr.findElement(By.id("username")).sendKeys(string);
	dr.findElement(By.id("password")).sendKeys(string2);
}

@When("User clicks login button")
public void user_clicks_login_button() {
	dr.findElement(By.name("login")).click();
}

@Then("User verify the search hotel page displayed")
public void user_verify_the_search_hotel_page_displayed() {
	WebElement verify = dr.findElement(By.xpath("//td[contains(text(),'Welcome')]"));
	String text = verify.getText();
	System.out.println("Search hotel page displayed" + text);
}

@When("User enters invalid {string} and invalid {string}")
public void user_enters_invalid_and_invalid(String string, String string2) {
	dr.findElement(By.id("username")).sendKeys(string);
	dr.findElement(By.id("password")).sendKeys(string2);
}

@Then("User verify the Error message  displayed")
public void user_verify_the_Error_message_displayed() {
	WebElement error = dr.findElement(By.xpath("//b[contains(text(),'Invalid')]"));
	String errorMsg = error.getText();
    System.out.println(errorMsg);
}

@When("User selects the {string},{string},{string},{string},{string},{string},{string},{string}.")
public void user_selects_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	WebElement location = dr.findElement(By.name("location"));

	Select s = new Select(location);
	s.selectByVisibleText(string);

	WebElement hotel = dr.findElement(By.name("hotels"));

	Select s1 = new Select(hotel);
	s1.selectByVisibleText(string2);

	WebElement roomType = dr.findElement(By.name("room_type"));

	Select s2 = new Select(roomType);
	s2.selectByVisibleText(string3);

	WebElement roomNos = dr.findElement(By.id("room_nos"));

	Select s3 = new Select(roomNos);
	s3.selectByVisibleText(string4);

	dr.findElement(By.name("datepick_in")).sendKeys(string5);
	dr.findElement(By.name("datepick_out")).sendKeys(string6);

	WebElement adultRoom = dr.findElement(By.name("adult_room"));
	Select s4 = new Select(adultRoom);
	s4.selectByVisibleText(string7);

	WebElement childRoom = dr.findElement(By.name("child_room"));
	Select s5 = new Select(childRoom);
	s5.selectByVisibleText(string8);

}

@When("User clicks search button")
public void user_clicks_search_button() {
	dr.findElement(By.name("Submit")).click(); 
}

@Then("User verify the select hotel page displayed")
public void user_verify_the_select_hotel_page_displayed() {
	WebElement verify2 = dr.findElement(By.xpath("//td[text()='Select Hotel ']"));
	String t2 = verify2.getText();
	System.out.println("Select Hotel page Displayed" + t2);
}

@Then("User click Select button and continue button")
public void user_click_Select_button_and_continue_button() {
	dr.findElement(By.name("radiobutton_0")).click();
	dr.findElement(By.id("continue")).click();
}

@Then("User verify the Book A Hotel page displayed")
public void user_verify_the_Book_A_Hotel_page_displayed() {
	WebElement texttitle = dr.findElement(By.xpath("//td[text()='Book A Hotel ']"));	
	
	String text1 = texttitle.getText();
	System.out.println(text1); 
}

@When("User enters {string},{string},{string},{string},{string},{string},{string},{string}")
public void user_enters(String firstname, String lastname, String address, String ccno, String cctype1, String ccexpmonth, String expyear, String cvv) {
	dr.findElement(By.name("first_name")).sendKeys(firstname);
	dr.findElement(By.name("last_name")).sendKeys(lastname);
	dr.findElement(By.name("address")).sendKeys(address);
	dr.findElement(By.name("cc_num")).sendKeys(ccno);
	WebElement ccType = dr.findElement(By.id("cc_type"));
	Select s6=new Select(ccType);
	s6.selectByValue(cctype1);
	WebElement expMonth = dr.findElement(By.name("cc_exp_month"));
	Select s7 = new Select(expMonth);
	s7.selectByVisibleText(ccexpmonth);
	WebElement year = dr.findElement(By.name("cc_exp_year"));
	Select s8=new Select(year);
	s8.selectByVisibleText(expyear);
	
	dr.findElement(By.name("cc_cvv")).sendKeys(cvv);
	
}

@When("User click Book Now button")
public void user_click_Book_Now_button() throws InterruptedException {
	dr.findElement(By.name("book_now")).click();
	Thread.sleep(6000);  
}

@Then("User verifies the booked order id displayed")
public void user_verifies_the_booked_order_id_displayed() {
	WebElement orderId = dr.findElement(By.xpath("//input[@id='order_no']"));
	String orderNo = orderId.getAttribute("value");
	System.out.println(orderNo);
}



}
