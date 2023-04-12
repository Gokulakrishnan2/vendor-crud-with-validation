package com.cloudVendor.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class CloudVendorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudVendorApplication.class, args);
	}

}
