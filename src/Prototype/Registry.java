package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    Map<String,Student> map = new HashMap<>();
    public void registerStudent(Student student) {
        map.put(student.getCollege(),student);
    }

    public Student getStudent(String name) {
        return map.get(name);
    }
}
