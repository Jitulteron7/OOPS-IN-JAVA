package StudentPackage;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name +" "+ s1.rollno+" ");
        s1.name = "Jitul Teorn";
        s1.rollno = 1916083;
        System.out.println(s1.name +" "+ s1.rollno);
    }
}
