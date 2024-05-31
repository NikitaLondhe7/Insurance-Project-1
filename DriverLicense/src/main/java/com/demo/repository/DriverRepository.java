package com.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.DriverLicenseDetails;

@Repository
public interface DriverRepository extends CrudRepository<DriverLicenseDetails, Serializable>{
 public DriverLicenseDetails findById (Integer id) ;
}
