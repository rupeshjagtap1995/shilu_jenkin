package base_class;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_class {
	
	@BeforeTest
	public void demo() {
		
		System.out.println("before test running");
	}
	
	@AfterTest
	public void demo1() {
		
		System.out.println("afterb test running ");
	}

}
