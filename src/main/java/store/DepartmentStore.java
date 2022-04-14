package store;

import Interfaces.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DepartmentStore extends Store implements Items{
    private int fittingRooms;
    private static Scanner deptScanner = new Scanner(System.in);

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


    public void item() {
        System.out.println("This is Dept Store Items");
        HashMap<String,Double> deptItems = new HashMap<>();
        HashSet<String> itemNames = new HashSet<>();
        ArrayList<Double> itemPrices = new ArrayList<>();
        System.out.println("Please enter the Number of Items to be added in Department Store Sold in Store?");
        int numberOfItems = deptScanner.nextInt();
        for (int i = 0;i<numberOfItems;i++){
            System.out.println("Please enter the items for sale");
            String itemsForSale = deptScanner.next();
            System.out.println("Please enter its Prices");
            double itemsPriced = deptScanner.nextDouble();
            deptItems.put(itemsForSale,itemsPriced);
        }
        System.out.println(deptItems) ;
    }
}
