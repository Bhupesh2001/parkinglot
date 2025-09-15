package org.lld.strategy.parking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.lld.entities.ParkingFloor;
import org.lld.entities.ParkingSpot;
import org.lld.vehicle.Vehicle;

public class FarthestFirstStrategy implements ParkingStrategy {
    @Override
    public Optional<ParkingSpot> findSpot(List<ParkingFloor> floors, Vehicle vehicle) {
        // Create a reversed copy of the floors list to search from the top floor down.
        List<ParkingFloor> reversedFloors = new ArrayList<>(floors);
        Collections.reverse(reversedFloors);

        for (ParkingFloor floor : reversedFloors) {
            Optional<ParkingSpot> spot = floor.findAvailableSpot(vehicle);
            if (spot.isPresent()) {
                return spot;
            }
        }
        return Optional.empty();
    }
}
