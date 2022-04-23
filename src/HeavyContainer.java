import java.util.ArrayList;

public class HeavyContainer extends StandardContainer {
    //ArrayList for heavy containers
    static ArrayList<String> heavyContainer = new ArrayList<>();
    //For storing elements that will remove soon
    ArrayList<String> removalList = new ArrayList<>();

    //For unique ID
    private static int stat_id;
    public int ID;



    private String shipper;
    private double tare;
    private String SecurityInformation;
    private double netWeight;
    private double grossWeight;
    private String CertificateInformation;

    public static double CapacityHeavyWithoutCargo = 100;
    public static double Capacity = 0;

    public HeavyContainer(){
            stat_id+=1; // stat_id -- static, when u create new object it would +1
            ID = stat_id;
    }

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

    @Override
    public String toString() {
        return ID + ". "
                + "Sender: " + shipper
                + "\nTare: " + tare
                + "\nInformation About Security: " + SecurityInformation
                + "\nNet Weight: " + netWeight
                + "\nGross Weight: " + grossWeight
                + "\nCertificate Information: " + CertificateInformation;
    }

}
