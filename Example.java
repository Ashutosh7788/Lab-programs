class Example 
{
 int number;
 String name;
 Example(int num,String str)
  {
   this.number=num;
   this.name=str;
  }
 Example(Example obj)
 {
  this.number=obj.number;
  this.name=obj.name;
 }
}
 class main
 {
   public static void main(String[] args)
 {
 Example obj1= new Example(19,"Ashutosh");
 Example obj2= new Example(obj1);
 System.out.println("Number="+ obj2.number+"Name="+ obj2.name);
 }
}

