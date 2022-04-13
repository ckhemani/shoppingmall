package store;

import Interfaces.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CellServiceStore extends Store implements Items {
    private String cellService;
    Scanner cellScanner = new Scanner(System.in);


    public CellServiceStore(String storeName, int storeFloor, int storeNumber, long storePhoneNumber, String cellService) {
        super(storeName, storeFloor, storeNumber, storePhoneNumber);
        this.cellService = cellService;
    }

    public String getCellService() {
        return cellService;
    }

    public void setCellService(String cellService) {
        this.cellService = cellService;
    }

    public void storeDetails(){
        System.out.println("I am CellService Store in Mall");
    }

    @Override
    public String toString() {
        return "CellServiceStore{" +
                "cellService='" + cellService + '\'' +
                ", storeName='" + getStoreName() + '\'' +
                ", storeFloor=" + getStoreFloor()+
                ", storeNumber=" + getStoreName() +
                ", storePhoneNumber=" + getStorePhoneNumber() +
                '}' + "\n";
    }

    @Override
    public void item() {
        System.out.println("This is Cell Service Items");
        HashMap<String,Double> cellServiceItems = new HashMap<>();
        HashSet <String> itemNames = new HashSet<>();
        ArrayList<Double> itemPrices = new ArrayList<>();
        System.out.println("Please enter the Number of Items to be added in Cell Service Store Sold in Cell Store?");
        int numberOfItems = cellScanner.nextInt();
        for (int i = 0;i<numberOfItems;i++){
            System.out.println("Please enter the items for sale");
            String itemsForSale = cellScanner.next();
            System.out.println("Please enter its Prices");
            double itemsPriced = cellScanner.nextDouble();
            cellServiceItems.put(itemsForSale,itemsPriced);
        }
        cellServiceItems.put("Apple Iphone 13",1299.99);
        cellServiceItems.put("Samsung S21", 899.99);
        cellServiceItems.put("Bluetooth Speakers", 49.99);
        cellServiceItems.put("Apple Iphone Cover",29.99);
        System.out.println(cellServiceItems);
    }
}