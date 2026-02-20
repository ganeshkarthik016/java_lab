package f1;
import java.lang.Exception;


class rental_manager{
 public static vehicle vehicles[] = new vehicle[50];
  static vehicle took[] = new vehicle[50]; 
  static  int tooks = 0;
 public void add(String vehicle_number,String model,int year,int rent,String type){
    if(type  = "car"){
      vehicle v = new car(vehicle_number,model,model,year,rent);
    }
    if(type  = "truck"){
      vehicle v = new truck(vehicle_number,model,model,year,rent);
    }
    if(type  = "motorcycle"){
     vehicle v = new motorcycle(vehicle_number,model,model,year,rent);
    }
  vechicle[vehicle_cnt-1] = v;
 }}
 public rent (String model,int days){
  boolen found = false;
  vehicle v = new vehicle;
  for(int i =0;i<vehicle_cnt;i++){
   if(model == vehicles[i].model) {found = "true";
   v = vehicle[i];}
  }
  if(days <= 0){
  try{
      throw  new Invalidtime();
      }
  catch(Invalidtime e){
   System.out.println(e.getMessage());}}
 }
}
  else if(!found){
  try{
      throw  new notfound();
      }
  catch(notfound e){
   System.out.println(e.getMessage());}}
 }
 else{
  if(!v.present)
   try{
      throw  new Unavilable();
      }
  catch(Unavilable e){
   System.out.println(e.getMessage());}
   else{
    took[tooks] = v;
    tooks++;
    v.prsent = false;
   }
 }
