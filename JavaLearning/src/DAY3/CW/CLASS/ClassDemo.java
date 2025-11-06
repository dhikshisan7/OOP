package DAY3.CW.CLASS;
class Student{
    int rno;
    String name;
    String dept;
    public void display(){
        System.out.println("RNo: "+rno+"\nName: "+name+"\nDept: "+dept);
    }
}
public class ClassDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Dhikshi";
        s1.rno= 11;
        s1.dept="CSE";
        s1.display();
        System.out.println("---------------------------");
        Student s2=new Student();
        s2.name="Joey";
        s2.rno= 12;
        s2.dept="CSE";
        s2.display();
    }
}
