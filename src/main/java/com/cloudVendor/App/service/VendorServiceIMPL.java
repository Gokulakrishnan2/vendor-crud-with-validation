package com.cloudVendor.App.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudVendor.App.exception.CloudVendorNotFoundException;
import com.cloudVendor.App.model.CloudVendor;
import com.cloudVendor.App.repository.VendorRepository;

@Service
public class VendorServiceIMPL implements VendorService{
	
	@Autowired
	private VendorRepository vendorRepository;

	@Override
	public String createVendor(CloudVendor cloudVendor) {
		System.out.println("Service method called");
//		Optional<CloudVendor > data =vendorRepository.findByVendorName(cloudVendor.getVendorName());
//		if(data.isEmpty()) {
			
		if((vendorRepository.findByVendorName(cloudVendor.getVendorName() ) )!= null ) throw new CloudVendorNotFoundException("Name already exists");
		if((vendorRepository.findByVendorPhoneNumber(cloudVendor.getVendorPhoneNumber() ) )!= null ) throw new CloudVendorNotFoundException("phone number already exists");
		
		//business logics
		
		vendorRepository.save(cloudVendor);
		return "vendor saved successfully";
//		}
//		else {
//			return "vendor already exists";
//		}
	}

	@Override
	public String updateVendor(CloudVendor cloudVendor) {
		vendorRepository.save(cloudVendor);
		return "updated";
	}

	@Override
	public String deleteVendor(Long cloudVendorId) {
		vendorRepository.deleteById(cloudVendorId);
		return "Deleted";
	}

	@Override
	public CloudVendor getVendor(Long cloudVendorId) {
		// TODO Auto-generated method stub
		
		if(vendorRepository.findById(cloudVendorId).isEmpty())
			throw new CloudVendorNotFoundException("vendor does not exists");
		
		return vendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAll() {
		// TODO Auto-generated method stub
		return vendorRepository.findAll();
	}



	
}
