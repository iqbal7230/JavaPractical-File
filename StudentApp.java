import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student{
    private int id;
    private String name;
    private String gender;
    private String course;

    public Student(int id, String name, String gender, String course) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}

public class StudentApp {
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int choice;

        while (!quit) {
            System.out.println("\n-------- Student Record Application --------");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. View All Students");
            System.out.println("5. View Student by ID");
            System.out.println("6. Search Student by Name");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    viewAllStudents();
                    break;
                case 5:
                    viewStudentById();
                    break;
                case 6:
                    searchStudentByName();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }
    }

    private static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student id: ");
        int id = scanner.nextInt();
        System.out.print("Enter student name: ");
        scanner.nextLine(); // Consume newline left-over
        String name = scanner.nextLine();
        System.out.print("Enter student gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter student course: ");
        String course = scanner.nextLine();

        Student student = new Student(id, name, gender, course);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    private static void updateStudent() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter student id: ");
    int id = scanner.nextInt();
    Student student = findStudentById(id);

    if (student != null) {
        System.out.print("Enter student name: ");
        scanner.nextLine(); // Consume newline left-over
        String name = scanner.nextLine();
        System.out.print("Enter student gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter student course: ");
        String course = scanner.nextLine();

        student.setName(name);
        student.setGender(gender);
        student.setCourse(course);
        System.out.println("Student updated successfully.");
    } else {
        System.out.println("Student not found.");
    }

    private static void searchStudentByName() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter student name: ");
    String name = scanner.nextLine();

    List<Student> foundStudents = findStudentsByName(name);
    if (foundStudents.isEmpty()) {
        System.out.println("No student found with the provided name.");
    } else {
        System.out.println("Found " + foundStudents.size() + " student(s) with the provided name.");
        for (Student student : foundStudents) {
            System.out.println(student);
        }
    }

    private static List<Student> findStudentsByName(String name) {
        List<Student> foundStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                foundStudents.add(student);
            }
        }
        return foundStudents;
    }

    private static Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    private static void viewStudentById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student id: ");
        int id = scanner.nextInt();

        Student student = findStudentById(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void viewAllStudents() {
        System.out.println("Student Details");
        System.out.println("----------------------------");
        if (students.isEmpty()) {
            System.out.println("No student found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student id: ");
        int id = scanner.nextInt();

        Student student = findStudentById(id);
        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
