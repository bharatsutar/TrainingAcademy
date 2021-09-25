package com.model;

public class ExamResult {
	
	private int E_Id;
	private int S_Id;
	private int Batch_No;
	private String E_Date;
	private int E_Score;
	private int E_OutMarks;
	private double E_Percentage;
	private String E_Status;
	private int E_SubJava;
	private int E_SubMysql;
	private int E_SubCSharp;
	public int getE_SubJava() {
		return E_SubJava;
	}
	public void setE_SubJava(int e_SubJava) {
		E_SubJava = e_SubJava;
	}
	public int getE_SubMysql() {
		return E_SubMysql;
	}
	public void setE_SubMysql(int e_SubMysql) {
		E_SubMysql = e_SubMysql;
	}
	public int getE_SubCSharp() {
		return E_SubCSharp;
	}
	public void setE_SubCSharp(int e_SubCSharp) {
		E_SubCSharp = e_SubCSharp;
	}
	public int getE_Id() {
		return E_Id;
	}
	public void setE_Id(int e_Id) {
		E_Id = e_Id;
	}
	public int getS_Id() {
		return S_Id;
	}
	public void setS_Id(int s_Id) {
		S_Id = s_Id;
	}
	public int getBatch_No() {
		return Batch_No;
	}
	public void setBatch_No(int batch_No) {
		Batch_No = batch_No;
	}
	public String getE_Date() {
		return E_Date;
	}
	public void setE_Date(String e_Date) {
		E_Date = e_Date;
	}
	public int getE_Score() {
		return E_Score;
	}
	public void setE_Score(int e_Score) {
		E_Score = e_Score;
	}
	public int getE_OutMarks() {
		return E_OutMarks;
	}
	public void setE_OutMarks(int e_OutMarks) {
		E_OutMarks = e_OutMarks;
	}
	public double getE_Percentage() {
		return E_Percentage;
	}
	public void setE_Percentage(double e_Percentage) {
		E_Percentage = e_Percentage;
	}
	public String getE_Status() {
		return E_Status;
	}
	public void setE_Status(String e_Status) {
		E_Status = e_Status;
	}
	@Override
	public String toString() {
		return "ExamResult [E_Id=" + E_Id + ", S_Id=" + S_Id + ", Batch_No=" + Batch_No + ", E_Date=" + E_Date
				+ ", E_Score=" + E_Score + ", E_OutMarks=" + E_OutMarks + ", E_Percentage=" + E_Percentage
				+ ", E_Status=" + E_Status + ", E_SubJava=" + E_SubJava + ", E_SubMysql=" + E_SubMysql
				+ ", E_SubCSharp=" + E_SubCSharp + "]";
	}
	
	

}
