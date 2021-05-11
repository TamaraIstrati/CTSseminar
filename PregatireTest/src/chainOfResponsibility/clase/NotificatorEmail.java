package chainOfResponsibility.clase;

public class NotificatorEmail extends NotificatorAbstract{

	@Override
	public void notificaClient(Client client, String oferta) {
		if(client.getEmail() != null) {
			System.out.println("Clientul cu numele: " + client.getNume() + " a fost informat despre: " + oferta + " prin email.");
		} else {
			if(super.getNextNotificator() != null) {
				super.getNextNotificator().notificaClient(client, oferta);
			} else {
				System.out.println("Notifica manager: clientul " + client.getNume() + " nu are datele necesare de contact!");
			}
		}
	}
}
