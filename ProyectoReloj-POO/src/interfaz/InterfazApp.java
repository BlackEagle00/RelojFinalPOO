package interfaz;

import javax.swing.JFrame;

import controlador.Controlador;

public class InterfazApp extends JFrame {

	private Controlador ctrl;
	private PanelHora pnlHora;
	private PanelAjustes pnlAjustes;
	private PanelFormato pnlFormato;
	
	public InterfazApp(Controlador ctrl) {
		
		this.ctrl = ctrl;
		pnlHora = new PanelHora();
		pnlAjustes = new PanelAjustes(ctrl);
		pnlFormato = new PanelFormato(ctrl);
		ctrl.conectar(pnlHora);
		
		setSize(310,360);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		add(pnlHora);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		InterfazApp interfaz = new InterfazApp(new Controlador());
	}
}
