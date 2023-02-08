/**
 * @author Nick Garrels - nrgarrels
 * CIS175 - Spring 2023
 * 2/7/2023
 */
package model;

public class Calculator {
	//private variables
	private int number1;
	private int number2;
	private int number3;
	private int number4;
	private int sum;
	
	//default no arg
	public Calculator() {
		super();
		
	}

	//Constructor
	public Calculator(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.sum = number1 + number2;
	}

	public Calculator(int number1, int number2, int number3, int number4) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.sum = number1 + number2;
	}
	
	//getters and setters
	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getNumber3() {
		return number3;
	}

	public void setNumber3(int number3) {
		this.number3 = number3;
	}

	public int getNumber4() {
		return number4;
	}

	public void setNumber4(int number4) {
		this.number4 = number4;
	}

	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "Sum of " + number1 + " and " + number2 + " is " + sum;
	}
	
	

}
