package tax;
import java.util.Scanner;
public class lab1 {
public static Scanner read=new Scanner (System.in);
	public static void main(String[] args) {
		int age,sal;
		double tax;
		 System.out.print("Please enter your age:");
		 age=read.nextInt();
		 System.out.print("Please enter your salary:");
		 sal=read.nextInt();
		
		 if(age>18 && 35>age)
		 {
			 System.out.println("Your tax:"+ (0.16*17000+0.25*(sal-17000)));
		 }

		 if(age>36 && 50>age)
		 {
			 System.out.println("Your tax:"+ (0.16*23000+0.25*(sal-23000)));
		 }
		 

		 if(age>51 && 74>age)
		 {
			 System.out.println("Your tax:"+ (0.16*29000+0.25*(sal-29000)));
		 }
		 

		 if(age>75 && 95>age)
		 {
			 System.out.println("Your tax:"+ (0.16*14000+0.25*(sal-14000)));
		 }
			 
		

	}

}
