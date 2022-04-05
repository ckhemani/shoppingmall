import Email.EmailID;
import customers.Customer;
import employee.Employee;
import mall.Mall;
import store.CellServiceStore;
import store.DepartmentStore;
import store.GiftStore;
import store.Store;

import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    private static final Path mallDatabase = Paths.get(System.getProperty("user.dir") + "\\malldata\\malldetails.txt");
    private static final Scanner input = new Scanner(System.in);
    private static final Mall tysonCornerMall = new Mall("Tyson Mall","Mclean","VA");
    private static final DepartmentStore macy = new DepartmentStore("Macy",1,101,7770101,2);
    private static final GiftStore memories = new GiftStore("Memories",2,202,7770202,"anything");
    private static final CellServiceStore reachAnyWhere = new CellServiceStore("ReachAnywhere",3,303,7770303,"Verizon");
    private static final Employee employee1 = new Employee("employee1","employee1UserID","abcdefgh");
    private static final Employee employee2 = new Employee("employee2","employee2UserID","abcdefgh");
    private static final Employee employee3 = new Employee("employee3","employee3UserID","abcdefgh");

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

        //Register Store In Mall Database
        registerStoreInMall();

        // Register Employees in Mall Database
        addEmployeeToMallDatabase();

        // Customer add in Mall Database
        addCustomertoMallDatabase();
    }

    public static void welcomeToMall(){
        System.out.println("Welcome to " + tysonCornerMall.getMallName()  + " the Biggest Mall in Virginia");
    }

    public static void registerStoreInMall(){
        // Adding all stores listed in Mall.
        HashSet<Store> storeList = new HashSet<>();
        storeList.add(macy);storeList.add(memories);storeList.add(reachAnyWhere);
        System.out.println(storeList);
    }

    public static void addEmployeeToMallDatabase(){

        ArrayList<Employee> employee = new ArrayList<>();

//        System.out.println("Please enter the Employee Name");
//        String eName = input.nextLine();
//        System.out.println("Please enter the Employee UserID");
//        String eUserID = input.nextLine();
//        System.out.println("Please enter the Employee Password");
//        String ePassword = input.nextLine();

        employee.add(employee1);employee.add(employee2);employee.add(employee3);
        System.out.println(employee);

    }

    public static void addCustomertoMallDatabase(){
        HashMap<Customer,EmailID> test = new HashMap<>();
        test.put(cust01,cust01emailID);test.put(cust02,cust02emailID);test.put(cust03,cust03emailID);

        System.out.println(test);
    }
}
