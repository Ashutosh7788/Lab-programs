import java.util.*;
 interface polygon{
  void getArea(int length, int breadth);
  }
 class rectangle implements polygon{
  public void getArea(int length, int breadth){
     System.out.println("Area of rectangle="+(length*breadth));
     }
    }
 class main{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the length and breadth of rectangle:");
  int length=sc.nextInt();
  int breadth=sc.nextInt();
  rectangle r= new rectangle();
  r.getArea(length,breadth);
  }
}
