package com.model;

public class Batch {
	private int batch_no;
	private String batch_name;
	private String batch_time;
	public int getBatch_no() {
		return batch_no;
	}
	public void setBatch_no(int batch_no) {
		this.batch_no = batch_no;
	}
	public String getBatch_name() {
		return batch_name;
	}
	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}
	public String getBatch_time() {
		return batch_time;
	}
	public void setBatch_time(String batch_time) {
		this.batch_time = batch_time;
	}
	@Override
	public String toString() {
		return "Batch [batch_no=" + batch_no + ", batch_name=" + batch_name + ", batch_time=" + batch_time + "]";
	}
	

	
	
	
	

}
