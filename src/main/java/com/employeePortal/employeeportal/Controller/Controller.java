package com.employeePortal.employeeportal.Controller;

import org.apache.commons.logging.Log;
//import org.apache.commons.logging.Log;
//import org.apache.logging.log4j.EventLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.employeePortal.employeeportal.EmployeePortalApplication;
import com.employeePortal.employeeportal.model.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//import lombok.extern.slf4j.Slf4j;
//@Slf4j
@RestController
public class Controller {
	private static final Logger logger = LoggerFactory.getLogger(Controller.class);
	@RequestMapping("/")
	public String getmessage() {
		return "hello world";
	}
	@RequestMapping("/employee")
	public  Employee getEmployee() {
		Employee emp = new Employee(2,"aathi", "banglore","aathi@gmail.com",2423423);
		
		ObjectMapper mapper = new ObjectMapper();
        String jsonString =  null;
		try {
			jsonString = mapper.writeValueAsString(emp);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
             
        logger.info(jsonString);
	//logger.info(emp.toString());
		
		//return  new Employee(emp.toString());
		return (emp);
	}
	@GetMapping("/User")
	public  String getName() {
		logger.info(getName());
		return ("aathi");
	}
}
//	public static Logger getLogger() {
//		return LOGGER;
	

