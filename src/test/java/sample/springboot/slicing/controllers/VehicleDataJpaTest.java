package sample.springboot.slicing.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import sample.springboot.slicing.model.Vehicle;
import sample.springboot.slicing.repository.VehicleRepository;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by imran on 6/5/17.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class VehicleDataJpaTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private VehicleRepository repository;

    @Test
    public void testExample() throws Exception {
        this.entityManager.persist(new Vehicle("Honda", "CRV"));
        this.entityManager.persist(new Vehicle("Honda", "Pilot"));
        Vehicle vehicle = this.repository.findByModel("CRV");
        assertThat(vehicle.getModel()).isEqualTo("CRV");
        assertThat(vehicle.getMake()).isEqualTo("Honda");
    }

}
