package com.Project_Dummy.Practice;

import org.testng.annotations.Test;

public class MavenProfiling2Test
{
	@Test(groups = "Smoke")
	public void m3Test()
	{
		System.out.println("---test3---");
	}
	
	@Test(groups = "Regression")
	public void m4Test()
	{
		System.out.println("---test4---");
	}
	
	@Test
	public void m5Test()
	{
		System.out.println("---test5---");
	}
	
}
