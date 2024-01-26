package com.SwagLab.testScripts;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SwagLab.generic.BaseClass;

@Listeners(com.SwagLab.generic.ListernerImplementation.class )

public class Cart {
	
	@Test
	
	
	public void Cartpehla() {
		
	Reporter.log("First method of Cart Class", true);
	}

	@BeforeClass
	
	public void acartt() {
		
	Reporter.log("Before cart class ka method", true);
	}
	
		
	}
	
	
	
	
	

