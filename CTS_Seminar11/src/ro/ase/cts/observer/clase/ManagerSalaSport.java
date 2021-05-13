package ro.ase.cts.observer.clase;

public class ManagerSalaSport extends ManagerSalaSportAbstract{
	public void anuntaMeci(String tipSport) {
		super.notificaObservatori("Va avea loc un meci de " + tipSport);
	}
}
