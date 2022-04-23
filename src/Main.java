import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    //creating objects
    static Warehouse warehouse = new Warehouse();
    static Containers container = new Containers();

    public Main() {}

    public static void main(String[] args) {
        ArrayList<Warehouse> warehouses = new ArrayList<>(); // creating arraylist
        Scanner scanner = new Scanner(System.in); // for input

        boolean loopEnd = true;
// miss this part
        LOOP_OF_SEAPORT: // LABEL
        while (true){ // seaport loop
            FirstMenu();
            System.out.println(":  ");
            String userInput = scanner.next();

            switch (userInput.toUpperCase((Locale.ROOT))) {
                case "Y"



                case 1:
                    if (inp1.equals("Y")) {
                }

            }
        }
        // case 3:
        //System.out.println("Exiting....");
       // loopStop = false;
      //  break;
//        System.out.println("Invalid Command, Please Try Again");
    }

    public static void FirstMenu() {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Glad to see you again! Welcome on board.");
        System.out.println("[Y] Continue\n");
        System.out.println("[X] Exit");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }


















}
