package com.insurance.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Policy;
import com.insurance.service.PolicyService;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin
public class PolicyController {
	
	Logger logger = LoggerFactory.getLogger(PolicyController.class);
	
	@Autowired
	PolicyService policyService;

	@GetMapping("/policies")
	public ResponseEntity<List<Policy>> listPolicies(){
		logger.info("listPolicies");
		List<Policy> policies = policyService.getPolicyList();
		return new ResponseEntity<List<Policy>>(policies, HttpStatus.FOUND);
	}
	
}
