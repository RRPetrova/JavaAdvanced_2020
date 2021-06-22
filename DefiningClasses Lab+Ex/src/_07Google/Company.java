package _07Google;

public class Company {
    private String name;
    private String dep;
    private double salary;

    public Company(String name, String dep, double salary) {
        this.name = name;
        this.dep = dep;
        this.salary = salary;
    }

   public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name)
                .append(" ")
                .append(dep)
                .append(" ")
                .append(String.format("%.2f", salary))
                .append(System.lineSeparator());

        return sb.toString();

    }

}
