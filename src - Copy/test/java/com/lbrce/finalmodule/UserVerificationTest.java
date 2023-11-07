package com.lbrce.finalmodule;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserVerificationTest {
	UserVerification uv=new UserVerification();
	@Test
	public void tetscase1()
	{
		Assert.assertEquals(true,uv.check("usha", "usha@2020"));
	}
	@Test
	public void tetscase2()
	{
		Assert.assertEquals(true,uv.check("usha", "usha@2020"));
	}
	@Test
	public void tetscase3()
	{
		Assert.assertEquals(false,uv.check("usha1", "usha@2020"));
	}
	@Test
	public void tetscase4()
	{
		Assert.assertEquals(false,uv.check("rohit", "usha@2020"));
	}

}
