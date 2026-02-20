class student{
  String rollno;
  String name;
  int marks[];
  student(String rollno,String name,int marks[]){
   this.rollno = rollno;
   this.name = name;
   
   this.marks = marks;
   
  }
  // student(String rollno,String name){
  // int mark[];
  //     mark = new int[0];
  // this(rollno,name,mark);
  // }
double avarage = 0;
int count = 0;
int maxi = 0;
int mini = 100;

void Avarage() {
  avarage = 0;
  count = 0;
  maxi = 0;
  mini = 100;
  if (marks.length>0) {
    for (int i = 0; i < marks.length; i++) {
      if (marks[i] >= 0 && marks[i] <= 100) {
        avarage += marks[i];
        count++;
        if (maxi < marks[i]) maxi = marks[i];
        if (mini > marks[i]) mini = marks[i];
      }
    }
    if (count > 0) {
      avarage = avarage / count;
    } else {
      avarage = -1;
      maxi = -1;
      mini = -1;
    }
  } else {
    avarage = -1;
    maxi = -1;
    mini = -1;
  }
}

void display(){
    System.out.println("student rollno : "+rollno);
    System.out.println("Student name : "+name);
   if(marks.length>0){
    System.out.println("Marks : ");
    for(int i= 0;i<marks.length;i++) System.out.println(marks[i]+" ");
    System.out.println("Avarage : "+avarage);
    System.out.println("max : "+maxi);
    System.out.println("min : "+mini);
 }
else{
System.out.println("Marks : "+"-1");
    System.out.println("Avarage : "+"-1");
    System.out.println("max : "+"-1");
    System.out.println("min : "+"-1");
}
 }
 
}
public class lab4_1 {
    public static void main(String args[]){
      String rollno = args[0];
      String name = args[1];
      int marks[];
      marks = new int[args.length-2];
      for(int i = 2;i<args.length;i++){
      marks[i-2] = Integer.parseInt(args[i]);
      }
      student ganesh = new student(rollno,name,marks);
      ganesh.Avarage();
      ganesh.display();
    }
}
