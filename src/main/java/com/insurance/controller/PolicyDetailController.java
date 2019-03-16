package com.insurance.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicyDetail;
import com.insurance.service.PolicyDetailService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PolicyDetailController {
	
	private static final Logger log = LoggerFactory.getLogger(PolicyDetailController.class);	
	
	@Autowired
	PolicyDetailService policyDetailService;
	
	@GetMapping("/policydetails")
	public ResponseEntity<List<PolicyDetail>> allUser(PolicyDetail policyDetail) {
		return new ResponseEntity<List<PolicyDetail>>(policyDetailService.getPolicyDetails(),HttpStatus.OK);
	}
	
	@GetMapping("/policydetail/{id}")
	public ResponseEntity<PolicyDetail> getUser(@PathVariable int id) {
		return new ResponseEntity<PolicyDetail>(policyDetailService.getPolicyById(id),HttpStatus.OK);
		
	}

}
