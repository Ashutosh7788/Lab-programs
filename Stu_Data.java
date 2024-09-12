import java.io.*;
import java.util.*;
  class Stu-Data
   {
     string name;
     int age;
     string Branch;
     double E,M,P,IT,C
     student(string name, int age, string branch,double E,double M,double P,double IT, double C
     {
       this.name=name;
       this.age=age;
       this.branch=branch;
       this.E=E;
       this.M=M;
       this.P=P;
       this.IT=IT
       this.C=C;
     }
     void display()
     { 
      double sum=E+M+P+IT,per;
      per=sum/5;
               System.out.println("Name="+name+"\nage="+age+"\nbranch="+branch+"\npercentage="+per);
  if(per>=90)
  System.out.println("O Grade");   
  if(per>=80)
  System.out.println("E Grade");   
  if(per>=70)
  System.out.println("A Grade");   
  if(per>=60)
  System.out.println("B Grade");   
  if(per>=50)
  System.out.println("C Grade");
  if(per>=40)
  System.out.println("D Grade");   
     else 
      System.out.print("Fall");
    }
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the name");
    String name=sc.nextLine();
    System.out.println("Enter the age");
    int age=sc.nextInt();
    System.out.println("Enter the Branch");
    String branch=sc.next();
    System.out.println("Enter the English marks");
    Double E= sc.nextDouble();
     System.out.println("Enter the Math marks");
    Double M= sc.nextDouble();
     System.out.println("Enter the Physics marks");
    Double P= sc.nextDouble();
     System.out.println("Enter the IT ks);
    Double ITc.nextDouble();
     System.out.println("Enter the Chemistry
    Double C sc.nextDouble();
   Student s=new Student(name,age,branch,E,M,P,IT,C);
   s.display();
   }
   }
   
    
