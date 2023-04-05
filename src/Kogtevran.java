public class Kogtevran {
    private String name;
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;
    public Kogtevran(String name, int mind, int wisdom, int wit, int creation) {
        this.name = name;
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
}
