package in.rtechspot.locationCrud.service;

import java.util.List;

import in.rtechspot.locationCrud.entity.Location;

public interface LocationService {
	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Location getLocationById(int id);

	List<Location> getAllLocations();

}
