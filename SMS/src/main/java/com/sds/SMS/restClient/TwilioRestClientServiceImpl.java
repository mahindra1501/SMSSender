package com.sds.SMS.restClient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

@Component
public class TwilioRestClientServiceImpl {
	// Find your Account Sid and Token at twilio.com/console
	private static final Logger LOG = LogManager.getLogger(TwilioRestClientServiceImpl.class);
	public static final String ACCOUNT_SID = "ACadf76768414163e4255626c9394b4850";
	public static final String AUTH_TOKEN = "8e6c4c6fc1e9b20a4054185b00019c30";
	public boolean twilioAuthentication() {
		try {
			LOG.info("preparing for initialize the Twilio environment");
			Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
			return true;
		} catch (Exception ex) {
			LOG.error("Error while twilio authentification ", ex);
			return false;
		}
	}

	public boolean sendTwilioSMS(String reciverPhoneNo, String senderPhoneNo, String msg) {
		try {
			LOG.info("preparing for sending Twilio sms");
			boolean twilioAuthentication = twilioAuthentication();
			if (twilioAuthentication) {
				Message message = Message.creator(new com.twilio.type.PhoneNumber(reciverPhoneNo),
						new com.twilio.type.PhoneNumber(senderPhoneNo), msg).create();
				System.out.println(message.toString());
				return true;
			}
		} catch (Exception ex) {
			LOG.error("Error while twilio authentification ", ex);
			return false;
		}
		return false;
	}
}