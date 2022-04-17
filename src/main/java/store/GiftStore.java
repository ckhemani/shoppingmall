package store;

import Interfaces.IBill;
import Interfaces.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class GiftStore extends Store implements Items, IBill {
    private String occasion;
    private static Scanner giftScanner = new Scanner(System.in);

    public GiftStore(String storeName, int storeFloor, int storeNumber, long storePhoneNumber, String occasion) {
        super(storeName, storeFloor, storeNumber, storePhoneNumber);
        this.occasion = occasion;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public void storeDetails(){
        System.out.println("I am Gift Store in Mall");
    }


    @Override
    public String toString() {
        return "GiftStore{" +
                "occasion='" + occasion + '\'' +
                ", storeName='" + getStoreName() + '\'' +
                ", storeFloor=" + getStoreFloor()+
                ", storeNumber=" + getStoreName() +
                ", storePhoneNumber=" + getStorePhoneNumber() +
                '}' + "\n";
    }


    public HashMap<String, Double> item() {
        System.out.println("This is Gift Store Items");
        HashMap<String,Double> giftItems = new HashMap<>();
        HashSet<String> itemNames = new HashSet<>();
        ArrayList<Double> itemPrices = new ArrayList<>();
        System.out.println("Please enter the Number of Items to be added in Gift Store Sold in Store?");
        int numberOfItems = giftScanner.nextInt();
        for (int i = 0;i<numberOfItems;i++){
            System.out.println("Please enter the items for sale");
            String itemsForSale = giftScanner.next();
            System.out.println("Please enter its Prices");
            double itemsPriced = giftScanner.nextDouble();
            giftItems.put(itemsForSale,itemsPriced);
        }
        System.out.println(giftItems);
        return giftItems;
    }

    @Override
    public double bill() {
        double saleTax = 0.06;
        double totalCost = 0.0;
        HashMap<String,Double> itemPrice = new HashMap<>();
        itemPrice.put("Wrap",9.99);
        itemPrice.put("Greeting",1.99);
        itemPrice.put("KeyChain",6.99);
        itemPrice.put("Ribbon",2.99);
        System.out.println("Please enter number of items to be bought");
        int numberOfItems = giftScanner.nextInt();
        for (int i=0;i< numberOfItems;i++) {
            System.out.println("Please enter the item purchased from Dept Store? Wrap/Greeting/KeyChain/Ribbon");
            String itemBought = giftScanner.next();
            System.out.println("Please enter the quantity bought");
            int quantity = giftScanner.nextInt();
            Double cost = itemPrice.get(itemBought) * quantity;
            totalCost+=cost;
        }
        double totalBill = (totalCost * saleTax) + totalCost;
        return totalBill;
    }
}
