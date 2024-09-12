import java.util.*;
 class Area_Perimeter
   {
     public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle");
	int length,breadth,Area;
	length=sc.nextInt();
	breadth=sc.nextInt();
	Area=length*breadth;
	System.out.println("Enter length of side");
	int side,area;
	side=sc.nextInt();
	area=side*side;
	System.out.println("area of rectangle="+Area+"\nare of square="+area);
	sc.close();
      }
  }    
  
