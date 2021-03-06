package com.cg.vendor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendor {

	@Id
	@Column(name="vednor_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long vendorId;
	@Column(name="vendor_name")
	private String vendorName;
	public Vendor() {
		super();
	}
	public Vendor(long vendorId, String vendorName) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
	}
	public long getVendorId() {
		return vendorId;
	}
	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	
}
