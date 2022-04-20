package store;

import Interfaces.IBill;
import Interfaces.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DepartmentStore extends Store implements Items, IBill {
    private int fittingRooms;
    private static Scanner deptScanner = new Scanner(System.in);

    public DepartmentStore(){
    }

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
        System.out.println();
        return "DepartmentStore{" +
                "fittingRooms=" + fittingRooms +
                ", storeName='" + getStoreName() + '\'' +
                ", storeFloor=" + getStoreFloor()+
                ", storeNumber=" + getStoreName() +
                ", storePhoneNumber=" + getStorePhoneNumber() +
                '}';
    }


    public HashMap<String, Double> item() {
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
        return deptItems;
    }

    @Override
    public double bill() {
        double saleTax = 0.06;
        double totalCost = 0.0;
        HashMap<String,Double> itemPrice = new HashMap<>();
        itemPrice.put("Pant",30.0);
        itemPrice.put("Shirt",10.0);
        itemPrice.put("Luggage",100.0);
        itemPrice.put("Wallet",20.0);
        System.out.println("Please enter number of items to be bought");
        int numberOfItems = deptScanner.nextInt();
        for (int i=0;i< numberOfItems;i++) {
            System.out.println("Please enter the item purchased from Dept Store? Pant/Shirt/Luggage/Wallet");
            String itemBought = deptScanner.next();
            System.out.println("Please enter the quantity bought");
            int quantity = deptScanner.nextInt();
            Double cost = itemPrice.get(itemBought) * quantity;
            totalCost+=cost;
        }
        double totalBill = (totalCost * saleTax) + totalCost;
        return totalBill;
    }

    public void check(){
        System.out.println("Checking interface with Default method");
    }
}
