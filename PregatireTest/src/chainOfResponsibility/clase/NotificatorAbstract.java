package chainOfResponsibility.clase;

public abstract class NotificatorAbstract {
	private NotificatorAbstract nextNotificator;
	
	public abstract void notificaClient(Client client, String oferta);

	public void setNextNotificator(NotificatorAbstract nextNotificator) {
		this.nextNotificator = nextNotificator;
	}

	public NotificatorAbstract getNextNotificator() {
		return nextNotificator;
	}
	
	
}
