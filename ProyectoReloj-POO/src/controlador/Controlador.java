package controlador;
import interfaz.PanelHora;
import mundo.Reloj;

public class Controlador {
	
	Reloj reloj;
	PanelHora pnlHora;
	
	public Controlador() {
		 reloj = new Reloj(0, 0, 0);
	}
	
	public void conectar (PanelHora pnlHora) {
		setPnlHora(pnlHora);
	}
	
	public void setPnlHora (PanelHora pnlHora) {
		this.pnlHora =  pnlHora;
	}

}
