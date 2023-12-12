public class Doll extends Toy{
    protected String clothes;
    protected String eyes;
    protected String hair;

    public Doll(Toy d, String clothes, String eyes, String hair) {
        super(d.getName(), d.getToyType(), d.getBrand(), d.getPrice(), d.getQty());
        this.clothes = clothes;
        this.eyes = eyes;
        this.hair = hair;
    }

    public Doll(String clothes, String eyes, String hair) {
        this.clothes = clothes;
        this.eyes = eyes;
        this.hair = hair;
    }
    public Doll(){
        super();
    }


    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    @Override
    public String toString() {
        return
                "clothes = " + getClothes()  +
                ", eyes = " + getEyes()  +
                ", hair = " + getHair()  +
                "} " + super.toString();
    }
}
