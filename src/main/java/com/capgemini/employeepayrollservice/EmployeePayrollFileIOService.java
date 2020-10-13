package com.capgemini.employeepayrollservice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeePayrollFileIOService {
	public static String PAYROLL_FILE_NAME="payroll-file.txt";
	
	public void writeData(List<EmployeePayrollData> employeePayrollList) {
		StringBuffer empBuffer=new StringBuffer();
		employeePayrollList.forEach(employee->{
			String employeeDataString=employee.toString().concat("\n");
			empBuffer.append(employeeDataString);
		});
		try {
			Files.write(Paths.get(PAYROLL_FILE_NAME), empBuffer.toString().getBytes());
		}
		catch(IOException e) {
			
		}
	}
	
	public long countEntries() {
		long entries=0;
		try {
			entries=Files.lines(new File("payroll-file.txt").toPath()).count();
		}
		catch(IOException e) {
			System.out.println("Error here");
		}
		return entries;
	}

}
