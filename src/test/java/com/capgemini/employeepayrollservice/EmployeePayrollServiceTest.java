package com.capgemini.employeepayrollservice;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.capgemini.employeepayrollservice.EmployeePayrollService.IOService;

public class EmployeePayrollServiceTest {

	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmps= {
				new EmployeePayrollData(1,"Babli",30000),
				new EmployeePayrollData(2,"Nancy",40000),
				new EmployeePayrollData(3,"Sagar",50000)
				};
		
		EmployeePayrollService employeePayrollService=new EmployeePayrollService(Arrays.asList(arrayOfEmps));
		employeePayrollService.writeEmployeePayrollData(IOService.FILE_IO);
		long numberOfEmployees=employeePayrollService.countNumberOfEmployees();
		assertEquals(3,numberOfEmployees);
	}
	
}
