package Builder;

public class BuilderClient {
    public static void main(String[] args) {
        Student student = Student.getBuilder().setName("Yogi").setGender("Male").setAge(10).build();
    }
}
