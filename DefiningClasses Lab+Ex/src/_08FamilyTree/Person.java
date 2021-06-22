package _08FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String bdate;
    private List<Person> parents;
    private List<Person> children;

   public Person(String name, String bdate) {
       this.name = name;
       this.bdate = bdate;
       this.parents = new ArrayList<>();
       this.children = new ArrayList<>();
   }

    public void setName(String name) {
        this.name = name;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getName() {
        return this.name;
    }

    public String getBdate() {
        return bdate;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Person> getParents() {
        return parents;
    }


}
