package jpl.code.examples.aspject;

import java.util.Random;

public class Printer {

	private Random random = new Random();
	
	public Printer() {
		
	}
	
	public static void main(String[] args) {
		
		Printer printer = new Printer();
		printer.print();
	}
	
	public void print()
	{
		System.out.println("print() method  :" +  getNumber());
	}
	
	
	private Integer getNumber()
	{
		int nextInt = random.nextInt(10);
		System.out.println("getNumber() generates number  " + nextInt );
		return nextInt;
		
	}
	
}
