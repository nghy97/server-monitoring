package com.monitoring.dto;

public class DiskDto {
	private String totalDisk;
	private String usedDisk;
	private String freeDisk;
	
	public String getTotalDisk() {
		return totalDisk;
	}
	public void setTotalDisk(String totalDisk) {
		this.totalDisk = totalDisk;
	}
	public String getUsedDisk() {
		return usedDisk;
	}
	public void setUsedDisk(String usedDisk) {
		this.usedDisk = usedDisk;
	}
	public String getFreeDisk() {
		return freeDisk;
	}
	public void setFreeDisk(String freeDisk) {
		this.freeDisk = freeDisk;
	}
}
