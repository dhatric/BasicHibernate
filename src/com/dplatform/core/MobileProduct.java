package com.dplatform.core;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("MobileProduct")  
public class MobileProduct extends Product{
	@Column(name = "operatingSystem")
	String operatingSystem;

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}
