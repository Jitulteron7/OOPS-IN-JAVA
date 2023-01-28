package StudentPackage;

public class Student {
     int rollno;
    private String name;

    public void set (int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno (){
        return this.rollno;
    }

    public String getName (){
        return this.name;
    }


}
