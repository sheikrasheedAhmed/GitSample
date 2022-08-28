package testNGSample;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{
	
	/*
	 *Below are the few TestNG listeners:

IAnnotationTransformer ,
IAnnotationTransformer2 ,
IConfigurable ,
IConfigurationListener ,
IExecutionListener,
IHookable ,
IInvokedMethodListener ,
IInvokedMethodListener2 ,
IMethodInterceptor ,
IReporter,
ISuiteListener,
ITestListener .->
	 */
	
    @Override		
    public void onFinish(ITestContext Result) 					
    {		
                		
    }		

    @Override		
    public void onStart(ITestContext Result)					
    {		
       // System.out.println("testcases started execution");    		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
    {		
    		
    }		

    // When Test case get failed, this method is called.		
    @Override		
    public void onTestFailure(ITestResult Result) 					
    {		
    System.out.println("The name of the testcase failed is :"+Result.getName());					
    }		

    // When Test case get Skipped, this method is called.		
    @Override		
    public void onTestSkipped(ITestResult Result)					
    {		
    System.out.println("The name of the testcase Skipped is :"+Result.getName());					
    }		

    // When Test case get Started, this method is called.		
    @Override		
    public void onTestStart(ITestResult Result)					
    {		
    System.out.println(Result.getName()+" test case started");					
    }		

    // When Test case get passed, this method is called.		
    @Override		
    public void onTestSuccess(ITestResult Result)					
    {		
    System.out.println("The name of the testcase passed is :"+Result.getName());					
    }		}
