package store;

public class Store {
    // Fields
    String storeName;
    int storeFloor;
    int storeNumber;
    long storePhoneNumber;

    // Constructor with No Parameters
    public Store() {
    }

    // Constructor with Parameters

    public Store(String storeName, int storeFloor, int storeNumber, long storePhoneNumber) {
        this.storeName = storeName;
        this.storeFloor = storeFloor;
        this.storeNumber = storeNumber;
        this.storePhoneNumber = storePhoneNumber;
    }

    // Getter and Setters

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getStoreFloor() {
        return storeFloor;
    }

    public void setStoreFloor(int storeFloor) {
        this.storeFloor = storeFloor;
    }

    public int getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(int storeNumber) {
        this.storeNumber = storeNumber;
    }

    public long getStorePhoneNumber() {
        return storePhoneNumber;
    }

    public void setStorePhoneNumber(long storePhoneNumber) {
        this.storePhoneNumber = storePhoneNumber;
    }


    // Methods


    @Override
    public String toString() {
        return "Store{" +
                "storeName='" + storeName + '\'' +
                ", storeFloor=" + storeFloor +
                ", storeNumber=" + storeNumber +
                ", storePhoneNumber=" + storePhoneNumber +
                '}';
    }
}