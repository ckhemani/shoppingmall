package store;

public class CellServiceStore extends Store{
    String cellService;


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

    @Override
    public String toString() {
        return "CellServiceStore{" +
                "cellService='" + cellService + '\'' +
                ", storeName='" + storeName + '\'' +
                ", storeFloor=" + storeFloor +
                ", storeNumber=" + storeNumber +
                ", storePhoneNumber=" + storePhoneNumber +
                '}';
    }
}