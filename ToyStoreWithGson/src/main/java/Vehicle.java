public class Vehicle extends Toy{
    protected String color;
    protected String vehtype;
    protected boolean diy;
    protected boolean remote;
    public Vehicle(Toy v, String color,String vehtype, boolean diy,boolean remote){
        super(v.getName(), v.getToyType(), v.getBrand(), v.getPrice(), v.getQty());
        this.color=color;
        this.vehtype=vehtype;
        this.diy = diy;
        this.remote = remote;
    }
    public Vehicle(){
        super();
    }

    public Vehicle(String color, String vehtype, boolean diy, boolean remote) {
        super();
        this.color = color;
        this.vehtype = vehtype;
        this.diy = diy;
        this.remote = remote;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehtype() {
        return vehtype;
    }

    public void setVehtype(String vehtype) {
        this.vehtype = vehtype;
    }

    public boolean isDiy() {
        return diy;
    }

    public void setDiy(String diy) {
        if(diy.equals("F")){
            this.diy = false;
        } else if(diy.equals("T")){
            this.diy = true;
        }
    }

    public boolean isRemote() {
        return remote;
    }

    public void setRemote(String remote) {
        if(remote.equals("F")){
            this.remote = false;
        } else if(remote.equals("T")){
            this.remote = true;
        }
    }

    @Override
    public String toString() {
        return
                "color = " + getColor()  +
                ", Vehicle Type = " + getVehtype()  +
                ", DIY? = " + isDiy() +
                ", remote? = " + isRemote() +
                "} " + super.toString();
    }
}
