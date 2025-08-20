//Project: Student Management System
//Step 1: Define the Requirements
//You want to:
//Add a new student
//View all students
//Search student by ID or name
//Edit student details
//Delete a student
//Save/load student records from a file

public class Student{

	private int id;
	private String name;
	private int age;
	private String course;

        public Student(int id,String name, int age,String course){
         this.id = id;
    	 this.name = name;
	 this.age = age;
	 this.course = course; 
       }


    //setters and getters
    public int getId(){
     return id;
   }

   public void setName(String name){
    this.name = name;
   }

  public String getName(){
   return name;

  }
   public void setAge(int age){
    this.age = age;
   }

  public int getAge(){
    return age;   
  }

  public void setCourse(String course){
    this.course = course;
   }

  public String getCourse(){
   return course;

  }

   public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

/*public static void main(String args[]){
Student olu = new Student(33,"Chikaodinaka Okoronkwo", 21, "Information Systems");
olu.display();



  }*/
}
