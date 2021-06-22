import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String birthday;
    private List<Person> parents;
    private List<Person> children;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public Person(String part) {
        if (!part.contains("/")) {
            this.name = part;
            this.birthday = Main.def;
        }
        else {
            this.name = Main.def;
            this.birthday = part;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List<Person> getParents() {
        return this.parents;
    }

    public List<Person> getChildren() {
        return this.children;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.name, this.birthday);
    }

}
