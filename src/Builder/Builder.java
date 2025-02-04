package Builder;

public class Builder {

    public Student build() {
        return new Student(this);
    }
    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Builder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    private String name;
    private int age;
    private String gender;
}
