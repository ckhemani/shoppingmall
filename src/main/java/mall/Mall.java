package mall;

import Email.EmailID;
import customers.Customer;
import employee.Employee;
import store.Store;

import java.util.*;

public class Mall {
    private String mallName;
    private String mallCity;
    private String mallState;
    private HashSet<Store> store = new LinkedHashSet<>();
    private ArrayList<Employee> employee = new ArrayList<>();
    private HashMap<Customer, EmailID> customer = new HashMap<>();

    // Constructor with no Fields initialize
    public Mall() {
    }

    //Constructor with Field Initialization
    public Mall(String mallName, String mallCity, String mallState) {
        this.mallName = mallName;
        this.mallCity = mallCity;
        this.mallState = mallState;
    }

    //Getters and Setters


    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getMallCity() {
        return mallCity;
    }

    public void setMallCity(String mallCity) {
        this.mallCity = mallCity;
    }

    public String getMallState() {
        return mallState;
    }

    public void setMallState(String mallState) {
        this.mallState = mallState;
    }

    public HashSet<Store> getStore() {
        return store;
    }

    public void setStore(HashSet<Store> store) {
        this.store = store;
    }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }

    public HashMap<Customer, EmailID> getCustomer() {
        return customer;
    }

    public void setCustomer(HashMap<Customer, EmailID> customer) {
        this.customer = customer;
    }

    // Methods

    public void cart(){
        System.out.println("Please add items in your Card");
    }

    @Override
    public String toString() {
        return "Mall{" +
                "mallName='" + mallName + '\'' +
                ", mallCity='" + mallCity + '\'' +
                ", mallState='" + mallState + '\'' +
                ", store=" + store +
                ", employee=" + employee +
                ", customer=" + customer +
                '}' + "\n";
    }
}
