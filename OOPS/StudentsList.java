package OOPS;

public class StudentsList {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Satyam");
        int d = s2.getCountofStudents();
        Student s3 = new Student();
        System.out.println(s1.getName() + " " + s1.getRollNumber());
        System.out.println(s2.getName() + " " + s2.getRollNumber());
        System.out.println(s3.getName() + " " + s3.getRollNumber());
        System.out.println(d);

    }
}

class Student {
    private static int count = 0;
    private String name;
    private int rollNumber;

    Student() {
        this.name = "defaultName";
        this.rollNumber = count;
        count++;
    }

    Student(String name) {
        this.name = name;
        this.rollNumber = count;
        count++;
    }

    public String getName() {
        return this.name;
    }

    public int getRollNumber() {
        return this.rollNumber;
    }

    public int getCountofStudents() {
        return count;
    }

}
