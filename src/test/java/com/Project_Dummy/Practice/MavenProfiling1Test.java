package com.Project_Dummy.Practice;

import org.testng.annotations.Test;

public class MavenProfiling1Test
{
	@Test(groups = "Regression")
	public void m1Test()
	{
		System.out.println("---test1---");
	}
	
	@Test(groups = "Smoke")
	public void m2Test()
	{
		System.out.println("---test2---");
	}
	
}
