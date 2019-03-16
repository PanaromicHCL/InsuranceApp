package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.model.PolicyDetail;

public interface PolicyDetailRepository extends JpaRepository <PolicyDetail, Integer>  {

}
