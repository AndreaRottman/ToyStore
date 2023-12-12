import java.util.ArrayList;

public class ToyStore {
    protected ArrayList<Doll> dolls;
    protected ArrayList<Vehicle> vehicles;
    protected ArrayList<AirVehicle> airVehicles;
    protected ArrayList<Toy> toys;

    public ArrayList<Doll> getDolls() {
        return dolls;
    }

    public void setDolls(ArrayList<Doll> dolls) {
        this.dolls = dolls;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public ArrayList<AirVehicle> getAirVehicles() {
        return airVehicles;
    }

    public void setAirVehicles(ArrayList<AirVehicle> airVehicles) {
        this.airVehicles = airVehicles;
    }

    public ArrayList<Toy> getToys() {
        return toys;
    }

    public void setToys(ArrayList<Toy> toys) {
        this.toys = toys;
    }

    public ToyStore(ArrayList<Doll> dolls, ArrayList<Vehicle> vehicles, ArrayList<AirVehicle> airVehicles, ArrayList<Toy> toys) {
        this.dolls = dolls;
        this.vehicles = vehicles;
        this.airVehicles = airVehicles;
        this.toys = toys;


    }

    public ToyStore(){
        ArrayList<Toy> toys=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Toy Store Stock"+
                "\n-----------------"+
                "\nRegular Toys:"+toys+
                "\nDolls:"+dolls+
                "\nLand Vehicles:"+vehicles+
                "\nAir Vehicles:"+airVehicles;
    }
}
