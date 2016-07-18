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
		System.out.println("Printer.print() -->  :" +  getNumber());
	}
	
	
	private Integer getNumber()
	{
		int nextInt = random.nextInt(10);
		System.out.println("Printer.getNumber() generates number  " + nextInt );
		return nextInt;
		
	}
	
}
