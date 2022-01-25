package junitPrograms;

import org.junit.Ignore;
import org.junit.Test;

public class CallingMethods {

	@Test
	public void testCallingMethod1() {
		System.out.println("I am test calling method1 from Class: CallingMethods");
	}

	@Test
	@Ignore
	public void testCallingMethod2() {
		System.out.println("I am test calling method2 from Class: " + getClass());
		// calling another class test method by using Class name directly only if it is
		// STATIC
		ExeOrderAnnotations.beforeClassMethod();
		ExeOrderAnnotations.afterclassMethod();
	}

	@Test
	public void testCallingMethod3() {
		System.out.println("I am test calling method3 from Class: CallingMethods");
		// calling another class method by creating object, even it is non-static
		ExeOrderAnnotations eoa = new ExeOrderAnnotations();
		eoa.testMethod1();
		eoa.testMethod2();
	}
}
