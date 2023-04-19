package com.sds.SMS.dtos;

public class TwilioRequestBody {
	String PhoneNumberTo;
	String PhoneNumberFrom;
	String msg;
	public String getPhoneNumberTo() {
		return PhoneNumberTo;
	}
	public void setPhoneNumberTo(String phoneNumberTo) {
		PhoneNumberTo = phoneNumberTo;
	}
	public String getPhoneNumberFrom() {
		return PhoneNumberFrom;
	}
	public void setPhoneNumberFrom(String phoneNumberFrom) {
		PhoneNumberFrom = phoneNumberFrom;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "TwilioRequestBody [PhoneNumberTo=" + PhoneNumberTo + ", PhoneNumberFrom=" + PhoneNumberFrom + ", msg="
				+ msg + "]";
	}
	public TwilioRequestBody(String phoneNumberTo, String phoneNumberFrom, String msg) {
		PhoneNumberTo = phoneNumberTo;
		PhoneNumberFrom = phoneNumberFrom;
		this.msg = msg;
	}
	public TwilioRequestBody() {
	}
	
	 
}
