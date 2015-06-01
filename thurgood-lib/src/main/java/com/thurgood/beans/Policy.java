package com.thurgood.beans;

public class Policy {

	private String policyId;
	private String first;
	private String last;
	
	public Policy(String policyId, String first, String last) {
		super();
		this.policyId = policyId;
		this.first = first;
		this.last = last;
	}
	
	public String getPolicyId() {
		return policyId;
	}
	
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	
	public String getFirst() {
		return first;
	}
	
	public void setFirst(String first) {
		this.first = first;
	}
	
	public String getLast() {
		return last;
	}
	
	public void setLast(String last) {
		this.last = last;
	}
	
	
}
