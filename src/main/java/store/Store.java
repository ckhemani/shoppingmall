package store;

public class Store {
    // Fields
    String name;
    int floor;
    int storeNumber;
    long phoneNumber;

    // Constructor with No Parameters
    public Store() {
    }

    // Constructor with Parameters
    public Store(String name, int floor, int storeNumber, long phoneNumber) {
        this.name = name;
        this.floor = floor;
        this.storeNumber = storeNumber;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(int storeNumber) {
        this.storeNumber = storeNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Methods


    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", floor=" + floor +
                ", storeNumber=" + storeNumber +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
