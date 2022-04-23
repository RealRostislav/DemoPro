import java.util.ArrayList;

public class ToxicContainer extends HeavyContainer{
     ArrayList<String> ToxicLiquidContainer = new ArrayList<>();
    static ArrayList<String> ToxicPowderyContainer = new ArrayList<>();

    private static int stat_id;
    public int ID;

    private String shipper;
    private double tare;
    private String SecurityInformation;
    private double netWeight;


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

    private double grossWeight;
    private String CertificateInformation;

    public static double Capacity = 0;

    public ToxicContainer() {
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

