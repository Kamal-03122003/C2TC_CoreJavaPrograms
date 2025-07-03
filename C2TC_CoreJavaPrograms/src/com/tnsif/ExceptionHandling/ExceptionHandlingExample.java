package com.tnsif.ExceptionHandling;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		try {
			int a[] = {2,7,4,8};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("This is a Exception");
		}
	}

}
