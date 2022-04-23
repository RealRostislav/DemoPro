import java.util.ArrayList;
import java.util.Scanner;

public class Containers {
    String Input;
    Scanner scanner = new Scanner(System.in); // for users
    static long TimeBegin;
    static long TimeEnd;

    //arraylists
    static ArrayList<StandardContainer> standardContainers = new ArrayList<>();
    static ArrayList<RefrigeratedContainer> refrigeratedContainers = new ArrayList<>();
    static ArrayList<LiquidContainer> liquidContainers = new ArrayList<>();
    static ArrayList<HeavyContainer> heavyContainers = new ArrayList<>();
    static ArrayList<ToxicContainer> toxicContainers = new ArrayList<>();
    static ArrayList<ExplosiveContainer> explosiveContainers = new ArrayList<>();
    double numInput;


    //Creating StandardContainer:

    public void CreatingStandardContainer(StandardContainer standardContainer) {
        System.out.print("Who is the shipper: ");
        Input = scanner.next();
        standardContainer.setShipper(Input);
        System.out.print("tare: ");
        numInput = scanner.nextDouble();
        standardContainer.setTare(numInput);
        System.out.print("Information about its security: ");
        Input = scanner.next();
        standardContainer.setSecurityInformation(Input);
        System.out.print("Net Weight: ");
        numInput = scanner.nextDouble();
        standardContainer.setNetWeight(numInput);
        System.out.print("Gross Weight: ");
        numInput = scanner.nextDouble();
        standardContainer.setGrossWeight(numInput);
        System.out.print("Certificate Information: ");
        Input = scanner.next();
        standardContainer.setCertificateInformation(Input);
        TimeBegin = System.currentTimeMillis();
    }

    //Standard Container Info
    public static void InformationStandardC() {
        TimeEnd = System.currentTimeMillis();
        boolean isEmpty = standardContainers.isEmpty();
        long timeElapsed = TimeEnd - TimeBegin;
        if (timeElapsed < 100000000) {
        } else { // rewrite
            standardContainers.forEach(containers -> {
                containers.setSecurityInformation(null);
                containers.setNetWeight(0);
                containers.setTare(0);
                containers.setShipper(null);
                containers.setCertificateInformation(null);
                containers.setGrossWeight(0);
                StandardContainer.StandardTypeContainer.clear();
            });
        }


        if (!isEmpty) {
            for (StandardContainer containers : standardContainers) {
                System.out.println(containers);
            }
        } else {
            System.out.println("There is NO standard containers");
        }
    }

    //Method for creating new Heavy Container
    public void createHeavyContainer(HeavyContainer heavyContainer) {
        System.out.print("Who is the shipper: ");
        Input = scanner.next();
        heavyContainer.setShipper(Input);

        System.out.print("tare: ");
        numInput = scanner.nextDouble();
        heavyContainer.setTare(numInput);

        System.out.print("Information about this security: ");
        Input = scanner.next();
        heavyContainer.setSecurityInformation(Input);

        System.out.print("Net Weight: ");
        numInput = scanner.nextDouble();
        heavyContainer.setNetWeight(numInput);

        System.out.print("Gross Weight: ");
        numInput = scanner.nextDouble();
        heavyContainer.setGrossWeight(numInput);

        System.out.print("Certificate Information: ");
        Input = scanner.next();
        heavyContainer.setCertificateInformation(Input);

        heavyContainers.add(heavyContainer);
    }

    //Heavy Container Info
    public static void heavyInfo() {
        boolean isEmpty = heavyContainers.isEmpty();
        if (!isEmpty) {
            for (HeavyContainer containers : heavyContainers) {
                System.out.println(containers);
            }
        } else {
            System.out.println("There is NO heavy containers");
        }
    }
    public void createRefrigeratedContainer(RefrigeratedContainer refrigeratedContainer) {
        System.out.print("Who is the shipper: ");
        Input = scanner.next();
        refrigeratedContainer.setShipper(Input);

        System.out.print("tare: ");
        numInput = scanner.nextDouble();
        refrigeratedContainer.setTare(numInput);
        System.out.print("Information About Security: ");
        Input = scanner.next();
        refrigeratedContainer.setSecurityInformation(Input);
        System.out.print("Net Weight: ");
        numInput = scanner.nextDouble();
        refrigeratedContainer.setNetWeight(numInput);

        System.out.print("Gross Weight: ");
        numInput = scanner.nextDouble();
        refrigeratedContainer.setGrossWeight(numInput);

        System.out.print("Certificate Information: ");
        Input = scanner.next();
        refrigeratedContainer.setCertificateInformation(Input);

        refrigeratedContainers.add(refrigeratedContainer);
    }
    public static void refrigeratedInfo() {
        //Checks if List is empty or not
        boolean isEmpty = refrigeratedContainers.isEmpty();
        if (!isEmpty) {
            for (RefrigeratedContainer containers : refrigeratedContainers) {
                System.out.println(containers);
            }
        } else {
            System.out.println("There is NO refrigerated containers");
        }
    }

