package com.cloudVendor.App.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cloudVendor.App.model.CloudVendor;

@Repository
public interface VendorRepository extends JpaRepository<CloudVendor, Long>{
//	
//	public List<CloudVendor> findByName(String vendorName);
//	public List<CloudVendor> findByAddress(String vendorAddress);
//	public List<CloudVendor> findByMobile(String vendorPhoneNumber);
	
	public CloudVendor findByVendorName(String vendorName);
	public CloudVendor findByVendorPhoneNumber(Long vendorPhoneNumber);
	
//	Optional<CloudVendor> findByVendorName(String vendorName);
//	Optional<CloudVendor> findByAddress(String vendorAddress);
//	Optional<CloudVendor> findByMobile(String vendorPhoneNumber);
}
