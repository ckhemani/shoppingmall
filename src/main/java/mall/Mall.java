package mall;

import customers.Customer;
import employee.Employee;
import store.Store;

import java.util.*;

public class Mall {
    private String name;
    private String city;
    private String state;
    private ArrayList<Store> store = new ArrayList<>();
    private HashSet<Employee> employee = new HashSet<>();
}
