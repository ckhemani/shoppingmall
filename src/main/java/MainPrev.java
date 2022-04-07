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

public class MainPrev {

    private static final Path storeDatabase = Paths.get(System.getProperty("user.dir") + "\\malldata\\stores.txt");
    private static final Path customerDatabase = Paths.get(System.getProperty("user.dir") + "\\malldata\\customer.txt");
    private static final Path employeeDatabase = Paths.get(System.getProperty("user.dir") + "\\malldata\\employee.txt");
    private static final Scanner input = new Scanner(System.in);
    private static final Mall tysonCornerMall = new Mall("Tyson Mall","Mclean","VA");
    private static final DepartmentStore macy = new DepartmentStore("Macy",1,101,7770101,2);
    private static final GiftStore memories = new GiftStore("Memories",2,202,7770202,"anything");
    private static final CellServiceStore reachAnyWhere = new CellServiceStore("ReachAnywhere",3,303,7770303,"Verizon");

    private static final Customer cust01 = new Customer("cust01");
    private static final Customer cust02 = new Customer("cust02");
    private static final Customer cust03 = new Customer("cust03");

    private static final EmailID cust01emailID = new EmailID("cust01@gmail.com");
    private static final EmailID cust02emailID = new EmailID("cust02@gmail.com");
    private static final EmailID cust03emailID = new EmailID("cust03@gmail.com");


    public static void main(String[] args) {
//        System.out.println(macy.getStoreName());
//        System.out.println(memories.getStoreName());
//        System.out.println(reachAnyWhere.getStoreName());
//        System.out.println(tysonCornerMall);
//        System.out.println(tysonCornerMall.getMallCity());

        // Greetings
        welcomeToMall();
//
//        // Create Files for Stores, Customer and Employee.
////        createAFileForStore();
////        createAFileForCustomer();
////        createAFileForEmployee();
//
//        //Adding Stores in StoreList
////        addDeptStore();
////        addGiftStore();
////        addCellServiceStore();
//
//        //Register Store In Mall Database
//        registerStoreInMall();
//
//        // Register Employees in Mall Database
//        addEmployeeToMallDatabase();
//
//        // Register new Customer and Email ID
//        addCustomertoMallDatabase();
//  //      registerCustomertoMallDatabase();
//
//
//        System.out.println(tysonCornerMall.getMallCity());
//        System.out.println(tysonCornerMall.getMallName());
//        System.out.println(tysonCornerMall.getMallState());
//
//        macy.storeDetails();
//        memories.storeDetails();

//        ArrayList<Employee> testEmployee = new ArrayList<>();
//
//        testEmployee.add(employeeData("test1","test1234","abcdefgh"));
//        testEmployee.add(employeeData("test2","test1234","abcdefgh"));
//        testEmployee.add(employeeData("test3","test1234","abcdefgh"));
//
//        writeAFileforEmployee(testEmployee);

          Employee employee1 = new Employee("Chandru1","ck1234","ck123456");
          Employee employee2 = new Employee("Chandru2","ck1234","ck123456");
      //  StandardOpenOption.APPEND, StandardOpenOption.CREATE
    }


    public static Employee employeeData(String name,String userID, String password){
 //       public static Employee employeeData(String name,String userID, String password){

        Employee employees = new Employee(name, userID, password);

        System.out.println(employees);


        return employees;

        //method to add employee to File
   //     createAFileForEmployee();

    }