    //Method for creating new Liquid Container
    public void createLiquidContainer(LiquidContainer liquidContainer) {
        System.out.print("Who is the shipper: ");
        Input = scanner.next();
        liquidContainer.setShipper(Input);
        System.out.print("tare: ");
        numInput = scanner.nextDouble();
        liquidContainer.setTare(numInput);
        System.out.print("Information About Security: ");
        Input = scanner.next();
        liquidContainer.setSecurityInformation(Input);
        System.out.print("Net Weight: ");
        numInput = scanner.nextDouble();
        liquidContainer.setNetWeight(numInput);

        System.out.print("Gross Weight: ");
        numInput = scanner.nextDouble();
        liquidContainer.setGrossWeight(numInput);

        System.out.print("Certificate Information: ");
        Input = scanner.next();
        liquidContainer.setCertificateInformation(Input);
        liquidContainers.add(liquidContainer);
    }
    public static void liquidInfo() {
        boolean isEmpty = liquidContainers.isEmpty();
        if (!isEmpty) {
            for (LiquidContainer containers : liquidContainers) {
                System.out.println(containers);
            }
        } else {
            System.out.println("There is NO liquid containers");
        }
    }

    //Method for creating new Toxic Container
    public void createToxicContainer(ToxicContainer toxicContainer) {
        System.out.print("Who is the shipper: ");
        Input = scanner.next();
        toxicContainer.setShipper(Input);
        System.out.print("tare: ");
        numInput = scanner.nextDouble();
        toxicContainer.setTare(numInput);
        System.out.print("Information About Security: ");
        Input = scanner.next();
        toxicContainer.setSecurityInformation(Input);

        System.out.print("Net Weight: ");
        numInput = scanner.nextDouble();
        toxicContainer.setNetWeight(numInput);

        System.out.print("Gross Weight: ");
        numInput = scanner.nextDouble();
        toxicContainer.setGrossWeight(numInput);

        System.out.print("Certificate Information: ");
        Input = scanner.next();
        toxicContainer.setCertificateInformation(Input);
        toxicContainers.add(toxicContainer);
    }

    public static void toxicInfo() {
        boolean isEmpty = toxicContainers.isEmpty();
        if (!isEmpty) {
            for (ToxicContainer containers : toxicContainers) {
                System.out.println(containers);
            }
        } else {
            System.out.println("There is NO toxic containers");
        }
    }
    public void createExplosiveContainer(ExplosiveContainer explosiveContainer) {
        System.out.print("Who is the shipper: ");
        Input = scanner.next();
        explosiveContainer.setShipper(Input);
        System.out.print("tare: ");
        numInput = scanner.nextDouble();
        explosiveContainer.setTare(numInput);

        System.out.print("Information About Security: ");
        Input = scanner.next();
        explosiveContainer.setSecurityInformation(Input);

        System.out.print("Net Weight: ");
        numInput = scanner.nextDouble();
        explosiveContainer.setNetWeight(numInput);
        System.out.print("Gross Weight: ");
        numInput = scanner.nextDouble();
        explosiveContainer.setGrossWeight(numInput);

        System.out.print("Certificate Information: ");
        Input = scanner.next();
        explosiveContainer.setCertificateInformation(Input);
        explosiveContainers.add(explosiveContainer);
    }
    public static void explosiveInfo() {
        boolean isEmpty = explosiveContainers.isEmpty();
        if (!isEmpty) {
            for (ExplosiveContainer containers : explosiveContainers) {
                System.out.println(containers);
            }
        } else {
            System.out.println("There is NO explosive containers");
        }
    }

    public void ContainerInformation() {

        System.out.println("standard container, \nheavy container, which is a type of standard container,");
        System.out.println("a refrigerated container, which is a type of heavy container, requiring connection to the\n" +
                "                          ship’s electrical network,");
        System.out.println("a container for liquids cargo, which is a type of standard container \na container for explosives cargo, which is a type of standard container,");
        System.out.println(",a container for toxic cargo, which is a type of heavy container, which is available in two\n" +
                "                          versions: a container for toxic powdery cargo and a container for toxic liquid cargo, which\n" +
                "                          is not only a kind of heavy container, but also has the features of a container for liquids\n" +
                "                          cargo");
    }

    public void ContainerMenu() { //remake
        System.out.println("1. Standard Container");
        System.out.println("2. Heavy Container");
        System.out.println("3. Refrigerated Container");
        System.out.println("4. Liquid Container");
        System.out.println("5. Explosive Container");
        System.out.println("6. Toxic Container\n");
        System.out.println("A. Back");
        System.out.println("?. Info About Containers");

    }

    public void warehouseMenu() {
        System.out.println("1. Display Standard Containers");
        System.out.println("2. Display Heavy Containers");
        System.out.println("3. Display Refrigerated Containers");
        System.out.println("4. Display Liquid Containers");
        System.out.println("5. Display Explosive Containers");
        System.out.println("6. Display Toxic Containers\n");
        System.out.println("A. Back");

    }
}
