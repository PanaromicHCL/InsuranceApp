package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Policy;
import com.insurance.repository.PolicyRepository;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	PolicyRepository policyRepository;
	
	@Override
	public List<Policy> getPolicyList() {
		return policyRepository.findAll();
	}

	@Override
	public Policy getPolicy(Integer id) {
		return policyRepository.findById(id).orElse(null);
	}

}
