package com.bl.employeewage;

	/**
	 * @author Sathish
	 *
	 */
		public class EmployeeComputation {

		public static void main(String[] args) {
			
			System.out.println("Welcome to Employee wage computation program..!");
//			checking whether employee is present 
			int isPresent = 1;
			double empCheck = Math.floor(Math.random() * 10) % 2;
			
			if (empCheck == isPresent)
				System.out.println("Employee is present..");
			else
				System.out.println("Employee is absent..");
		}
	}
