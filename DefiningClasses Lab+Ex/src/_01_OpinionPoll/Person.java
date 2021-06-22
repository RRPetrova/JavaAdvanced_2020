package _01_OpinionPoll;

public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
       return this.age;
    }

    public String getName() {
        return this.name;
    }

@Override
    public String toString() {
        return String.format("%s - %d", this.name, this.age);
}

}
