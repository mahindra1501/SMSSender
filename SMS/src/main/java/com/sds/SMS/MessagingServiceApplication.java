package com.sds.SMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sds.SMS.restClient.TwilioRestClientService;

@SpringBootApplication
public class MessagingServiceApplication {

	public static String reciverPhoneNo = "+918087233323";
	public static String senderPhoneNo = "+19033006131";
	public static String msg = "please click on below link https://www.youtube.com/watch?v=-fqGGqXHQ2E";

	public static void main(String[] args) {
		
		ConfigurableApplicationContext appContext = SpringApplication.run(MessagingServiceApplication.class, args);
		TwilioRestClientService service= appContext.getBean(TwilioRestClientService.class);

		boolean sendTwilioSMS = service.sendTwilioSMS(reciverPhoneNo, senderPhoneNo, msg);
		if (sendTwilioSMS) {
			System.out.println("Twilio run successfully");
		} else {
			System.out.println("Not able to run Twilio successfully");
		}	
	}
}
