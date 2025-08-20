# Java Management Systems

A collection of object-oriented Java applications demonstrating core OOP principles through practical management systems.

## 📚 Projects Included

### 1. Library Management System
A comprehensive library management application that allows users to:
- Add books to the library collection
- Search for books by title
- Borrow and return books
- View all available books
- Track book availability status

**Key Features:**
- Object-oriented design with `Book` and `Library` classes
- Interactive console interface
- Input validation and error handling
- Book availability tracking

### 2. Student Management System
A student information management system for educational institutions to:
- Add new student records
- Update student information
- Search for students
- View all student records
- Manage student data efficiently

**Key Features:**
- Encapsulation with private fields and public methods
- Data validation
- User-friendly menu system
- CRUD operations (Create, Read, Update, Delete)

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line/terminal access

### Running Library Management System
```bash
cd library-management-system
javac *.java
java BookLibraryTest
```

### Running Student Management System
```bash
cd student-management-system
javac *.java
java StudentTest
```

## 🔧 Technical Implementation

### Object-Oriented Programming Concepts Demonstrated

**Encapsulation:**
- Private fields with public getter/setter methods
- Data hiding and controlled access

**Abstraction:**
- Clean interfaces that hide implementation complexity
- User-friendly method names and functionality

**Composition:**
- Library HAS-A collection of Books
- StudentManagement HAS-A collection of Students

**Method Overloading:** *(if implemented)*
- Multiple constructors or methods with different parameters

## 📁 Project Structure

```
java-management-systems/
├── README.md
├── library-management-system/
│   ├── Book.java                 # Book class with properties and methods
│   ├── Library.java              # Library class managing book collection
│   └── BookLibraryTest.java      # Interactive test application
└── student-management-system/
    ├── Student.java              # Student class definition
    ├── StudentManagement.java    # Student management operations
    └── StudentTest.java          # Interactive test application
```

## 🌟 Key Learning Outcomes

- **Object-Oriented Programming:** Understanding classes, objects, methods, and encapsulation
- **User Input Handling:** Using Scanner class for interactive console applications
- **Data Validation:** Implementing input validation and error handling
- **Menu-Driven Applications:** Creating user-friendly console interfaces
- **Collection Management:** Working with ArrayList and managing object collections
- **Method Design:** Creating reusable methods with clear responsibilities

## 💡 Future Enhancements

### Library System
- [ ] Add book categories/genres
- [ ] Implement due dates for borrowed books
- [ ] Add user accounts and borrowing history
- [ ] File I/O for persistent data storage

### Student System
- [ ] Add grade management
- [ ] Implement course enrollment
- [ ] Add student performance analytics
- [ ] Database integration

## 🤝 Contributing

Feel free to fork this repository and submit pull requests for any improvements or additional features!

## 📞 Contact

Created by Uchechukwu Henry Nnonyelu - feel free to contact me!

- GitHub:[ [@yourusername](https://github.com/yourusername)](https://github.com/nnonyelu)
- Email: nnonyeluhenry@gmail.com

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

*This project was created as part of learning Object-Oriented Programming concepts in Java.*
