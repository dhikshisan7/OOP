package DAY4.HW.HW1;
class Person{
    String name;
    String DOB;
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + DOB);
    }
}
class Teacher extends Person{
    String subject;
    int salary;
    void displayTeacher() {
        displayPerson();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}
class Student extends Person{
    int studId;
    void displayStu() {
        displayPerson();
        System.out.println("Student ID: " + studId);
    }
}
class CollegeStudent extends Student{
    String clgname;
    String year;
    void displayClgStu(){
        displayStu();
        System.out.println("CollegeName: " +clgname);
        System.out.println("Year: " +year);
    }
}
public class School {
    public static void main(String[] args) {
        Person person=new Person();
        person.name = "DHIKSHI";
        person.DOB = "12-05-2005";
        Teacher teacher=new Teacher();
        teacher.name = "ABC";
        teacher.DOB = "29-09-1975";
        teacher.subject = "JAVA";
        teacher.salary = 35000;
        Student student=new Student();
        student.name= "Dhikshi";
        student.DOB= "12-08-2005";
        student.studId= 11;
        CollegeStudent collegeStudent =new CollegeStudent();
        collegeStudent.name= "Dhikshitha";
        collegeStudent.DOB= "12-08-2005";
        collegeStudent.studId= 11;
        collegeStudent.clgname= "MSAJCE";
        collegeStudent.year= "Third Year";

        System.out.println("---- Person ----");
        person.displayPerson();
        System.out.println("\n---- Teacher ----");
        teacher.displayTeacher();
        System.out.println("\n---- Student ----");
        student.displayStu();
        System.out.println("\n---- College Student ----");
        collegeStudent.displayClgStu();
    }
}
