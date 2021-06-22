package _07Google;

public class Pokemon {
    private String name;
    private String type;
    public Pokemon(){
    }
    public Pokemon(String name, String type){
        this.name= name;
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(name)
                .append(" ")
                .append(type)
                .append(System.lineSeparator());
                return sb.toString();

    }
}
