package sample.springboot.slicing.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.springboot.slicing.model.Vehicle;
import sample.springboot.slicing.repository.VehicleRepository;

import java.util.List;

/**
 * Created by imran on 6/4/17.
 */
@Service
public class VehicleService {

    @Autowired
    private VehicleRepository repository;

    public void save(Vehicle vehicle){
        repository.save(vehicle);
    }

    public Vehicle getVehicle(Integer id){
         return repository.getOne(id);
    }

    public List<Vehicle> findAll(){
         return repository.findAll();
    }

}


