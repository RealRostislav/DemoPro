import java.util.ArrayList;

public class Ships {
    private static int stat_id;
    public int ID;

    public void setNameShip(String nameShip) {
        this.nameShip = nameShip;
    }

    public void setPortHome(String portHome) {
        PortHome = portHome;
    }

    public void setOriginTransp(String originTransp) {
        OriginTransp = originTransp;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Ships() {
        stat_id+=1; // stat_id -- static, when u create new object it would +1
        ID = stat_id;

    }
    // I should add weight of Ship
    private String nameShip; // name of the ship
    private String PortHome; // home port
    private String OriginTransp; // transp origin
    private String destination; // way destination
    public double Capacity = 0.0; // capacity by default

    ArrayList<StandardContainer> standardContainers = new ArrayList<>();
    ArrayList<ArrayList<HeavyContainer>> heavyContainer = new ArrayList<>();
    ArrayList<ArrayList<ToxicContainer>> toxicContainer = new ArrayList<>();
    ArrayList<ArrayList<RefrigeratedContainer>> refrigeratedContainer = new ArrayList<>();
    ArrayList<ArrayList<LiquidContainer>> liquidContainer = new ArrayList<>();
    ArrayList<ArrayList<ExplosiveContainer>> explosiveContainer = new ArrayList<>();
    StringBuilder builder = new StringBuilder();

    @Override
    public String toString() {
        return ID + " -- ID" + "\n Name" + nameShip + "\n Transport Origin: " + OriginTransp
                + "\n Home Port: " + PortHome + "\n Destination: " + destination + "\n" + builder;
    }



}
