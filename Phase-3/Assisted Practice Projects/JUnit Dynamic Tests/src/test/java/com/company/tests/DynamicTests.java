package com.company.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@DisplayName("JUnit 5 Dependency Injection Example")
@RunWith(JUnitPlatform.class)
public class DynamicTests {
		

    @TestFactory
    Collection<DynamicTest> dynamicTests() {
    	return Arrays.asList(
    			dynamicTest("simple dynamic test", new Executable() {
					public void execute()  {
						assertTrue(true);
				}
			}),
    			dynamicTest("My Executable Class", new MyExecutable()),
    			dynamicTest("Exception Executable", new Executable() {
				public void execute() throws Throwable {
					throw new Exception("Exception Example");
				}
			}),
                dynamicTest("simple dynamic test-2",  new Executable() {
    				public void execute() {
    					assertTrue(true);
    				}
    			})
            );
    	}	
}

class MyExecutable implements Executable {

    public void execute() throws Throwable {
            System.out.println("Hello World!");
    }

}

