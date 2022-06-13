import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private int SSN;

    public Student(String name, int age, int SSN) {
        this.name = name;
        this.age = age;
        this.SSN = SSN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }


}
