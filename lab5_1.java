class expression{
 double a,b,c;
 static int i = 0;
  expression(double a,double b){
     this(0,a,b);
   }
  expression(double a,double b,double c){
     this.a = a;
     this.b = b;
     this.c = c;
     i++;
   }
   void display(){
   System.out.print("Expression : ");
     if(a!=0) System.out.print("("+a+")*x^2 + ");
      System.out.print("("+b+")*x + ");
       System.out.println("("+c+")");
  }
  expression combine(expression e2){
    expression e3 = new expression(a+e2.a,b+e2.b,c+e2.c);
    return e3;
  }
  double evaluate(int x){
   double result = a*x*x + b*x + c;
   return result;
  }
  double evaluate(double x){
   double result = a*x*x + b*x + c;
   return result;
  }
  int getCount(){
   return i;
  }
}

public class lab5_1 {
    public static void main(String args[]){
      expression e1 = new expression(2, 3); // 2x + 3
      expression e2 = new expression(1, -4, 2); // x² - 4x + 2
      expression e3 = e1.combine(e2); // combine linear + quadratic
      e1.display();
      e2.display();
      e3.display();
      System.out.println(e3.evaluate(2));
      System.out.println(e1.getCount());
    }
}
