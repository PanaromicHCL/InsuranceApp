package com.insurance.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="POLICY")
@Setter @Getter @NoArgsConstructor @ToString
public class Policy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="EAGE")
	private Integer entryage;
	
	@Column(name="MAGE")
	private Integer maturityage;
	
	@Column(name="POLICYTERM")
	private String policyterm;
	
	@Column(name="PREMIUM")
	private Integer minimumpremium;
	
	@Column(name="SUMASSURED")
	private Integer sumassured;

	
}
