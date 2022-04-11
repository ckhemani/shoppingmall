package store;

import Interfaces.Items;

import java.util.Scanner;

public class GiftStore extends Store implements Items {
    private String occasion;
    Scanner scan = new Scanner(System.in);

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

    @Override
    public void item() {
        System.out.println("This is Gift Store Items");
    }
}
