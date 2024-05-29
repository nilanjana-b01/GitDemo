package SeleniumAcademy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGBasics {
	
	@Test
	public void firstTest()
	{
		System.out.println("First Test");
	}
	
	@BeforeTest
	public void firstToExecute()
	{
		System.out.println("First To execute BEFORE TEST");
	}
	
	@BeforeClass
	public void firstToExecuteBeforeCLass()
	{
		System.out.println("First To execute BEFORE CLASS");
	}
	
	/*@BeforeMethod
	public void firstToExecuteBeforeEachTestCase()
	{
		System.out.println("First To execute before each test case : BEFORE METHOD");
	}*/
	
	@Test
	public void secondTest()
	{
		System.out.println("Second Test");
	}
	
	@AfterClass
	public void lastToExecuteafterCLass()
	{
		System.out.println("Last To execute AFTER CLASS");
	}
	
	@AfterTest
	public void lastToExecute()
	{
		System.out.println("Last To execute after all test cases : AFTER TEST");
	}

}
