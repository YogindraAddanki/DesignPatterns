package Prototype;

public class Student implements Prototype {
    private String name;
    private int age;
    private String gender;
    private String college;

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String principal;
    Student() {

    }
    Student(Student student) {
        this.principal = student.principal;
        this.college = student.college;
    }
    @Override
    public Student makeCopy() {
       return new Student(this);

    }
}
