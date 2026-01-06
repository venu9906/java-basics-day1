public class StudentInformationSystem {
    public static void main(String[] args) {

        // Step 1: Create student records
        Student s1 = new Student("Ravi", 20, 85);
        Student s2 = new Student("Prakash", 21, 90);
        Student s3 = new Student("Kiran", 19, 78);

        Student[] students = {s1, s2, s3};

        // Step 2: Calculate average marks
        int totalMarks = 0;
        for (Student s : students) {
            totalMarks += s.marks;
        }

        double averageMarks = (double) totalMarks / students.length;

        // Step 3: Print formatted output
        System.out.println("----- Student Information System -----");
        System.out.printf("%-10s %-5s %-6s%n", "Name", "Age", "Marks");
        System.out.println("-------------------------------------");

        for (Student s : students) {
            System.out.printf("%-10s %-5d %-6d%n", s.name, s.age, s.marks);
        }

        System.out.println("-------------------------------------");
        System.out.println("Average Marks: " + averageMarks);
    }
}