package com.example.DataInsert.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Booking {
	@Id
	private String Name;
	private String Email;
	private String CheckIn;
	private String CheckOut;
	private int SelectAdult;
	private int SelectChild;
	private String MobileNo;
	private int SelectRoom;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCheckIn() {
		return CheckIn;
	}
	public void setCheckIn(String checkIn) {
		CheckIn = checkIn;
	}
	public String getCheckOut() {
		return CheckOut;
	}
	public void setCheckOut(String checkOut) {
		CheckOut = checkOut;
	}
	public int getSelectAdult() {
		return SelectAdult;
	}
	public void setSelectAdult(int selectAdult) {
		SelectAdult = selectAdult;
	}
	public int getSelectChild() {
		return SelectChild;
	}
	public void setSelectChild(int selectChild) {
		SelectChild = selectChild;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public int getSelectRoom() {
		return SelectRoom;
	}
	public void setSelectRoom(int selectRoom) {
		SelectRoom = selectRoom;
	}

}
