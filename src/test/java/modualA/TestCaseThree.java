package modualA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseThree {
  @Test(priority=1,groups= {"smoking","P1"})
  public void one() {
	  System.out.println("Test case 1 --class3");
	  //Assert.assertEquals(false, true);
  }
  
  @Test(priority=2,groups="P2")
  public void two() {
	  System.out.println("Test case 2 --class3");
  }
  
  @Test(priority=3,groups="P2")
  public void three() {
	  System.out.println("Test case 3 --class3");
  }
  
  @Test(priority=4,groups="P2")
  public void four() {
	  System.out.println("Test case 4 --class3");
  }
}
