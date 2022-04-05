package store;

public class CellServiceStore extends Store{
    String cellService;


    public CellServiceStore(String storeName, int storeFloor, int storeNumber, long storePhoneNumber, String cellService) {
        super(storeName, storeFloor, storeNumber, storePhoneNumber);
        this.cellService = cellService;
    }
}