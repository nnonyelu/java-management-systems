import java.util.Scanner;
import java.util.List;


public class StudentManager{

    private Scanner scanner;
    private StudentManagementSystem sms;


     public StudentManager() {
        this.scanner = new Scanner(System.in);
        this.sms = new StudentManagementSystem();
    }

	public static void main(String args[]){
          StudentManager studentmanager = new StudentManager();
	  studentmanager.run();
        }

       public void run(){
        while(true){
	System.out.println("Welcome to our Student Management System ");
        System.out.println("It has very basic features for now");
	System.out.println("=================================================");
        System.out.println("Indicate the operation you want to perform below:");
	System.out.println("1. add student");
	System.out.println("2. view All students");
	System.out.println("3. search student by ID");
	System.out.println("4. search student by name");
	System.out.println("5. update student");
	System.out.println("6. delete student");
       System.out.println("*************************************************");
        System.out.println("Enter your choice of operation");
        
	int choice = scanner.nextInt();
   scanner.nextLine();
	
     switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    searchStudentById();
                    break;
                case 4:
                    searchStudentsByName();
                    break;
                case 5:
                    updateStudent();
                    break;
                case 6:
                    deleteStudent();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }

      }//while ends 
}
  
      
       public void addStudent(){
        System.out.print("Enter student name:");
        String name = scanner.nextLine();
        //scanner.nextLine();
        
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter student course: ");
        String course = scanner.nextLine();
        //scanner.nextLine();

        int id = sms.getAllStudents().size() + 1;
        Student student = new Student(id, name, age, course);
        sms.addStudent(student);
	System.out.println(" ");
	System.out.println(" ");
        System.out.println("Student added successfully!");
        System.out.println("===========================");
        System.out.println("===================================");

     }

        

    

  // Implement other methods similarly...
    private void viewAllStudents() {
        List<Student> students = sms.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            for (Student student : students) {
                student.display();
                System.out.println("-----------");
            }
        }
    }
	

 public void searchStudentById(){
  System.out.println("Please enter student id");
  int id  = scanner.nextInt();
 
  Student searchReturnedStudent = sms.getStudentById(id);
  
   System.out.println("I have got the student ID but have no idea how to print all records associated with the stuent with the specified id."); 
  
  
 }


  public void searchStudentsByName(){
  String studentName = scanner.nextLine();
  Student studentNameRes = searchStudentsByName(studentName);
  //code to go through the list and view this Particular student's record
   for(Student ss:studentNameRes){
     System.out.println(ss);
      
 
    }
  System.out.println("This feature is not yet available");

 }

  public void updateStudent(){
  System.out.println("This feature is not yet available");

 }
	 public void deleteStudent(){
  System.out.println("This feature is not yet available");

 }
	
	
	

     
    


    	//save students
  public void saveToFile(){
   System.out.println("Feature not yet able");
  }
//load students

 public void loadFromFile(){
  System.out.println("Feature not yet available");
 }








}