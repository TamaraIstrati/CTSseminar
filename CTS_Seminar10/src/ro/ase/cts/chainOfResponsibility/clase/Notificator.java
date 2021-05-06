package ro.ase.cts.chainOfResponsibility.clase;

public abstract class Notificator {
	private Notificator nextNotificator;
	
	public abstract void trimiteNotificare(Client client, String text);

	public void setNextNotificator(Notificator nextNotificator) {
		this.nextNotificator = nextNotificator;
	}

	public Notificator getNextNotificator() {
		return nextNotificator;
	}
}
