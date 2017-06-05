package sample.springboot.slicing.controllers;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import sample.springboot.slicing.model.Vehicle;
import sample.springboot.slicing.services.VehicleService;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.mockito.BDDMockito.given;

import static org.mockito.Matchers.contains;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by imran on 6/4/17.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = {VehicleController.class} ,secure = false)
public class VehicleControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private VehicleService service;

    @Test
    public void showWelcomePage() throws Exception {
        given(this.service.findAll())
                        .willReturn(Arrays.asList(
                                new Vehicle("Mercedes","E350"),
                                new Vehicle("BMW","535"),
                                new Vehicle("Mercedes","GL550")));


        ResultActions result = mvc.perform(get("/list")
                .accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(view().name("vehcleList"));
    }



}