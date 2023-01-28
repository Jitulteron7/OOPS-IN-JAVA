package StudentPackage;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getName() +" "+ s1.getRollno()+" ");
        s1.set(1916083,"Jitul Teron");
        System.out.println(s1.getName() +" "+ s1.getRollno());
    }
}
