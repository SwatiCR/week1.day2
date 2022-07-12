package week1.day2;

import week1.day1.Browser;

public class Chrome {
	public static void main(String[] args)
	{
		Chrome mainRef = new Chrome();
		mainRef.getBrowserName();
	}
	public void getBrowserName()
	{
		Browser obj_ref = new Browser();
		String browserName = obj_ref.getName();
		System.out.println(browserName);
	}

}
