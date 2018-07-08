package com.tagexample;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@IncludeTags("desktop")
public class TagAnnotationExample {

	@Test
	@Tag("mobile")
	public void test1()
	{
		System.out.println("run in mobile only");
	}
	
	@Test
	@Tag("mobile")
	@Tag("desktop")
	public void test2()
	{
		System.out.println("run in mobile and desktop both");
	}
	
	@Test
	@Tag("desktop")
	public void test3()
	{
		System.out.println("run in only desktop envirnoment");
	}
}
