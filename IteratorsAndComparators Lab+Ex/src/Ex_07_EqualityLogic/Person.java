package Ex_07_EqualityLogic;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other.getClass().getSimpleName().equals(Person.class.getSimpleName())) {
            Person sec = (Person)other;
            return this.name.equals(sec.name) && this.age == sec.age;
        }
        return false;
    }


    @Override
    public int hashCode() {
        return this.name.hashCode() + Integer.hashCode(age) * 37;
    }


    @Override
    public int compareTo(Person person) {
        int res = this.name.compareTo(person.name);
        if (res == 0) {
            res = this.age - person.age;
        }
       return res;
    }
}
