package store;

import Interfaces.IBill;
import Interfaces.Items;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CellServiceStore extends Store implements Items, IBill {
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
                '}';
    }

    @Override
    public HashMap<String, Double> item() {
        System.out.println("This is Cell Service Items");
        HashMap<String,Double> cellServiceItems = new HashMap<>();
        HashSet <String> itemNames = new HashSet<>();
        ArrayList<Double> itemPrices = new ArrayList<>();
        System.out.println("Please enter the Number of Items to be added in Cell Service Store Sold in Cell Store?");
        String StringOfNumberOfItems = cellScanner.next();

        try {
            int seeWhetherInputisInt = Integer.parseInt(StringOfNumberOfItems);
            System.out.println("Valid Input in int");
        } catch (NumberFormatException e) {
            System.out.println("Input is not valid int. Please try again");
        }

        int numberOfItems = Integer.parseInt(StringOfNumberOfItems);

        for (int i = 0;i<numberOfItems;i++){
            System.out.println("Please enter the items for sale");
            String itemsForSale = cellScanner.next();
            System.out.println("Please enter its Prices");
            double itemsPriced = cellScanner.nextDouble();
            cellServiceItems.put(itemsForSale,itemsPriced);
        }
        System.out.println(cellServiceItems) ;
        return cellServiceItems;
    }

    @Override
    public double bill() {
            double saleTax = 0.06;
            double totalCost = 0.0;
            HashMap<String,Double> itemPrice = new HashMap<>();
            itemPrice.put("Iphone",1099.99);
            itemPrice.put("Cable",9.99);
            itemPrice.put("Charger",10.99);
            itemPrice.put("Speaker",19.99);
            System.out.println("Please enter number of items to be bought");
            int numberOfItems = cellScanner.nextInt();

            try {
                System.out.println("Valid Input in int");
            } catch (NumberFormatException e) {
                System.out.println("Input is not valid int. Please try again");
            }

            for (int i=0;i< numberOfItems;i++) {
                System.out.println("Please enter the item purchased from Dept Store? Iphone/Cable/Charger/Speaker");
                String itemBought = cellScanner.next();
                System.out.println("Please enter the quantity bought");
                int quantity = cellScanner.nextInt();
                Double cost = itemPrice.get(itemBought) * quantity;
                totalCost+=cost;
            }
            double totalBill = (totalCost * saleTax) + totalCost;
            return totalBill;
    }
}