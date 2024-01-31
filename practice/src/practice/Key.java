package practice;

import java.util.Scanner;
import java.lang.String;

class Key {

	 public String name;
	private double costPerDay;
	private double deposit;

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public void display() {
		
	

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name");
		name = scan.next();
		System.out.println("Enter costPerDay ");
		costPerDay = scan.nextDouble();
		System.out.println("Enter deposit");
		deposit = scan.nextDouble();
		
		
		
		System.out.println();
		

	}
}
