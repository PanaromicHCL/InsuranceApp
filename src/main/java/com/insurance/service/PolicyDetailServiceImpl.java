package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PolicyDetail;
import com.insurance.repository.PolicyDetailRepository;

@Service
public class PolicyDetailServiceImpl implements PolicyDetailService {

	@Autowired
	PolicyDetailRepository policyDetailRepository;
	
	public List<PolicyDetail> getPolicyDetails() {

		List<PolicyDetail> policyDetail = policyDetailRepository.findAll();
		return policyDetail;
	}
	
	public PolicyDetail getPolicyById(int id) {
		
		return policyDetailRepository.findById(id).orElse(null);
	}

}
