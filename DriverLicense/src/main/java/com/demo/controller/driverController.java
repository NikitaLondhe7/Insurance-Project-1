package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.DriverLicenseDetails;
import com.demo.service.DriverService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class driverController {

	@Autowired
	private DriverService driverService;
	
	@PostMapping("/addLicense")
	public DriverLicenseDetails saveDriverLicenseDetails(@RequestBody DriverLicenseDetails driverlicensedetails) {
		DriverLicenseDetails dld = driverService.saveDriverLicenseDetails(driverlicensedetails);
		return dld;
	}
	
	@GetMapping("/getLicense/{id}")
	public DriverLicenseDetails getDriverLicenseDetails(@PathVariable("id") Integer id) {
		DriverLicenseDetails dld1 = driverService.getDriverLicenseDetails(id);
		return dld1;
	}
	
	
	
	
}
