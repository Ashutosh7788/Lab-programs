import java.io.*;
import java.util.*;
  class Employee_Details
    {
      public static void main(String[] args)
       {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("enter the name,age,salary and location of the employee: ");
	      String Name = sc.nextLine();
	      int Age = sc.nextInt();
	      double salary= sc.nextDouble();
	      String location = sc.next();
	      System.out.println("Employee Name:"+Name+"\nAge:"+Age+"\nsalary:"+salary+"\nlocation:"+location);
      }
    }

