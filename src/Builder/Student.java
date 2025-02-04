package Builder;

public class Student {
    private String name;
    private int age;

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

    private String gender;

    public Student(Builder builder) {
      if(builder.getAge() < 20)
          throw new IllegalArgumentException("Age cannot be less than 20");
      if(builder.getGender().equals("male"))
          throw new IllegalArgumentException("Gender cannot be male");
      this.name = builder.getName();
      this.age = builder.getAge();
      this.gender = builder.getGender();
    }


    public static Builder getBuilder(){
        return new Builder();
    }
}
