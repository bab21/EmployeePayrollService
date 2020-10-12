package com.capgemini.employeepayrollservice;
import java.util.*;

public class EmployeePayrollService {
	private List<EmployeePayrollData> employeePayrollList;
	
	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		this.employeePayrollList=employeePayrollList;
	}
	
	public static void main(String[] args) {
		List<EmployeePayrollData> employeePayrollList=new ArrayList<EmployeePayrollData>();
		EmployeePayrollService employeePayrollService=new EmployeePayrollService(employeePayrollList);
		Scanner consoleInputReader=new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(consoleInputReader);
		employeePayrollService.writeEmployeePayrollData();
	}
	private void readEmployeePayrollData(Scanner consoleInputReader) {
		System.out.println("Enter Employee ID: ");
		int id=consoleInputReader.nextInt();
		System.out.println("Enter Employee Name: ");
		String name=consoleInputReader.next();
		System.out.println("Enter Employee Salary: ");
		double salary=consoleInputReader.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id,name,salary));
		
	}
	private void writeEmployeePayrollData() {
		System.out.println("Employee Payroll Data"+employeePayrollList);
	}
}
