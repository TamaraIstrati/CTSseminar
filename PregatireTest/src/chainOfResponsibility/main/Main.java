package chainOfResponsibility.main;

import chainOfResponsibility.clase.Client;
import chainOfResponsibility.clase.NotificatorAbstract;
import chainOfResponsibility.clase.NotificatorEmail;
import chainOfResponsibility.clase.NotificatorSMS;

public class Main {

	public static void main(String[] args) {
		Client clientSMS = new Client("Ion", "06435", "hngv@jh.com");
		Client clientEmail = new Client("Costel", null, "hngv@jh.com");
		Client clientFaraDate = new Client("Vasile", null, null);
		
		NotificatorAbstract notificatorSMS = new NotificatorSMS();
		NotificatorAbstract notificatorEmail = new NotificatorEmail();
		notificatorSMS.notificaClient(clientFaraDate, "oferta de luni");
		notificatorSMS.notificaClient(clientEmail, "oferta de luni");
		notificatorSMS.notificaClient(clientSMS, "oferta de luni");
		
		notificatorSMS.setNextNotificator(notificatorEmail);
		System.out.println("--------");
		
		notificatorSMS.notificaClient(clientFaraDate, "oferta de luni");
		notificatorSMS.notificaClient(clientEmail, "oferta de luni");
		notificatorSMS.notificaClient(clientSMS, "oferta de luni");
	}

}
