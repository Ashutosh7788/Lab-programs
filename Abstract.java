abstract class Animal{
 abstract void makeSound();
   void eat()
   { 
     System.out.println("Eating");
   }
 }
class Dog extends Animal{
 public void makeSound(){
  System.out.println("Bark");
  }
}
class main
{
 public static void main(String[] args)
 {
  Dog d = new Dog();
  d.makeSound();
  d.eat();
  }
 }
