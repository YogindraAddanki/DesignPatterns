package Prototype;

public class Client {

    public static void fillRegistry(Registry registry) {
        Student student = new Student();
        student.setCollege("Anits");
        student.setPrincipal("Rao");
        registry.registerStudent(student);

    }
    public static void main(String[] args) {
        Registry registry = new Registry();
       fillRegistry(registry);
       Student student =  registry.getStudent("Anits").makeCopy();


    }
}
