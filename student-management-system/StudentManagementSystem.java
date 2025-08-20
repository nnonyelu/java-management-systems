import java.util.ArrayList;
import java.util.List;


public class StudentManagementSystem
{//class begins

	
	private List<Student> students;//reference to list of Students
	private int nextId;

	public StudentManagementSystem()
        {
         this.students = new ArrayList<>();
	 this.nextId = 1; 
         }

	 //add student
	public void addStudent(Student student)
       {
        students.add(student);
        
       }
 // Get all students
    public List<Student> getAllStudents() {
        return new ArrayList<>(students); // Return a copy for encapsulation
    }

    // Find student by ID
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    // Delete student by ID
    public boolean deleteStudent(int id) {
        Student student = getStudentById(id);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }

    // Search students by name (partial match)
    public List<Student> searchStudentsByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(student);
            }
        }
        return result;
    }
       
  }//class ends