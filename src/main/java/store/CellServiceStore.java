package store;

import Interfaces.Items;

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
    }
}