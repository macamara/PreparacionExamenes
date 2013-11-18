package p4.Concurrencia.CanibalesDificil;

public class Cocinero extends Thread{

	private Marmita marmita;

	public Cocinero(Marmita marmita){
		this.marmita=marmita;
	}
	
	public void run(){
		while(true){
			try {
				marmita.rellenar();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
