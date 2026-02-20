class bankacc{
  String name;
  int id;
  double balance;
  void set(String name,int id,double balance){
  this.name = name;
  this.id = id;
  this.balance = balance;
}
void deposit(double amount){
balance += amount;}
void withdraw(double amount){
if(balance-amount>0) balance -= amount;
else System.out.println("Not enough balance");}
void display(){
System.out.println("Account  holder name : "+name);
System.out.println("Account  holder id : "+id);
System.out.println("balance : "+balance);}
}


public class q1 {
    public static void main(String args[]){
        bankacc ganesh = new bankacc();
        bankacc gayathri = new bankacc();
      ganesh.set("ganesh KARTHIK",54,10000.0);
      System.out.println("balance: "+ganesh.balance);
    ganesh.display();
      ganesh.deposit(1000);
      System.out.println("balance after deposit: "+ganesh.balance);ganesh.display();
      ganesh.withdraw(100);
      System.out.println("balance after withdraw: "+ganesh.balance);ganesh.display();
      gayathri.set("gayathri",52,1000000.0);
      System.out.println("balance: "+ganesh.balance);gayathri.display();
      gayathri.deposit(100000);
      System.out.println("balance after deposit: "+ganesh.balance);gayathri.display();
      gayathri.withdraw(1000);
      System.out.println("balance after withdraw: "+ganesh.balance);gayathri.display();

    }
}
