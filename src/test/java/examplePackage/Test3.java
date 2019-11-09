package examplePackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void add()
	{
		System.out.println("In Add");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
		System.out.println("Added Value:"+(a+b));
	}
	@Test
	public void sub()
	{
		System.out.println("In Sub");
		int a=10;
		int b=20;
		Assert.assertEquals(10, b-a);
		System.out.println("Subtract Value:"+(b-a));
	}
	@Test
	public void div()
	{
		System.out.println("In Div");
		int a=10;
		int b=20;
		Assert.assertEquals(2, b/a);
		System.out.println("Divide Value:"+(b/a));
	}
	@Test
	public void mul()
	{
		System.out.println("In Mul");
		int a=10;
		int b=20;
		Assert.assertEquals(200, a*b);
		System.out.println("Multiplied Value:"+(b*a));
	}

}
