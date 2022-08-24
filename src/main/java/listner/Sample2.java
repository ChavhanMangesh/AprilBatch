package listner;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listner.Sample1.class)
public class Sample2 
{
	@Test
	public void test1() 
	{
		Assert.assertEquals("abcd", "abcd","act & exp are not matching");
		
		System.out.println("test1 is running");
	}

}
