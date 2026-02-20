class bankacc{
  String name;
  String accountno;
  double balance;
  bankacc(String name,String accountno,double balance){
  this.name = name;
  this.accountno = accountno;
  this.balance = balance;
}
void deposit(double amount){
balance += amount;}
void withdraw(double amount){
if(balance-amount>0) balance -= amount;
else System.out.println("Not enough balance");}
void display(){
System.out.println("Account  holder name : "+name);
System.out.println("Account  holder accountno : "+accountno);
System.out.println("balance : "+balance);}
}
class savingacc extends bankacc{
  double rate;
  savingacc(String accountno,String name,double balance,double rate){
   super(name,accountno,balance);
   this.rate = rate;
  }
  void withdraw(double amount){
   if(balance-amount>1000) balance -= amount;
   else if (balance-amount>0){
   balance -= amount;
   System.out.println("Minimum balance warning!");}
   else System.out.println("Not enough balance");
  }
  void addintrest(){ 
    balance += balance * rate / 100;
  }
}
class currentacc extends bankacc{
  double limit;
  currentacc(String accountno,String name,double balance,double rate){
   super(name,accountno,balance);
   this.limit = limit;
  }
  void withdraw(double amount){
   if(balance-amount>(-1)*limit) balance -= amount;
   else if(balance-amount<(-1)*limit) System.out.println("You crossed your limit!");
  }
  void checkPenalty(){ 
    if(balance<0) System.out.println( "Penalty applicable: overdraft used" );
  }
}
public class lab6_2 {
    public static void main(String args[]){
    savingacc a1 = new savingacc("A101","Riya",2000.0,100.0);
    a1.addintrest();
    a1.display();
    a1.withdraw(1200);
    currentacc a2 = new currentacc("C202","Amit",1500.0,500.0);
   a2.display();

    a2.withdraw(2001.0);
   a2.checkPenalty();
 }
}
