package Ex_05_ComparingObjects;

public class Person implements Comparable<Person>{
    private String name;
    private Integer age;
    private String town;

    public Person(String name, int age, String town){
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person person) {
        if (this.name.compareTo(person.name) == 0) {
            if (this.age.compareTo(person.age) == 0) {
                int resTown = this.town.compareTo(person.town);
                return this.town.compareTo(person.town);
            } else {
                int resAge = this.age.compareTo(person.age);
                return this.age.compareTo(person.age);
            }
        }
        int resName = this.name.compareTo(person.name);
        return this.name.compareTo(person.name);
    }
}
