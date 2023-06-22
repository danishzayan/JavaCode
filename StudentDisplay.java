class Student {
    int rollNo;
    String name;
    
    // Method to insert student data
    void insert(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    
    // Method to display student data
    void display() {
        System.out.println("Student Roll No: " + rollNo);
        System.out.println("Student Name: " + name);
    }
}

public class StudentDisplay  {
    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student();
        Student student2 = new Student();
        
        // Insert data for student1
        student1.insert(1, "John Doe");
        
        // Insert data for student2
        student2.insert(2, "Jane Smith");
        
        // Display student information
        System.out.println("Student 1 Details:");
        student1.display();
        
        System.out.println("\nStudent 2 Details:");
        student2.display();
    }
}
