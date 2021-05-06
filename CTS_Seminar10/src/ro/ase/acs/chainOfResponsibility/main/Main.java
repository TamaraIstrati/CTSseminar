package ro.ase.acs.chainOfResponsibility.main;

import ro.ase.acs.chainOfResponsibility.clase.Client;
import ro.ase.acs.chainOfResponsibility.clase.NotificatorEmail;
import ro.ase.acs.chainOfResponsibility.clase.NotificatorSMS;

public class Main {

	public static void main(String[] args) {
		Client client1 = new Client("Ion",null,null);
		Client client2 = new Client("Maria","762357647",null);
		Client client3 = new Client("Ana",null,"ana1@email.com");
		
		NotificatorSMS notificatorSMS = new NotificatorSMS();
		notificatorSMS.trimiteNotificare(client3, "Mesaj");
		NotificatorEmail notificatorEmail = new NotificatorEmail();
		System.out.println();
		notificatorSMS.setNextNotificator(notificatorEmail);
		notificatorSMS.trimiteNotificare(client3, "Mesaj");
		notificatorSMS.trimiteNotificare(client1, "Mesaj");
		notificatorSMS.trimiteNotificare(client2, "Mesaj");
	}
}
