import java.util.ArrayList;
import java.util.Scanner;

public class Warehouse {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Ships> ships = new ArrayList<>();
    private String name; //warehouse name
    String Input; // for managing
    static ArrayList<String> output = new ArrayList<>();

    public Warehouse() {
        this.ships = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //creatingShips
    public void ShipCreating(Ships shipObjects) {
        System.out.println("Choose name for the Ship: ");
        Input = scanner.next();
        shipObjects.setNameShip(Input); // setting the ship name
        System.out.println("Choose transport origin: ");
        Input = scanner.next();
        shipObjects.setOriginTransp(Input); // setting the ship name
        System.out.println("Choose home port: ");
        Input = scanner.next();
        shipObjects.setPortHome(Input); // setting the ship name
        System.out.println("Choose your destination: ");
        Input = scanner.next();
        shipObjects.setDestination(Input); // setting the ship name
        boolean LoopSeaPort = true;

        while (LoopSeaPort) { // change positions
            System.out.println(">>> Choose a container that you would like to add to ship >>> \n");
            System.out.println("1. Standard Container\n");
            System.out.println("2. Heavy Container\n");
            System.out.println("3. Refrigerated Container\n");
            System.out.println("4. Liquid Container\n");
            System.out.println("5. Explosive Container\n");
            System.out.println("6. Toxic Container\n");
            System.out.println("0.  Exit");

            String Input = scanner.next();
            switch (Input) { // also should change position
                case "1" -> { // first standart
                    ArrayList<StandardContainer> DeleteFromSet = new ArrayList<>();
                    System.out.println("Your containers: ");
                    Containers.InformationStandardC();  //Printing standard containers  // НЕТУ СКОПИРОВАНО
                    System.out.print("Choose ID of preferable  ");
                    int addContainer = scanner.nextInt();
                    for (StandardContainer standard : Containers.standardContainers) {
                        if (addContainer == standard.ID) {
                            shipObjects.standardContainers.add(standard);
                            shipObjects.Capacity = StandardContainer.capacity + StandardContainer.CapacityStandardWithoutCargo;
                            DeleteFromSet.add(standard);
                        }
                    }// CAPACITY here
                    Containers.standardContainers.removeAll(DeleteFromSet);
                    //shipObjects.standardContainer.add(Containers.standardContainers); //Adding standard containers to the Ship
                    while (shipObjects.Capacity >= 300) {  //If ship's capacity is equals or greater than 300 it will stop adding
                        System.out.println("""
                                You have exceed the maximum capacity for Ship
                                  In other words you have shit ton of cargo
                                            You must unload cargo""");
                        System.out.println("These are your containers:");
                        int count = 0;  //Just a number that comes before out cargos nothing special

                        //Prints all the cargos inside of container
                        for (String standard : StandardContainer.StandardTypeContainer) {
                            count++;
                            System.out.println(count + ". " + standard);
                        }

                        //User input
                        String inputUser = scanner.next();

                        ArrayList<String> removalList = new ArrayList<>();
                        for (String standard : StandardContainer.StandardTypeContainer) {
                            if (inputUser.equalsIgnoreCase(standard) && StandardContainer.StandardTypeContainer.contains(inputUser)) {
                                removalList.add(standard);
                                StandardContainer.capacity -= 100;
                                shipObjects.Capacity -= 100;
                            }
                        }
                        StandardContainer.StandardTypeContainer.removeAll(removalList);
                    }
                    //shipObjects.standardContainer.add(Containers.standardContainers); //Adding standard containers to the Ship
                    //Iterating through ArrayList of ArrayList and appending String contents to the builder
                    for (StandardContainer standards : shipObjects.standardContainers)
                        shipObjects.builder.append("\n\t").append(standards);
                }


                case "2" -> {  //Heavy Container

                    System.out.println("These are your heavy containers");
                    Containers.heavyInfo();  //Printing heavy containers
                    //capacity
                    shipObjects.Capacity = HeavyContainer.capacity + HeavyContainer.CapacityHeavyWithoutCargo;
                    while (shipObjects.Capacity >= 300) {  //If ship's capacity is equals or greater than 300 it will stop adding
                        System.out.println("""
                                You have exceed the maximum capacity for Ship
                                  In other words you have shit ton of cargo
                                            You must unload cargo""");
                        System.out.println("These are your containers:");
                        int count = 0;  //Just a number that comes before out cargos nothing special

                        //Prints all the cargos inside of container
                        for (String heavy : HeavyContainer.heavyContainer) {
                            count++;
                            System.out.println(count + ". " + heavy);
                        }

                        //User input
                        String Input2 = scanner.next();

                        ArrayList<String> removalList = new ArrayList<>();
                        for (String heavy : HeavyContainer.heavyContainer) {
                            if (Input2.equalsIgnoreCase(heavy) && HeavyContainer.heavyContainer.contains(Input2)) {
                                removalList.add(heavy);
                                StandardContainer.capacity -= 100;
                                shipObjects.Capacity -= 100;
                            }
                        }
                        StandardContainer.StandardTypeContainer.removeAll(removalList);
                    }
                    shipObjects.heavyContainer.add(Containers.heavyContainers);
                    for (ArrayList<HeavyContainer> heavies : shipObjects.heavyContainer)
                        for (HeavyContainer heavy : heavies) shipObjects.builder.append("\n\t").append(heavy);
                    Containers.heavyContainers.clear(); //Removes all the elements from collection
                }
                // PASTED IT FOR CONVENIENCE


                case "3" -> {  //Refrigerated Container
                    System.out.println("Refrigerated Containers: ");
                    Containers.refrigeratedInfo();  //Printing refrigerated containers
                    shipObjects.Capacity = RefrigeratedContainer.capacity;
                    while (shipObjects.Capacity >= 300) {  //If ship's capacity is equals or greater than 300 it will stop adding
                        System.out.println("""
                                You have exceed the maximum capacity for Ship
                                  In other words you have shit ton of cargo
                                            You must unload cargo""");
                        System.out.println("These are your containers:");
                        int count = 0;  //Just a number that comes before out cargos nothing special

                        //Prints all the cargos inside of container
                        for (String refrigerated : RefrigeratedContainer.refrigeratedContainer) {
                            count++;
                            System.out.println(count + ". " + refrigerated);
                        }

                        //User input
                        System.out.print("> ");
                        String inputUser = scanner.next();


                        ArrayList<String> removalList = new ArrayList<>();
                        for (String refrigerated : RefrigeratedContainer.refrigeratedContainer) {
                            if (inputUser.equalsIgnoreCase(refrigerated) && RefrigeratedContainer.refrigeratedContainer.contains(inputUser)) {
                                removalList.add(refrigerated);
                                RefrigeratedContainer.capacity -= 100;
                                shipObjects.Capacity -= 100;
                            }
                        }
                        RefrigeratedContainer.refrigeratedContainer.removeAll(removalList);
                    }
                    shipObjects.refrigeratedContainer.add(Containers.refrigeratedContainers); //Adding refrigerated containers to the Ship
                    //Iterating through ArrayList of ArrayList and appending String contents to the builder
                    for (ArrayList<RefrigeratedContainer> refrigerateds : shipObjects.refrigeratedContainer)
                        for (RefrigeratedContainer refrigerated : refrigerateds)
                            shipObjects.builder.append("\n\t").append(refrigerated);
                    Containers.refrigeratedContainers.clear(); //Removes all the elements from collection
                }

                case "4" -> {  //Liquid Container
                    System.out.println("+-----------------------------------------+");
                    System.out.println("These are your liquid containers");
                    Containers.liquidInfo();  //Printing liquid containers
                    System.out.println("+-----------------------------------------+");
                    shipObjects.Capacity = LiquidContainer.capacity + LiquidContainer.liquidCapacityWithoutCargo;
                    while (shipObjects.Capacity >= 300) {  //If ship's capacity is equals or greater than 300 it will stop adding
                        System.out.println("""
                                You have exceed the maximum capacity for Ship
                                  In other words you have shit ton of cargo
                                            You must unload cargo""");
                        System.out.println("These are your containers:");
                        int count = 0;  //Just a number that comes before out cargos nothing special

                        //Prints all the cargos inside of container
                        for (String liquid : LiquidContainer.liquidContainer) {
                            count++;
                            System.out.println(count + ". " + liquid);
                        }


                        String inputUser = scanner.next();


                        ArrayList<String> removalList = new ArrayList<>();
                        for (String liquid : LiquidContainer.liquidContainer) {
                            if (inputUser.equalsIgnoreCase(liquid) && LiquidContainer.liquidContainer.contains(inputUser)) {
                                removalList.add(liquid);
                                LiquidContainer.capacity -= 100;
                                shipObjects.Capacity -= 100;
                            }
                        }
                        LiquidContainer.liquidContainer.removeAll(removalList);
                    }
                    shipObjects.liquidContainer.add(Containers.liquidContainers); //Adding liquid containers to the Ship
                    //Iterating through ArrayList of ArrayList and appending String contents to the builder
                    for (ArrayList<LiquidContainer> liquids : shipObjects.liquidContainer)
                        for (LiquidContainer liquid : liquids) shipObjects.builder.append("\n\t").append(liquid);
                    Containers.liquidContainers.clear(); //Removes all the elements from collection
                }

                case "5" -> {  //Explosive Container
                    System.out.println("+-----------------------------------------+");
                    Containers.explosiveInfo();  //Printing explosive containers
                    shipObjects.Capacity = ExplosiveContainer.capacity + ExplosiveContainer.explosiveCapacityWithoutCargo;
                    while (shipObjects.Capacity >= 300) {  //If ship's capacity is equals or greater than 300 it will stop adding
                        System.out.println("""
                                You have exceed the maximum capacity for Ship
                                  In other words you have shit ton of cargo
                                            You must unload cargo""");
                        System.out.println("These are your containers:");
                        int count = 0;  //Just a number that comes before out cargos nothing special

                        //Prints all the cargos inside of container
                        for (String explosive : ExplosiveContainer.ExplosiveContianer) {
                            count++;
                            System.out.println(count + ". " + explosive);
                        }

                        //User input

                        String inputUser = scanner.next();
                        ArrayList<String> removalList = new ArrayList<>();
                        for (String explosive : ExplosiveContainer.ExplosiveContianer) {
                            if (inputUser.equalsIgnoreCase(explosive) && ExplosiveContainer.ExplosiveContianer.contains(inputUser)) {
                                removalList.add(explosive);
                                ExplosiveContainer.capacity -= 100;
                                shipObjects.Capacity -= 100;
                            }
                        }
                        ExplosiveContainer.ExplosiveContianer.removeAll(removalList);
                    }
                    shipObjects.explosiveContainer.add(Containers.explosiveContainers); //Adding explosive containers to the Ship
                    //Iterating through ArrayList of ArrayList and appending String contents to the builder
                    for (ArrayList<ExplosiveContainer> explosives : shipObjects.explosiveContainer)
                        for (ExplosiveContainer explosive : explosives)
                            shipObjects.builder.append("\n\t").append(explosive);
                    Containers.explosiveContainers.clear(); //Removes all the elements from collection
                }

                case "6" -> {  //Toxic Container
                    System.out.println("+-----------------------------------------+");
                    System.out.println("These are your toxic containers");
                    Containers.toxicInfo();  //Printing toxic containers
                    System.out.println("+-----------------------------------------+");
                    shipObjects.Capacity = ToxicContainer.capacity + ToxicContainer.toxicCapacityWithoutCargo;
                    while (shipObjects.Capacity >= 300) {  //If ship's capacity is equals or greater than 300 it will stop adding
                        System.out.println("""
                                You have exceed the maximum capacity for Ship
                                  In other words you have shit ton of cargo
                                            You must unload cargo""");
                        System.out.println("These are your containers:");
                        int count = 0;  //Just a number that comes before out cargos nothing special

                        //Prints all the cargos inside of container
                        for (String toxic : ToxicContainer.ToxicPowderyContainer) {
                            count++;
                            System.out.println(count + ". " + toxic);
                        }

                        //User input
                        System.out.print("> ");
                        String inputUser = scanner.next();


                        ArrayList<String> removalList = new ArrayList<>();
                        for (String toxic : ToxicContainer.ToxicPowderyContainer) {
                            if (inputUser.equalsIgnoreCase(toxic) && ToxicContainer.ToxicPowderyContainer.contains(inputUser)) {
                                removalList.add(toxic);
                                ToxicContainer.capacity -= 100;
                                shipObjects.Capacity -= 100;
                            }
                        }
                        ToxicContainer.ToxicPowderyContainer.removeAll(removalList);
                    }
                    shipObjects.toxicContainer.add(Containers.toxicContainers); //Adding toxic containers to the Ship
                    //Iterating through ArrayList of ArrayList and appending String contents to the builder
                    for (ArrayList<ToxicContainer> toxics : shipObjects.toxicContainer)
                        for (ToxicContainer toxic : toxics) shipObjects.builder.append("\n\t").append(toxic);
                    Containers.toxicContainers.clear(); //Removes all the elements from collection
                }

                case "F" -> LoopSeaPort = false;
            }
        }
        ships.add(shipObjects);
    }
}
