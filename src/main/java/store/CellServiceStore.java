package store;

import Interfaces.Items;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CellServiceStore extends Store implements Items {
    private static final Path cellItems = Paths.get(System.getProperty("user.dir") + "\\malldata\\cellitems.txt");
    private String cellService;
    private static Scanner cellScanner = new Scanner(System.in);


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
        System.out.println(cellServiceItems) ;
    }

    public void createAFileForItems() {
        try {
            if (Files.notExists(cellItems)) {
                Files.createFile(cellItems);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeAFileForItems() {
        try {
            Files.writeString(cellItems, "test", StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}