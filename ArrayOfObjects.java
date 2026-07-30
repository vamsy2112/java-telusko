
class Student {
    int rollno;
    int marks;
    String name;
}

public class ArrayOfObjects {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "vamsy";
        s1.marks = 60;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "payal";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "sailu";
        s3.marks = 97;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + ":" + " " + students[i].marks);
        }
    }
}
