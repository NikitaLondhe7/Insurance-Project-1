package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DriverLicenseDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int driverId; //= 1; 
	private String dlNo; //= "MH 14 2014896456";
	private String DOI; //= "08-02-2016";
	private String validTill; //= "07-02-2036(NT)";
	private String DOB; //= "20-04-1997";
	private String name; //= "nikita londhe";
	private String address; //= "Bhosari,Pune";
	private int PIN ;//= 411039;
	public DriverLicenseDetails(int driverId, String dlNo, String dOI, String validTill, String dOB, String name,
			String address, int pIN) {
		super();
		this.driverId = driverId;
		this.dlNo = dlNo;
		DOI = dOI;
		this.validTill = validTill;
		DOB = dOB;
		this.name = name;
		this.address = address;
		PIN = pIN;
	}
	public DriverLicenseDetails() {
		super();
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDlNo() {
		return dlNo;
	}
	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}
	public String getDOI() {
		return DOI;
	}
	public void setDOI(String dOI) {
		DOI = dOI;
	}
	public String getValidTill() {
		return validTill;
	}
	public void setValidTill(String validTill) {
		this.validTill = validTill;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}
	@Override
	public String toString() {
		return "DriverLicenseDetails [driverId=" + driverId + ", dlNo=" + dlNo + ", DOI=" + DOI + ", validTill="
				+ validTill + ", DOB=" + DOB + ", name=" + name + ", address=" + address + ", PIN=" + PIN + "]";
	}
	
	
	
	
	
}
