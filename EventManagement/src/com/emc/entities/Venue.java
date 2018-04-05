package com.emc.entities;

public class Venue extends EMBase {
	private String description;
	private String straatAddress;
	private String city;
	private String state;
	private String pinCode;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStraatAddress() {
		return straatAddress;
	}

	public void setStraatAddress(String straatAddress) {
		this.straatAddress = straatAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

}
