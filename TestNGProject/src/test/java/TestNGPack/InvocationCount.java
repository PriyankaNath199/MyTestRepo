package TestNGPack;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 10)
	public void sum() {
		int a = 4;
		int b =10;
		int c = a+b;
		
		System.out.println(c);
	}
	
	

}
