package f1;
abstract class vehicle {
    String vehicle_number;
    String model;
    int year;
    int rentalperday;
    public static int vehicle_cnt = 0;
    abstract int calculate_milage();
    String type;
    boolean present = true;
}

public class car extends vehicle {

    @Override
    int calculate_milage() {
        return 15;
    }

    public car(String vehicle_number, String model, int year, int rent) {
        this.vehicle_number = vehicle_number;
        this.model = model;
        this.year = year;
        this.rentalperday = rent;
        vehicle_cnt++;
    }
}

truck extends vehicle{
 type = "truck";
 int calculate_milage(){
   return 8;
 }
 truck(String vehicle_number,String model,int year,int rent){
  this.vehicle_number = vehicle_number;
  this.model = model;
  this.year = year;
  rentalperday = rent;
  vehicle_cnt++;
 }

}
motorcycle extends vehicle{
 type = "motorcycle";
 int calculate_milage(){
   return 40;
 }
 motorcycle(String vehicle_number,String model,int year,int rent){
  this.vehicle_number = vehicle_number;
  this.model = model;
  this.year = year;
  rentalperday = rent;
  vehicle_cnt++;
 }

}