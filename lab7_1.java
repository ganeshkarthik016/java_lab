import java.util.Scanner;
abstract class vehicle{
  String vehicle_no;
  String model;
  int year;
  static int count = 0;
  String type;
  double milage;
  vehicle(String vehicle_no,String model,int year){
   this.vehicle_no = vehicle_no;
   this.model = model;
   this.year = year;
   this.type = "vehicle";
   count++;
  }
  vehicle(String vehicle_no,String model,int year,String type){
   this.vehicle_no = vehicle_no;
   this.model = model;
   this.year = year;
   this.type = type;
   count++;
  }

  double calculatemileage(){
   milage = 0;
return milage;}
  void displayDetails(){
 
   System.out.println("Vehicle number: "+vehicle_no);
  System.out.println("Vehicle model: "+model);
  System.out.println("MRF year : "+year);
  }
}
class car extends vehicle{
 double milage;
String type = "Car";
 car(String vehicle_no,String model,int year,double milage){
 super( vehicle_no, model,year,"car");
 this.milage = milage;
 }
 double calculatemileage(double milage){
  this.milage = milage;
  return milage;
 }
 
 
}
class truck  extends vehicle{
 double milage;
 String type = "Truck";
 truck(String vehicle_no,String model,int year,double milage){
 super( vehicle_no, model, year,"truck");
 this.milage = milage;
 }
 double calculatemileage(double milage){
  this.milage = milage;
  return milage;
 }

 
}
class motercycle extends vehicle{
 double milage;
String type = "Motercycle";
 motercycle(String vehicle_no,String model,int year,double milage){
 super( vehicle_no, model, year,"motercycle");
 this.milage = milage;
 }
 double calculatemileage(double milage){
  this.milage = milage;
return milage;
 }
 

}

public class lab7_1 {
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   vehicle vehicles[] = new vehicle[10];
   int ct = 0;
   while(1==1){
   System.out.println("1. Add a new vehicle");
  System.out.println("2. Display details of all vehicles");
  System.out.println("3. Display total number of vehicles"); 
  System.out.println("4. Exit ");
  System.out.print("choose: ");
   int n;
   n = sc.nextInt();
   switch(n){
    case 1:
    String vehicle_no=sc.next();
    String model=sc.next();
    int year = sc.nextInt();
    double milage = sc.nextDouble();
    String type = sc.next();
    if(type=="Car"){
     car v = new car(vehicle_no,model,year,milage);
     vehicles[ct] = v;
     ct++;
    }
    else if(type=="Truck"){
     truck v = new truck(vehicle_no,model,year,milage);
     vehicles[ct] = v;
     ct++;
    }
    else if(type=="Motercyclee"){
      motercycle v =new motercycle(vehicle_no,model,year,milage);
     vehicles[ct] = v;
     ct++;
    }
    else { 
    System.out.println("Wrong vehicle");
    }
    case 2:
    for(int i =0;i<ct;i++){
   System.out.println("Vehicle number: "+vehicles[i].vehicle_no);
     System.out.println("Vehicle model: "+vehicles[i].model);
    System.out.println("MRF year : "+vehicles[i].year); 
    System.out.println("Type : "+vehicles[i].type);
    }
    case 3:
    System.out.println("count: "+ct);
   case 4:
    break;
   default:
    break;
   }
   
   }
   
  }  
}
