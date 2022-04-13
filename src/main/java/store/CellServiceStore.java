package store;

import Interfaces.Items;

import java.util.HashMap;

public class CellServiceStore extends Store implements Items {
    String cellService;


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
                ", storeName='" + storeName + '\'' +
                ", storeFloor=" + storeFloor +
                ", storeNumber=" + storeNumber +
                ", storePhoneNumber=" + storePhoneNumber +
                '}' + "\n";
    }

    @Override
    public void item() {
        System.out.println("This is Cell Service Items");
        HashMap<String,Double> cellServiceItems = new HashMap<>();
        cellServiceItems.put("Apple Iphone 13",1299.99);
        cellServiceItems.put("Samsung S21", 899.99);
        cellServiceItems.put("Bluetooth Speakers", 49.99);
        cellServiceItems.put("Apple Iphone Cover",29.99);
        System.out.println(cellServiceItems);
    }
}