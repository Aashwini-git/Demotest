package Smoketesting;

import Base1.Base1;
import pages.submitpage;

public class TC01_Submit extends submitpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		browserinitilization(Base1.Browser, Base1.URL);
		Enteruser_input("test@gmail.com");
		Enterpassword_input("67hjg7");
		Login_click();
		close_browser();
		}

}
