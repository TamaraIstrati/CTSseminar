package ro.ase.cts.chainOfResponsibility.clase;

public class NotificatorEmail extends Notificator{
	@Override
	public void trimiteNotificare(Client client, String text) {
		if(client.getEmail()!=null) {
			System.out.println("Trimite email catre "+client.getNume() + " mesajul: " + text);
		} else {
			if(super.getNextNotificator() != null) {			
				super.getNextNotificator().trimiteNotificare(client, text);
			}else {
				System.out.println("Domnule manager, pentru clientul " + client.getNume() + " nu sunt date de contanct!");
			}
		}
		
	}
}
