import java.util.*;
import f1.core;
import f1.rental;
import f1.exception;
public class app{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 int n;
 System.out.print("Enter number of cars ");
 n = sc.nextInt();
 while(n>0){
  rental_manager r = new rental_manager();
  String vehicle_number;String model;int year;int rent;String type;
  vehicle_number =  sc.nextLine();
  model =  sc.nextLine();
  rent =  sc.nextInt();
  type = sc.nextLine();
  r.add(vehicle_number,model,rent,type);
  }
  for(int i=0;i<vehicle_cnt;i++){
   if(vehicles[i].present){
    System.out.print("Vehicle number : "+vehicles[i].vehicle_number);
    System.out.print("Modle"+vehicles[i].model);
   System.out.print("type"+vehicles[i].type);
    }
 n--;
  }
} 

}