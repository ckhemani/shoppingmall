package store;

public class GiftStore extends Store {
    String occasion;

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

    @Override
    public String toString() {
        return "GiftStore{" +
                "occasion='" + occasion + '\'' +
                ", storeName='" + storeName + '\'' +
                ", storeFloor=" + storeFloor +
                ", storeNumber=" + storeNumber +
                ", storePhoneNumber=" + storePhoneNumber +
                '}';
    }
}
