package generimethod1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base1.Base1;

public class genericmethod1 extends Base1 {

	
	public static void right_click(WebElement source)
	{
		Actions act = new Actions(driver);
		act.contextClick(source).build().perform();
	}
	
	public static void click_javascript(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].click();", ele);
	}
	
	
}
