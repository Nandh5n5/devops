package com.lbrce.finalmodule;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserVerificationTest {
	UserVerification uv=new UserVerification();
	@Test
	public void tetscase1()
	{
		Assert.assertEquals(true,uv.check(" ", ""));
	}
	@Test
	public void tetscase2()
	{
		Assert.assertEquals(true,uv.check("nandini", "nandini@2020"));
	}
	@Test
	public void tetscase3()
	{
		Assert.assertEquals(false,uv.check("nandini", "nandini@2020"));
	}
	@Test
	public void tetscase4()
	{
		Assert.assertEquals(false,uv.check("nandini", "nandini@2020"));
	}

}
