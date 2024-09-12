import java.io.*;
import java.util.*;
  class Result
    {
      public static void main(String[] args)
       {
         Scanner sc = new  Scanner(System.in);
         System.out.println("Enter your name,five different subject marks:");
         String name = sc.nextLine();
         double m1,m2,m3,m4,m5,percentage;
         m1 = sc.nextDouble();
         m2 = sc.nextDouble();
         m3 = sc.nextDouble();
         m4 = sc.nextDouble();
         m5 = sc.nextDouble();
         percentage = (m1+m2+m3+m4+m5)/5;  
         System.out.println("Name ="+name+"\npercentage="+percentage);  
       }
    }
