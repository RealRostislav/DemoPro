import java.util.ArrayList;
import java.util.Scanner;

public class StandardContainer {
    static ArrayList<String> StandardTypeContainer = new ArrayList<>();

    ArrayList<String> removingElements = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    private static int stat_id;
    public int ID;

    private String shipper;
    private double tare;
    private String SecurityInformation;
    private double netWeight;
    private double grossWeight;

    public void setShipper(String shipper) {
        this.shipper = shipper;
    }

    public void setTare(double tare) {
        this.tare = tare;
    }

    public void setSecurityInformation(String securityInformation) {
        SecurityInformation = securityInformation;
    }

    public void setNetWeight(double netWeight) {
        this.netWeight = netWeight;
    }

    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }

    public void setCertificateInformation(String certificateInformation) {
        CertificateInformation = certificateInformation;
    }

    private String CertificateInformation;
    public static double CapacityStandardWithoutCargo = 100;
    public static double capacity = 0;

    public StandardContainer() {
        stat_id+=1; // stat_id -- static, when u create new object it would +1
        ID = stat_id;
    }

    @Override
    public String toString() {
        return ID + " - ID's " + "Shipper:  " + shipper + "\n Tare: " + tare +
                "\n Security of Container: " + SecurityInformation +
                "\n Net Weight: " + netWeight + "Gross Weight: " + grossWeight + "\n Certificate Info:  " + CertificateInformation;
    }
}
