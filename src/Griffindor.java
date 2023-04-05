public class Griffindor {
    private String name;
    private int nobility;
    private int honor;
    private int bravery;
    public Griffindor(String name, int nobility, int honor, int bravery) {
        this.name = name;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
