package _07Google;

public class Children {
    private String name;
    private String bday;

    public Children(String name, String bday) {
        this.name = name;
        this.bday = bday;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name)
                .append(" ")
                .append(bday)
                .append(System.lineSeparator());
        return sb.toString();
    }
}
