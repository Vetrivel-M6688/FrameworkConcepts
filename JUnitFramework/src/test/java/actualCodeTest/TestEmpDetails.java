package actualCodeTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import actualCode.EmpBusinessLogic;
import actualCode.EmployeeDetails;

public class TestEmpDetails {

	EmployeeDetails emDetails = new EmployeeDetails();
	EmpBusinessLogic businessLogic = new EmpBusinessLogic();

	@Test
	public void testCalcAppraisal() {

		emDetails.setName("Vetrivel");
		emDetails.setAge(25);
		emDetails.setSalary(15000);

		double calcAppraisal = businessLogic.calculateAppraisal(emDetails);
		System.out.println(calcAppraisal);
		assertEquals(1000, calcAppraisal, 0.0);
	}

	@Test
	public void testCalcYearlySalary() {
		
		emDetails.setName("Vijay");
		emDetails.setAge(25);
		emDetails.setSalary(9000);
		
		double yrlySalary = businessLogic.calculateYearlySalary(emDetails);
		assertEquals(108000, yrlySalary, 0.0); // 0.0 is used because digit double cannot converted, as floating number reference 0.0 used
	}

}
