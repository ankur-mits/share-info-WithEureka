package com.rsystems.shareinformation;

public class CompanyInfo {
	private String compName;
	private int shareLowPrice;
	private int shareHighPrice;
	private int port;
	



	public CompanyInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CompanyInfo(String compName, int shareLowPrice, int shareHighPrice) {
		
		this.compName = compName;
		this.shareLowPrice = shareLowPrice;
		this.shareHighPrice = shareHighPrice;
	}


	public String getCompName() {
		return compName;
	}


	public void setCompName(String compName) {
		this.compName = compName;
	}


	public int getShareLowPrice() {
		return shareLowPrice;
	}


	public void setShareLowPrice(int shareLowPrice) {
		this.shareLowPrice = shareLowPrice;
	}


	public int getShareHighPrice() {
		return shareHighPrice;
	}


	public void setShareHighPrice(int shareHighPrice) {
		this.shareHighPrice = shareHighPrice;
	}
	
	
	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}
	

}
