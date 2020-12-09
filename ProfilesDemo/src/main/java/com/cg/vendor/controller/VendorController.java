package com.cg.vendor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendorController {

	@GetMapping("/greeting")
	public String greeting() {
		return "Welcome to Profiles Demo";
	}
}
