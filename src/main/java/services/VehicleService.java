package services;

import java.util.List;

import domain.Vehicle;

public interface VehicleService {
	List<Vehicle> getAll();
	Vehicle findById(Integer id);
	Vehicle saveVehicle(Vehicle vehicle);
	void deleteById(Integer id);
}
