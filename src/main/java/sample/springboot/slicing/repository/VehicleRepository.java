package sample.springboot.slicing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sample.springboot.slicing.model.Vehicle;

/**
 * Created by imran on 6/3/17.
 */
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
