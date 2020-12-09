package com.cg.vendor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.vendor.entity.Vendor;

@Repository
public interface VendorDao extends JpaRepository<Vendor, Long>{

}
