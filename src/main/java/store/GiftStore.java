package store;

public class GiftStore extends Store {
    String occasion;

    public GiftStore(String storeName, int storeFloor, int storeNumber, long storePhoneNumber, String occasion) {
        super(storeName, storeFloor, storeNumber, storePhoneNumber);
        this.occasion = occasion;
    }


}
