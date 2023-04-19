package com.sds.SMS.restClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TwilioRestClientService {
	
	@Autowired
	private TwilioRestClientServiceImpl clientServiceImpl;

	public boolean twilioAuthentication() {
		return clientServiceImpl.twilioAuthentication();
	};

	public boolean sendTwilioSMS(String reciverPhoneNo, String senderPhoneNo, String msg) {
		return clientServiceImpl.sendTwilioSMS(reciverPhoneNo, senderPhoneNo, msg);
	};
}
