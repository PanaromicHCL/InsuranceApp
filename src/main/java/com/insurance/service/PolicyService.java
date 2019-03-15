package com.insurance.service;

import java.util.List;

import com.insurance.model.Policy;

public interface PolicyService {

	List<Policy> getPolicyList();
	
	Policy getPolicy(Integer id);
	
}
