package pages;

import org.openqa.selenium.By;

import generimethod1.genericmethod1;

public class submitpage extends genericmethod1 {
	
	public static By userinput = By.id("txtUserName");
	public static By passwordinput = By.name("txtPassword");
	public static By loginbutton = By.xpath("//input[@type ='submit']");
	
	public static void Enteruser_input(String email, By userinput)
	{
		driver.findElement(userinput).sendKeys(email);
	}
	
	public static void Enterpassword_input(String pass, By passwordinput)
	{
		driver.findElement(passwordinput).sendKeys(pass);
	}
	
	public static void Login_click()
	{
		driver.findElement(loginbutton).click();
	}
	

}
