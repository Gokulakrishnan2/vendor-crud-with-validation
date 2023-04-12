package com.cloudVendor.App.service;

import java.util.List;

import com.cloudVendor.App.model.CloudVendor;

public interface VendorService {
	 String createVendor(CloudVendor cloudVendor);
	 String updateVendor(CloudVendor cloudVendor);
	 String deleteVendor(Long cloudVendorId);
	 CloudVendor getVendor(Long cloudVendorId);
	 List<CloudVendor> getAll();
}