package test;

import org.testng.annotations.Test;

public class MFirstTest {
	
	@Test
	public void first() {
		System.out.println("firts method is invoked");
		System.out.println("firts duplicate  method is invoked");
	}
	
	@Test
	public void second() {
		System.out.println("second method is invoked");
		System.out.println("second duplicate  method is invoked");
	}

}
