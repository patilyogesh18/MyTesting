package Array;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		int [] marks=new int[5];
		marks[0]=50; // physics
		marks[1]=35; // english
		marks[2]=40; // marathi
		marks[3]=55; // histry
		marks[4]=60; // hindi
		
		System.out.println("============Before Sorting============");
		for(int i=0;i<=4;i++)
		{
			System.out.println(marks[i]);
		}

		Arrays.sort(marks);
		
		System.out.println("============After Sorting============");
		
		for(int i=0;i<=marks.length-1;i++)
		{
			System.out.println(marks[i]);
		}
		
		
		
		System.out.println("============Sorting Des Order============");
		
		for(int i=4;i>=0;i--)
		{
			System.out.println(marks[i]);
		}
		
		
		
	}

}
