/*@author= Mayur Adhude*/
package com.qa.freelance.firstcry.com.RetryAnalyzerListener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.qa.freelance.firstcry.com.Base.TestBase;
/*-------------------------purpose----------------------------------------------------------
 
  TestRetryAnalyzerListener class which is implementing the IAnnotationTransformer interface. 
  We will use the public void transform(ITestAnnotation annotation, Class testClass,Constructor testConstructor, Method testMethod) method.
   
  ---> Then this Listener is for calling the TestRetryAnalyzer.class  
  --->TestNg needs this Listener to be known very early, 
      So We will use this directly in TestNG.xml not in our test Class because Listeners can be used in TestClass.
 
  */
public class TestRetryAnalyzerListener extends TestBase implements IAnnotationTransformer {

	@SuppressWarnings("rawtypes")
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(TestRetryAnalyzer.class);
		
	}

}
