package com.Project_Dummy.Practice;

import org.testng.annotations.Test;

public class ClassConflict 
{
	@Test
	public void conflict()
	{
		System.out.println("Conflict");
	}
	
	@Test(dependsOnMethods = "conflict")
	public void dependsOnConflict()
	{
		System.out.println("dependent method on Conflict mmethod");
	}
}
