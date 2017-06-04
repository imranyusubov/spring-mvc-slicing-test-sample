package sample.springboot.slicing.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by imran on 6/4/17.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = {VehicleController.class},secure = false)
public class VehicleControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private VehicleController controller;


    @Test
    public void showWelcomePage() throws Exception {
          mvc.perform(get("/welcome")).andExpect(status().isOk());
    }

}