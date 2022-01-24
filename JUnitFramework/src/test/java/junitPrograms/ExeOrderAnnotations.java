package junitPrograms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExeOrderAnnotations {
@Test
public void testMethod1() {
	System.out.println("I am Test annotated Method1");
}
@BeforeClass
public static void beforeClassMethod() {
	System.out.println("I am BeforeClass annotated method");
}
@AfterClass
public static void afterclassMethod() {
	System.out.println("I am AfterClass annotated method");
}
@Before
public void beforeMethod() {
	System.out.println("I am Before annotated method");
}
@After
public void afterMethod() {
	System.out.println("I am After annotated method");
}
@Test
public void testMethod2() {
	System.out.println("I am test annotated method2");
}
}
