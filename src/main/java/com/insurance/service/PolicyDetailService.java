package com.insurance.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.insurance.model.PolicyDetail;

@Service
public interface PolicyDetailService {
	
	public List<PolicyDetail> getPolicyDetails();
	
	public PolicyDetail getPolicyById(int id);

}
