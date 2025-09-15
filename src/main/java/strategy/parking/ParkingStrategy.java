package strategy.parking;


import java.util.List;
import java.util.Optional;

import entities.ParkingFloor;
import entities.ParkingSpot;
import vehicle.Vehicle;

public interface ParkingStrategy {
    Optional<ParkingSpot> findSpot(List<ParkingFloor> floors, Vehicle vehicle);
}
