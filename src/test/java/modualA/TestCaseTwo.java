package modualA;



import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseTwo {
  @Test(groups="P1")
  public void testMethod2() {
	  System.out.println("test method 2 of TestCaseTwo");
	  
	  Assert.assertTrue(true);
  }
  
}
	

