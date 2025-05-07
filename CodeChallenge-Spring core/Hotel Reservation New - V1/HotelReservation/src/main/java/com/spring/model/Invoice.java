package com.spring.model;

public class Invoice
{
	private String reservationId;
	private int stayDaysCount;
	private int gstPercentage;
	private RoomChargeInfo roomCharge;
	
	public String getReservationId() {
		return reservationId;
	}
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
	public int getStayDaysCount() {
		return stayDaysCount;
	}
	public void setStayDaysCount(int stayDaysCount) {
		this.stayDaysCount = stayDaysCount;
	}
	public int getGstPercentage() {
		return gstPercentage;
	}
	public void setGstPercentage(int gstPercentage) {
		this.gstPercentage = gstPercentage;
	}
	public RoomChargeInfo getRoomCharge() {
		return roomCharge;
	}
	public void setRoomCharge(RoomChargeInfo roomCharge) {
		this.roomCharge = roomCharge;
	}
	
}
	 	  	    	    		        	 	
