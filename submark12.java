class Student {
    int regno;
    String name;
    int[] marks;
    int total;

    public Student(int regno, String name, int[] marks) {
        this.regno = regno;
        this.name = name;
        this.marks = marks;
        this.total = 0;
        for (int i = 0; i < marks.length; i++) {
            this.total += marks[i];
        }
    }

    public void displayTotal() {
        System.out.println("Total marks for " + this.name + " (Reg No. " + this.regno + "): " + this.total);
    }
}

public class submark12{
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1, "Iqbal", new int[]{80, 70, 90, 85, 75});
        students[1] = new Student(2, "Firdoush", new int[]{75, 85, 80, 90, 70});
        students[2] = new Student(3, "Shiva", new int[]{90, 80, 85, 75, 95});
        students[3] = new Student(4, "Anshu", new int[]{70, 75, 80, 85, 90});
        students[4] = new Student(5, "Pariyam", new int[]{85, 90, 75, 80, 70});

        for (int i = 0; i < students.length; i++) {
            students[i].displayTotal();
        }
    }
}
