package in.rtechspot.locationCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rtechspot.locationCrud.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
