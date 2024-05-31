package com.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.model.DriverLicenseDetails;
import com.demo.repository.DriverRepository;
import com.demo.service.DriverService;

public class DriverServiceImpl implements DriverService{
	
	@Autowired
	private DriverRepository driverRepository;

	@Override
	public DriverLicenseDetails saveDriverLicenseDetails(DriverLicenseDetails driverlicensedetails) {
		DriverLicenseDetails dld = driverRepository.save(driverlicensedetails);
		return dld;
	}

	@Override
	public DriverLicenseDetails getDriverLicenseDetails(int id) {
		DriverLicenseDetails dld2 = driverRepository.findById(id);
		return dld2;
	}

}
