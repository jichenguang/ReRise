package modualA;

import org.testng.annotations.Test;

public class TestCaseOne {
  @Test(groups= {"smoking","P1"})
  public void testMethod1() {
	  System.out.println("test method 1 of TestCaseOne");
  }

}
