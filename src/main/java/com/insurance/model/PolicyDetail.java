package com.insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "policy_details")
public class PolicyDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "policyname")
	private String policyName;
	
	@Column(name = "textualdescription")
	private String textualDescription;
	
	@Column(name = "salientdescription")
	private String salientDescription;
	
	@Column(name = "termscondition")
	private String termsCondition;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getTextualDescription() {
		return textualDescription;
	}

	public void setTextualDescription(String textualDescription) {
		this.textualDescription = textualDescription;
	}

	public String getSalientDescription() {
		return salientDescription;
	}

	public void setSalientDescription(String salientDescription) {
		this.salientDescription = salientDescription;
	}

	public String getTermsCondition() {
		return termsCondition;
	}

	public void setTermsCondition(String termsCondition) {
		this.termsCondition = termsCondition;
	}
	
}
