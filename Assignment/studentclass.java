public class Student {
    private String name;
    private int rollNumber;
    private double marks;

   
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

   
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("PAVAN");
        student.setRollNumber(192110105);
        student.setMarks(95.5);

        student.displayDetails();
}
}
OUTPUT
Student Name: PAVAN
Roll Number: 192110105
Marks: 95.5

=== Code Execution Successful ===
