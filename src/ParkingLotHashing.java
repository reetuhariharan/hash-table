import java.util.HashMap;

public class ParkingLotHashing {

    HashMap<String, Integer> parkingMap = new HashMap<>();
    int spotCounter = 1;

    public void parkVehicle(String licensePlate) {

        if (!parkingMap.containsKey(licensePlate)) {
            parkingMap.put(licensePlate, spotCounter);
            System.out.println("Vehicle " + licensePlate + " parked at spot " + spotCounter);
            spotCounter++;
        } else {
            System.out.println("Vehicle already parked.");
        }
    }

    public void exitVehicle(String licensePlate) {

        if (parkingMap.containsKey(licensePlate)) {
            int spot = parkingMap.remove(licensePlate);
            System.out.println("Vehicle " + licensePlate + " exited from spot " + spot);
        } else {
            System.out.println("Vehicle not found.");
        }
    }
}