package store;

import Interfaces.Items;

import java.util.HashMap;

public class DepartmentStore extends Store implements Items {
    int fittingRooms;


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
                ", storeName='" + storeName + '\'' +
                ", storeFloor=" + storeFloor +
                ", storeNumber=" + storeNumber +
                ", storePhoneNumber=" + storePhoneNumber +
                '}' + "\n";
    }


    @Override
    public void item() {
        System.out.println("This is Dept Store Items");
    }
}