    public static void createAFileForEmployee(){
        try{
            Files.createFile(employeeDatabase);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void writeAFileforEmployee(ArrayList<Employee> employee){
        try{
            Files.writeString(employeeDatabase,employee.toString(),StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void welcomeToMall(){
        System.out.println("Welcome to " + tysonCornerMall.getMallName()  + " the Biggest Mall in Virginia");
    }

//    public static void addDeptStore(){
//        System.out.println("How many Dept Store you want to add");
//        int numberOfDeptStoretobeadd = input.nextInt();
//        for (int i=0; i< numberOfDeptStoretobeadd;i++) {
//            System.out.println("Enter the Object Name for Department Store");
//            String objectDeptStoreName = input.next();
//            System.out.println("Enter the dept store you want to name");
//            String deptStoreName = input.next();
//            System.out.println("Enter Floor");
//            int deptStoreFloors = input.nextInt();
//            System.out.println("Enter StoreNumber");
//            int deptStoreNumber = input.nextInt();
//            System.out.println("Phone Number");
//            long deptStorePhone = input.nextLong();
//            System.out.println("Number of Fitting Rooms");
//            int deptFittingRoom = input.nextInt();
//
//            DepartmentStore ObjectDeptStoreName = new DepartmentStore(deptStoreName, deptStoreFloors, deptStoreNumber, deptStorePhone, deptFittingRoom);
//            System.out.println(ObjectDeptStoreName);
//        }
//    }
//
//    public static void addGiftStore(){
//        System.out.println("Enter the Object Name for Gift Store");
//        String objectGiftStoreName = input.next();
//        System.out.println("Enter the Gift store you want to name");
//        String giftStoreName = input.next();
//        System.out.println("Enter Floor");
//        int giftStoreFloors = input.nextInt();
//        System.out.println("Enter StoreNumber");
//        int giftStoreNumber = input.nextInt();
//        System.out.println("Phone Number");
//        long giftStorePhone = input.nextLong();
//        System.out.println("Enter the Occassion it is famous for");
//        String giftOccasion = input.next();
//
//        GiftStore ObjectGiftStoreName = new GiftStore(giftStoreName,giftStoreFloors,giftStoreNumber,giftStorePhone,giftOccasion);
//        System.out.println(ObjectGiftStoreName);
//    }
//
//    public static void addCellServiceStore(){
//        System.out.println("Enter the Object Name for Cell Service Store");
//        String objectCellServiceStoreName = input.next();
//        System.out.println("Enter the Cell Service store you want to name");
//        String cellServiceStoreName = input.next();
//        System.out.println("Enter Floor");
//        int cellServiceStoreFloors = input.nextInt();
//        System.out.println("Enter StoreNumber");
//        int cellServiceStoreNumber = input.nextInt();
//        System.out.println("Phone Number");
//        long cellServiceStorePhone = input.nextLong();
//        System.out.println("Enter the Cell service it provides");
//        String cellServiceprovider = input.next();
//
//        CellServiceStore ObjectcellServiceStoreName = new CellServiceStore(cellServiceStoreName,cellServiceStoreFloors,cellServiceStoreNumber,cellServiceStorePhone,cellServiceprovider);
//        System.out.println(ObjectcellServiceStoreName);
//    }

    public static void registerStoreInMall(){
        // Adding all stores listed in Mall.
        HashSet<Store> storeList = new LinkedHashSet<>();
        storeList.add(macy);storeList.add(memories);storeList.add(reachAnyWhere);
        tysonCornerMall.setStore(storeList);
        System.out.println(tysonCornerMall.getStore());

    }

    public static void addEmployeeToMallDatabase(){


        ArrayList<Employee> employeeOfStore = new ArrayList<>();
       // employeeOfStore.add(employee1);employeeOfStore.add(employee2);employeeOfStore.add(employee3);

        tysonCornerMall.setEmployee(employeeOfStore);
        System.out.println(tysonCornerMall.getEmployee().get(0));

    }

    public static void addCustomertoMallDatabase(){
        HashMap<Customer,EmailID> customerVisiting = new HashMap<>();
        customerVisiting.put(cust01,cust01emailID);customerVisiting.put(cust02,cust02emailID);customerVisiting.put(cust03,cust03emailID);

        tysonCornerMall.setCustomer(customerVisiting);
        System.out.println(tysonCornerMall.getCustomer().get(cust01));
    }

//    public static void createAFileForStore(){
//        try{
//            Files.createFile(storeDatabase);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void createAFileForCustomer(){
//        try{
//            Files.createFile(storeDatabase);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void createAFileForEmployee(){
//        try{
//            Files.createFile(storeDatabase);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void writeAFileforStore(Object){
//        try{
//            Files.writeString(storeDatabase,);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void writeAFileforCustomer(){
//        try{
//            Files.writeString(customerDatabase,"This is the end my Friend..");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void writeAFileforEmployee(){
//        try{
//            Files.writeString(employeeDatabase,"This is the end my Friend..");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    public static void registerCustomertoMallDatabase() {
//        System.out.println("""
//                add : to add the Customer in Database
//                exit : to exit done with Customer Addition
//                """);
//        String custAction = input.next();
//
//        System.out.println("Please enter the number of Customers to be entered?");
//        int customerNumbers = input.nextInt();
//
//        while (customerNumbers > 0) {
//            switch (custAction) {
//                case "add":
//                    System.out.println("Adding the Customer to Mall Database");
//                    System.out.println("Please enter your Name");
//                    String cName = input.next();
//                    Customer cust = new Customer(cName);
//
//                    System.out.println("Please enter your emailID");
//                    String cEmailID = input.next();
//                    EmailID custEmailID = new EmailID(cEmailID);
//
//                    HashMap<Customer, EmailID> customer = new HashMap<>();
//                    customer.put(cust, custEmailID);
//                    System.out.println(customer);
//                    break;
//                case "exit":
//                    System.out.println("Exit it out of this menu");
//                    break;
//                default:
//                    System.out.println("Select either a OR e");
//                    break;
//
//            }
//            customerNumbers--;
////            tysonCornerMall.getCustomer();

//        }

}
