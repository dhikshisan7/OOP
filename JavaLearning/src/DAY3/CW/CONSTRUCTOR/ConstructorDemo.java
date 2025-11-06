package DAY3.CW.CONSTRUCTOR;

class Students{
    String name;
    int rno;
    String dept;
    static String college;
    //    Parameterized Constructor
    public Students(String name,int rno,String dept,String college){
        this.name=name;
        this.rno=rno;
        this.dept=dept;
        this.college=college;
    }
    //    No-args Constructor
    public Students(){

    }
    public void display(){
        System.out.println("Name: "+name+"\nRno: "+rno+"\nDept: "+dept+"\nCollege Name: "+college);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Students.college="MSAJCE";
        Students s1=new Students("Dhikshi",11,"CSE","MSAJCE");
        s1.display();
        System.out.println("----------------------");
        Students s2=new Students();
        s2.name="Pooja";
        s2.rno=12;
        s2.dept="CSE";
        s2.display();

    }
}