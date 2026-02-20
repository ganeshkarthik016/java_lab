class shape{
  String shapename;
  shape(String shapename){
  this.shapename = shapename;
  }
  double area(){
  return 0.0;
  }
  boolean islarge(shape s){
  if (s.area()>this.area()) return false ;
  else return true;
  }
}

class rectangle extends shape{
  double length;
  double width;
  rectangle(double l,double width){
   super("rectangle");
   length = l;
   this.width = width;
 }
 double area(){
  return length*width;
 }
 shapename = "rectangle";
}
class circle extends shape{
  double radius;
  circle(double r){
  super("circle");
  radius = r;
 }
 double area(){
  return 3.1416 * radius * radius;
 }
shapename = "circle";

}

public class lab6_1 {
    public static void main(String args[]){
     rectangle s1 = new rectangle(4.0,5.0);
     circle s2 = new circle(3.0);
     shape s = new  rectangle(4.0,5.0);
     System.out.println("Area of rectangle: "+s1.area());
     System.out.println("Area of circle: "+s2.area());
     if  (s1.islarge(s2))  System.out.println("Rectangle is larger than Circle") ;
     else System.out.println("Circle is larger than Rectangle");
     System.out.println("Upcasting");
     System.out.println("Shape type: " + s.shapename);
     System.out.println("Shape Area: " + s.area());
    }
}
