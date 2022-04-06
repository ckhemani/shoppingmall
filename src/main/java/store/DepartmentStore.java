package store;

public class DepartmentStore extends Store {
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

    @Override
    public String toString() {
        return "DepartmentStore{" +
                "fittingRooms=" + fittingRooms +
                ", storeName='" + storeName + '\'' +
                ", storeFloor=" + storeFloor +
                ", storeNumber=" + storeNumber +
                ", storePhoneNumber=" + storePhoneNumber +
                '}';
    }
}
