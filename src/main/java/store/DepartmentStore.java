package store;

import Interfaces.Items;

import java.util.HashMap;
import java.util.Scanner;

public class DepartmentStore extends Store implements Items {
    private int fittingRooms;
    Scanner deptScanner = new Scanner(System.in);

    public DepartmentStore(String storeName, int storeFloor, int storeNumber, long storePhoneNumber, int fittingRooms) {
        super(storeName, storeFloor, storeNumber, storePhoneNumber);
        this.fittingRooms = fittingRooms;
    }

    public int getFittingRooms() {
        return fittingRooms;
    }

    public void setFittingRooms(int fittingRooms) {
        this.fittingRooms = fittingRooms;
    }

    public void storeDetails(){
        System.out.println("I am Dept Store in Mall");
    }

    @Override
    public String toString() {
        return "DepartmentStore{" +
                "fittingRooms=" + fittingRooms +
                ", storeName='" + getStoreName() + '\'' +
                ", storeFloor=" + getStoreFloor()+
                ", storeNumber=" + getStoreName() +
                ", storePhoneNumber=" + getStorePhoneNumber() +
                '}' + "\n";
    }


    @Override
    public void item() {
        System.out.println("This is Dept Store Items");
        HashMap<String, Double> deptItems = new HashMap<>();
        deptItems.put("Pant",9.99);deptItems.put("Shirt",7.99);
        System.out.println("Please print the Items purchased by Customer");
        String deptItemsPurchased = deptScanner.next();
        deptItems.get(deptItemsPurchased);
    }
}
