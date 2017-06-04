package sample.springboot.slicing.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sample.springboot.slicing.model.Vehicle;
import sample.springboot.slicing.services.VehicleService;

import java.util.List;

/**
 * Created by imran on 6/3/17.
 */
@Controller
public class VehicleController {

    @Autowired
    private VehicleService service;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ModelAndView showAvailableCars(){
        List<Vehicle> vehicles = service.findAll();
        ModelMap modelMap=new ModelMap("vehicles",vehicles);
        return new ModelAndView("vehcleList",modelMap);
    }






}
