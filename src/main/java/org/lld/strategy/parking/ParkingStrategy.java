package org.lld.strategy.parking;


import java.util.List;
import java.util.Optional;

import org.lld.entities.ParkingFloor;
import org.lld.entities.ParkingSpot;
import org.lld.vehicle.Vehicle;

public interface ParkingStrategy {
    Optional<ParkingSpot> findSpot(List<ParkingFloor> floors, Vehicle vehicle);
}
