package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class ListenersExample12 implements ITestListener {
	
	 public void ontestsuccess (ITestResult result) {
	  System.out.println("test case is failed"); }
	  
	 public void ontestskipped (ITestResult result) {
	 System.out.println("test case is skipped"); }
	  
	 public void ontestbutwithinsuccesspercentage (ITestResult result){
	  System.out.println("test case is skipped"); }
	 
	 public void onstart (ITestResult context) {
	 System.out.println("before everything"); }
	 
	  public void onfinish (ITestResult context) {
	  System.out.println("after everything"); 
	  }
}
