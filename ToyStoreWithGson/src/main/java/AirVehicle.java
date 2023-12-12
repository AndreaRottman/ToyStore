public class AirVehicle extends Vehicle {
    protected double length;
    protected double wingspan;

    public AirVehicle(Toy t, Vehicle v, double length, double wingspan) {
        super(t, v.getColor(),v.getVehtype(),v.isDiy(),v.isRemote());
        this.length = length;
        this.wingspan = wingspan;
    }

    public AirVehicle(String color, String vehtype, boolean diy, boolean remote, double length, double wingspan) {
        super(color, vehtype, diy, remote);
        this.length = length;
        this.wingspan = wingspan;
    }

    public double getavLength() {
        return length;
    }

    public void setavLength(String length) {
        this.length = Double.parseDouble(length);
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(String wingspan) {
        this.wingspan = Double.parseDouble(wingspan);
    }

    public AirVehicle(double length, double wingspan) {
        this.length = length;
        this.wingspan = wingspan;
    }

    public AirVehicle() {
        super();
    }

    @Override
    public String toString() {
        return
                "length = " + getavLength() + "cm" +
                ", wingspan = " + getWingspan() + "cm" +
                "} " + super.toString();
    }
}
