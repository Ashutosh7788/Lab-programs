abstract class MotorBike1{
 abstract void brake();
 }
class SportsBike extends MotorBike1{
 public void brake(){
  System.out.println("Sports Bike Brake");
  }
 }
 class MountainBike extends MotorBike1{
  public void brake(){
   System.out.println("MotorBike Brake");
   }
  }
class Main{
 public static void main(String[] args)
 { 
   SportsBike x = new SportsBike();
   MountainBike y = new MountainBike();
   x.brake();
   y.brake();
   }
  }
