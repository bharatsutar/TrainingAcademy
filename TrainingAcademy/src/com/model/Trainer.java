package com.model;

public class Trainer {
	
	private Integer tId;
	private String tName;
	private String tMobileNo;
	private String tAddress;
	private Integer tBatch;
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String gettMobileNo() {
		return tMobileNo;
	}
	public void settMobileNo(String tMobileNo) {
		this.tMobileNo = tMobileNo;
	}
	public String gettAddress() {
		return tAddress;
	}
	public void settAddress(String tAddress) {
		this.tAddress = tAddress;
	}
	public Integer gettBatch() {
		return tBatch;
	}
	public void settBatch(Integer tBatch) {
		this.tBatch = tBatch;
	}
	@Override
	public String toString() {
		return "Trainer [tId=" + tId + ", tName=" + tName + ", tMobileNo=" + tMobileNo + ", tAddress=" + tAddress
				+ ", tBatch=" + tBatch + "]";
	}

	
	
}
