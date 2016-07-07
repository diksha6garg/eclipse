package demoProject;

import java.util.Scanner;

public class calculatorClass implements calculator {

	@Override
	public Integer add(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		int value;
		value=val1+val2;
		return value;
	}

	@Override
	public Integer subtract(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		int value;
		value=val1-val2;
		return value;
		
	}

	@Override
	public Long multiply(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		
	
		int value;
		value=val1*val2;
		return (long)value;
	}

	@Override
	public Integer divide(Integer val1, Integer val2) throws ArithmeticException {
		// TODO Auto-generated method stub
		int value;
		value=val1/val2;
		return value;
	}
	
	public static void main(String[] args)
	{
		calculator obj=new calculatorClass();
		Integer val1,val2,choice;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first value:");
		val1=input.nextInt();
		System.out.println("Enter second value:");
		val2=input.nextInt();
		System.out.println("Enter your selection: 1) Addition \n 2) Subtraction \n 3) Multiplication \n 4) Division:");
		choice=input.nextInt();
		
		switch(choice){
		
		case 1:
			System.out.println(obj.add(val1, val2));
			break;
			
		case 2:
			System.out.println(obj.subtract(val1, val2));
			break;
			
		case 3:
			System.out.println(obj.multiply(val1, val2));
			break;
			
		case 4:
			try{
				System.out.println(obj.divide(val1, val2));
				break;
			}catch(ArithmeticException e)
			{
				System.out.println("Can't divide by zero");
				break;
			}
			
		default:
			System.out.println("Incorrect option");
			
		}
		System.out.println("Done");
	}

}
