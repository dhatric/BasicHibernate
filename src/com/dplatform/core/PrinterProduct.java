package com.dplatform.core;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("PrinterProduct")  
public class PrinterProduct extends Product{
	@Column(name = "material")
	String material;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
