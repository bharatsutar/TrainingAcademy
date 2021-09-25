package com.model;

public class Student {
	
	private Integer sId;
	private String sName;
	private String sMobileNo;
	private String sAddress;
	private Integer sBatch;
	private String sSubject1;
	private String sSubject2;
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sMobileNo=" + sMobileNo + ", sAddress=" + sAddress
				+ ", sBatch=" + sBatch + ", sSubject1=" + sSubject1 + ", sSubject2=" + sSubject2 + "]";
	}
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsMobileNo() {
		return sMobileNo;
	}
	public void setsMobileNo(String sMobileNo) {
		this.sMobileNo = sMobileNo;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public Integer getsBatch() {
		return sBatch;
	}
	public void setsBatch(Integer sBatch) {
		this.sBatch = sBatch;
	}
	public String getsSubject1() {
		return sSubject1;
	}
	public void setsSubject1(String sSubject1) {
		this.sSubject1 = sSubject1;
	}
	public String getsSubject2() {
		return sSubject2;
	}
	public void setsSubject2(String sSubject2) {
		this.sSubject2 = sSubject2;
	}
}
