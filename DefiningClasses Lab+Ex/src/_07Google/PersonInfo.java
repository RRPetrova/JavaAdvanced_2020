package _07Google;

import java.util.ArrayList;
import java.util.List;

public class PersonInfo {
    private String name;
    private Company company;
    private List<Children> childrens;
    private List<Parent> parents;
    private List<Pokemon> pokemons;
    private Car car;

    public PersonInfo(String name) {
        this.name = name;
        this.childrens = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public PersonInfo(String name, Company company,
                      List<Children> childrens, List<Parent> parents,
                      List<Pokemon> pokemons, Car car) {
        this.name = name;
        this.company = company;
        this.childrens = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.pokemons = new ArrayList<>();
        this.car = car;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public List<Children> getChildrens() {
        return childrens;
    }

    public List<Parent> getParent() {
        return parents;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {

            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append(name)
                    .append(System.lineSeparator())
                    .append("Company:")
                    .append(System.lineSeparator())
                    .append(company != null ? company : "")
                    .append("Car:")
                    .append(System.lineSeparator())
                    .append(car != null ? car : "")
                    .append("Pokemon:")
                    .append(System.lineSeparator());

            pokemons.forEach(stringBuilder::append);

            stringBuilder.append("Parents:")
                    .append(System.lineSeparator());

            parents.forEach(stringBuilder::append);

            stringBuilder.append("Children:")
                    .append(System.lineSeparator());

            childrens.forEach(stringBuilder::append);

            return stringBuilder.toString();
    }
}
