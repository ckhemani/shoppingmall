import Email.EmailID;
import customers.Customer;
import employee.Employee;
import mall.Mall;
import store.CellServiceStore;
import store.DepartmentStore;
import store.GiftStore;
import store.Store;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {
    // File Path for Each Database to be kept.
    private static final Path storeDatabase = Paths.get(System.getProperty("user.dir") + "\\malldata\\stores.txt");
    private static final Path customerDatabase = Paths.get(System.getProperty("user.dir") + "\\malldata\\customer.txt");
    private static final Path employeeDatabase = Paths.get(System.getProperty("user.dir") + "\\malldata\\employee.txt");
    private static final Path mallDatabase = Paths.get(System.getProperty("user.dir") + "\\malldata\\mall.txt");

    //Type Interface

    // Global Scanner for int, String ....
    private static final Scanner input = new Scanner(System.in);

    // Creating Mall Object
    private static final Mall tysonCornerMall = new Mall("Tyson Mall", "Mclean", "VA");


    public static void main(String[] args) {

        // Greetings
        welcomeToMall();

        // Create File for Store,Employee,Customer and Mall Database
        createAFileForStore();
        createAFileForEmployee();
        createAFileForCustomer();
        createAFileForMall();

        while(true) {
            System.out.println("""
                    Please enter choice what you want to do?
                    A. To add Store in Mall Database        D. To add Items to Department Store         G. Billing for Department Store 
                    B. To add Employee to Mall Database     E. To add Items to Gift Store               H. Billing for Gift Store
                    C. To add Customer to Mall Database     F. To add Items to Cell Service Store       I. Billing for Cell Service Store
                    Y. To Read all Files created  
                    Z. Exit the Menu""");

            String choice = input.next();
            switch (choice) {
                case "A":
                    //Adding Stores in StoreDatabase and writing to stores.txt file
                    System.out.println("Please enter the Number of Store to be added");
                    int storeToBeAddedInMall = input.nextInt();
                    System.out.println("You have selected " + storeToBeAddedInMall + " to be added in Mall Database");
                    tysonCornerMall.setStore(storeToBeAddedInMallDatabase(storeToBeAddedInMall));
                    System.out.println(tysonCornerMall.getStore());
                    writeAFileForStore();
                    break;
                case "B":
                    //Adding Store Employees in EmployeeDatabase and writing to employee.txt file
                    tysonCornerMall.setEmployee(addEmployee());
                    System.out.println(tysonCornerMall.getEmployee());
                    writeAFileForEmployee();
                    break;
                case "C":
                    //Adding Visting Customer in CustomerDatabase and Writing to Customer.txt file
                    tysonCornerMall.setCustomer(addCustomerandEmailID());
                    System.out.println(tysonCornerMall.getCustomer());
                    System.out.println(tysonCornerMall);
                    writeAFileForCustomer();
                    break;
                case "D":
                    //Adding Items for Department store
                    addDeptStoreItems();
                    break;
                case "E":
                    //Adding Items for Gift Store
                    addGiftStoreItems();
                    break;
                case "F":
                    //Adding  Items for Cell Service store
                    addCellServiceStoreItems();
                    break;
                case "G":
                    //Billing for Dept Store
                    DeptStoreBill();
                    break;
                case "H":
                    //Billing for Gift Store
                    giftStoreBill();
                    break;
                case "I":
                    //Billing for Cell Service Store
                    cellServiceStoreBill();
                    break;
                case "Y":
                    //Read all Files
                    readAllFiles();
                    break;
                case "Z":
                    System.exit(0);
                default:
                    System.out.println("Please select choice A-E");
            }
        }
    }

    public static void welcomeToMall() {
        System.out.println("Welcome to " + tysonCornerMall.getMallName() + " the Biggest Mall in Virginia");
    }

    public static void createAFileForStore() {
        try {
            if (Files.notExists(storeDatabase)) {
                Files.createFile(storeDatabase);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createAFileForEmployee() {
        try {
            if (Files.notExists(employeeDatabase)) {
                Files.createFile(employeeDatabase);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createAFileForCustomer() {
        try {
            if (Files.notExists(customerDatabase)) {
                Files.createFile(customerDatabase);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createAFileForMall() {
        try {
            if (Files.notExists(mallDatabase)) {
                Files.createFile(mallDatabase);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static HashSet<Store> storeToBeAddedInMallDatabase(int numberOfStoresToBeAddedInMall) {
        HashSet<Store> storeList = new LinkedHashSet<>();
        while (numberOfStoresToBeAddedInMall > 0) {
            System.out.println("""
            1 to add Dept Store.
            2 to add Gift Store.
            3 to add CellService Store.
            10 to exit of Switch loop
            """);
            String selectStore = input.next();

            try {
                int seeWhereInputisInt = Integer.parseInt(selectStore);
                System.out.println("Valid Input in int");
            } catch (NumberFormatException e) {
                System.out.println("Input is not valid int. Please try again");
            }

            switch (selectStore) {
                case "1":
                    System.out.println("adding the Dept store in Mall Database");
                    storeList.add(addDeptStore());
                    break;
                case "2":
                    System.out.println("adding the Gift Store in Mall Database");
                    storeList.add(addGiftStore());
                    break;
                case "3":
                    System.out.println("adding the Cell Service Store in Mall Database");
                    storeList.add(addCellServiceStore());
                    break;
                case "10":
                    System.out.println("Exit from While Loop");
                    numberOfStoresToBeAddedInMall = 0;
                default:
                    numberOfStoresToBeAddedInMall++;
                    break;
            }
            numberOfStoresToBeAddedInMall--;
        }
        return storeList;
    }


    public static Store addDeptStore() {
        System.out.println("Enter the Object Name for Department Store");
        String objectDeptStoreName = input.next();
        System.out.println("Enter the dept store you want to name");
        String deptStoreName = input.next();
        System.out.println("Enter Floor");
        int deptStoreFloors = input.nextInt();
        System.out.println("Enter StoreNumber");
        int deptStoreNumber = input.nextInt();
        System.out.println("Phone Number");
        long deptStorePhone = input.nextLong();
        System.out.println("Number of Fitting Rooms");
        int deptFittingRoom = input.nextInt();

        DepartmentStore ObjectDeptStoreName = new DepartmentStore(deptStoreName, deptStoreFloors, deptStoreNumber, deptStorePhone, deptFittingRoom);
        ObjectDeptStoreName.storeDetails();
        ObjectDeptStoreName.item();

        return ObjectDeptStoreName;
    }

    public static Store addGiftStore() {
        System.out.println("Enter the Object Name for Gift Store");
        String objectGiftStoreName = input.next();
        System.out.println("Enter the gift store you want to name");
        String giftStoreName = input.next();
        System.out.println("Enter Floor");
        int giftStoreFloors = input.nextInt();
        System.out.println("Enter StoreNumber");
        int giftStoreNumber = input.nextInt();
        System.out.println("Phone Number");
        long giftStorePhone = input.nextLong();
        System.out.println("Occasion it is famous for");
        String giftOccasion = input.next();

        GiftStore ObjectGiftStoreName = new GiftStore(giftStoreName, giftStoreFloors, giftStoreNumber, giftStorePhone, giftOccasion);
        ObjectGiftStoreName.storeDetails();
        ObjectGiftStoreName.item();

        return ObjectGiftStoreName;
    }

    public static Store addCellServiceStore() {
        System.out.println("Enter the Object Name for Cell Service Store");
        String objectCellServiceStoreName = input.next();
        System.out.println("Enter the Cell Service store you want to name");
        String cellServiceStoreName = input.next();
        System.out.println("Enter Floor");
        int cellServiceStoreFloors = input.nextInt();
        System.out.println("Enter StoreNumber");
        int cellServiceStoreNumber = input.nextInt();
        System.out.println("Phone Number");
        long cellServiceStorePhone = input.nextLong();
        System.out.println("Enter the Cell service it provides");
        String cellServiceprovider = input.next();

        CellServiceStore ObjectcellServiceStoreName = new CellServiceStore(cellServiceStoreName, cellServiceStoreFloors, cellServiceStoreNumber, cellServiceStorePhone, cellServiceprovider);
        ObjectcellServiceStoreName.storeDetails();

        return ObjectcellServiceStoreName;
    }

    public static HashMap<String, Double> addDeptStoreItems() {
        HashMap<String,Double> deptStoreItems = new HashMap<>();
        System.out.println("Enter the Object Name for Department Store");
        String objectDeptStoreName = input.next();
        System.out.println("Enter the dept store you want to name");
        String deptStoreName = input.next();
        System.out.println("Enter Floor");
        int deptStoreFloors = input.nextInt();
        System.out.println("Enter StoreNumber");
        int deptStoreNumber = input.nextInt();
        System.out.println("Phone Number");
        long deptStorePhone = input.nextLong();
        System.out.println("Number of Fitting Rooms");
        int deptFittingRoom = input.nextInt();

        DepartmentStore ObjectDeptStoreName = new DepartmentStore(deptStoreName, deptStoreFloors, deptStoreNumber, deptStorePhone, deptFittingRoom);
        deptStoreItems = ObjectDeptStoreName.item();

        return deptStoreItems;
    }


    public static HashMap<String, Double> addGiftStoreItems() {
        HashMap<String,Double> giftStoreItems = new HashMap<>();
        System.out.println("Enter the Object Name for Gift Store");
        String objectGiftStoreName = input.next();
        System.out.println("Enter the gift store you want to name");
        String giftStoreName = input.next();
        System.out.println("Enter Floor");
        int giftStoreFloors = input.nextInt();
        System.out.println("Enter StoreNumber");
        int giftStoreNumber = input.nextInt();
        System.out.println("Phone Number");
        long giftStorePhone = input.nextLong();
        System.out.println("Occasion it is famous for");
        String giftOccasion = input.next();

        GiftStore ObjectGiftStoreName = new GiftStore(giftStoreName, giftStoreFloors, giftStoreNumber, giftStorePhone, giftOccasion);
        giftStoreItems = ObjectGiftStoreName.item();

        return giftStoreItems;
    }

    public static HashMap<String, Double> addCellServiceStoreItems() {
        HashMap<String,Double> cellServiceStoreItems = new HashMap<>();
        System.out.println("Enter the Object Name for Cell Service Store");
        String objectCellServiceStoreName = input.next();
        System.out.println("Enter the Cell Service store you want to name");
        String cellServiceStoreName = input.next();
        System.out.println("Enter Floor");
        int cellServiceStoreFloors = input.nextInt();
        System.out.println("Enter StoreNumber");
        int cellServiceStoreNumber = input.nextInt();
        System.out.println("Phone Number");
        long cellServiceStorePhone = input.nextLong();
        System.out.println("Enter the Cell service it provides");
        String cellServiceprovider = input.next();

        CellServiceStore ObjectcellServiceStoreName = new CellServiceStore(cellServiceStoreName, cellServiceStoreFloors, cellServiceStoreNumber, cellServiceStorePhone, cellServiceprovider);
        cellServiceStoreItems = ObjectcellServiceStoreName.item();

        return cellServiceStoreItems;
    }

    public static Double DeptStoreBill() {
        Double totalCost;
        System.out.println("Enter the Object Name for Department Store");
        String objectDeptStoreName = input.next();
        System.out.println("Enter the dept store you want to name");
        String deptStoreName = input.next();
        System.out.println("Enter Floor");
        int deptStoreFloors = input.nextInt();
        System.out.println("Enter StoreNumber");
        int deptStoreNumber = input.nextInt();
        System.out.println("Phone Number");
        long deptStorePhone = input.nextLong();
        System.out.println("Number of Fitting Rooms");
        int deptFittingRoom = input.nextInt();

        DepartmentStore ObjectDeptStoreName = new DepartmentStore(deptStoreName, deptStoreFloors, deptStoreNumber, deptStorePhone, deptFittingRoom);
        totalCost = ObjectDeptStoreName.bill();

        System.out.println(totalCost);

        return totalCost;
    }

    public static Double giftStoreBill() {
        Double totalCost;
        System.out.println("Enter the Object Name for Gift Store");
        String objectGiftStoreName = input.next();
        System.out.println("Enter the gift store you want to name");
        String giftStoreName = input.next();
        System.out.println("Enter Floor");
        int giftStoreFloors = input.nextInt();
        System.out.println("Enter StoreNumber");
        int giftStoreNumber = input.nextInt();
        System.out.println("Phone Number");
        long giftStorePhone = input.nextLong();
        System.out.println("Occasion it is famous for");
        String giftOccasion = input.next();

        GiftStore ObjectGiftStoreName = new GiftStore(giftStoreName, giftStoreFloors, giftStoreNumber, giftStorePhone, giftOccasion);
        totalCost = ObjectGiftStoreName.bill();

        System.out.println(totalCost);

        return totalCost;
    }

    public static Double cellServiceStoreBill() {
        Double totalCost;
        System.out.println("Enter the Object Name for Cell Service Store");
        String objectCellServiceStoreName = input.next();
        System.out.println("Enter the Cell Service store you want to name");
        String cellServiceStoreName = input.next();
        System.out.println("Enter Floor");
        int cellServiceStoreFloors = input.nextInt();
        System.out.println("Enter StoreNumber");
        int cellServiceStoreNumber = input.nextInt();
        System.out.println("Phone Number");
        long cellServiceStorePhone = input.nextLong();
        System.out.println("Enter the Cell service it provides");
        String cellServiceprovider = input.next();

        CellServiceStore ObjectcellServiceStoreName = new CellServiceStore(cellServiceStoreName, cellServiceStoreFloors, cellServiceStoreNumber, cellServiceStorePhone, cellServiceprovider);
        totalCost = ObjectcellServiceStoreName.bill();

        System.out.println(totalCost);

        return totalCost;
    }

    public static void writeAFileForStore() {
        try {
            String storetoadd = String.valueOf(tysonCornerMall.getStore());
            Files.writeString(storeDatabase, storetoadd, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Employee> addEmployee() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        System.out.println("Enter the Object to be created for Employee");
        String myObjectEmployeeeName = input.next();
        System.out.println("Enter the Employee Name");
        String myemployeeName = input.next();
        System.out.println("Enter the Employee UserID Name");
        String myemployeeUserID = input.next();
        System.out.println("Enter the Employee Password");
        String myemployeePassword = input.next();

        Employee myObjectEmployeeName = new Employee(myemployeeName, myemployeeUserID, myemployeePassword);
        employeeList.add(myObjectEmployeeName);
        return employeeList;
    }

    public static void writeAFileForEmployee() {
        try {
            String employeeToAdd = String.valueOf(tysonCornerMall.getEmployee());
            Files.writeString(employeeDatabase, employeeToAdd, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static HashMap<Customer, EmailID> addCustomerandEmailID() {
        HashMap<Customer, EmailID> customerList = new HashMap<>();

        System.out.println("Enter the Customer Name");
        String myCustomerName = input.next();
        Customer myCustomer = new Customer(myCustomerName);


        System.out.println("Enter the Customer EmailID");
        String mycustomerEmailID = input.next();
        EmailID myCustomerEmailID = new EmailID(mycustomerEmailID);

        customerList.put(myCustomer, myCustomerEmailID);
        System.out.println(customerList);
        return customerList;
    }

    public static void writeAFileForCustomer() {
        try {
            String CustomerToAdd = String.valueOf(tysonCornerMall.getCustomer());
            Files.writeString(customerDatabase, CustomerToAdd, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeAFileForMall() {
        try {
            String MallToAdd = String.valueOf(tysonCornerMall);
            Files.writeString(mallDatabase, MallToAdd, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readAllFiles(){
        String tempMall; String tempCustomer;String tempEmployee;String tempStore;
        try{
            tempMall = Files.readString(mallDatabase);
            System.out.println("reading Mall Database " + "\n" + tempMall);
            tempCustomer = Files.readString(customerDatabase);
            System.out.println("reading Customer Database " + "\n" +tempCustomer);
            tempEmployee = Files.readString(employeeDatabase);
            System.out.println("reading Employee Database " + "\n" +tempEmployee);
            tempStore = Files.readString(storeDatabase);
            System.out.println("reading Store Database " + "\n" + tempStore);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readStoreFile(){
        String tempMall; String tempCustomer;String tempEmployee;String tempStore;
        try{
            String[] test1;
            ArrayList<String> test = new ArrayList<>();
            tempStore = Files.readString(storeDatabase);
//            tempStore = Files.readAllLines(storeDatabase)
            System.out.println("reading Store Database " + "\n" + tempStore);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//    public static Store addStore(String storeType) {
//        System.out.println("Enter the Object Name for Department/Gift/Cell Store");
//        String objectStoreTypeName = input.next();
//        System.out.println("Enter the Department/Gift/Cell store you want to name");
//        String StoreName = input.next();
//        System.out.println("Enter Floor Number of Department/Gift/Cell Store");
//        int StoreFloors = input.nextInt();
//        System.out.println("Enter StoreNumber of Department/Gift/Cell Store");
//        int StoreNumber = input.nextInt();
//        System.out.println("Phone Number of Department/Gift/Cell");
//        long StorePhone = input.nextLong();
//        if(storeType.equals("Dept")){
//            System.out.println("Number of Fitting Rooms in Department Store");
//            int deptFittingRoom = input.nextInt();
//            DepartmentStore objectDeptStoreName = new DepartmentStore(StoreName, StoreFloors, StoreNumber, StorePhone, deptFittingRoom);
//            objectDeptStoreName.storeDetails();
//            return objectDeptStoreName;
//        }
//        else if (storeType.equals("Gift")){
//            System.out.println("Gift Occasion it is famous for");
//            String giftOccasion = input.next();
//            GiftStore objectGiftStoreName = new GiftStore(StoreName, StoreFloors, StoreNumber, StorePhone, giftOccasion);
//            objectGiftStoreName.storeDetails();
//            return objectGiftStoreName;
//        }
//        else if(storeType.equals("Cell")){
//            System.out.println("Enter the Cell service it provides");
//            String cellServiceprovider = input.next();
//            CellServiceStore objectCellServiceStoreName = new CellServiceStore(StoreName, StoreFloors, StoreNumber, StorePhone, cellServiceprovider);
//            objectCellServiceStoreName.storeDetails();
//            return objectCellServiceStoreName;
//        }
//        else{
//            System.out.println("Please enter Dept/Gift/Cell to add Store");
//        }
//    }
