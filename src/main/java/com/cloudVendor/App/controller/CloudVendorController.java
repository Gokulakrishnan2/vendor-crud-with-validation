package com.cloudVendor.App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cloudVendor.App.model.CloudVendor;
import com.cloudVendor.App.response.ResponseHandler;
import com.cloudVendor.App.service.VendorService;

@RestController
@RequestMapping("/vendor")
public class CloudVendorController {
	@Autowired
	private	VendorService vendorService;

	//read by ID
	@GetMapping("/{vendorId}")
	public ResponseEntity<Object> getvendor(@PathVariable("vendorId") long vendorId) {
		System.out.println("get mapping called");
		return ResponseHandler.responseBulider("requested details are :", HttpStatus.OK, vendorService.getVendor(vendorId));
		 
	}
	
	//read all
		@GetMapping
		public List<CloudVendor> getallvendor() {
			return vendorService.getAll();
		}
	
	@PostMapping("/post")
	public String createvendor(@RequestBody CloudVendor cloudVendor) {
		
		System.out.println("post method called");
		vendorService.createVendor(cloudVendor);
		return "created successfully";
	} 
	
	@PutMapping
	public String updatevendor(@RequestBody CloudVendor cloudVendor) {
		vendorService.updateVendor(cloudVendor);
		return "updated successfully";
	} 
	
	@DeleteMapping("/{vendorId}")
	public String deletevendor(@PathVariable("vendorId")  long vendorId) {
		vendorService.deleteVendor(vendorId);
		return "Deleted successfully";
	} 
}
