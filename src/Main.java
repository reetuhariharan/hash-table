public class Main {

    public static void main(String[] args) {

        ParkingLotHashing parking = new ParkingLotHashing();

        parking.parkVehicle("ABC123");
        parking.parkVehicle("XYZ789");

        parking.exitVehicle("ABC123");
    }
}