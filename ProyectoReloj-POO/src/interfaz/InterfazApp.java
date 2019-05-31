package interfaz;

import javax.swing.JFrame;

import controlador.Controlador;

public class InterfazApp extends JFrame 
{

	private Controlador ctrl;
	private PanelHora pnlHora;
	private PanelAjustes pnlAjustes;
	private PanelFormato pnlFormato;
	
	public InterfazApp(Controlador ctrl) 
	{
		
		this.ctrl = ctrl;
		
		pnlHora = new PanelHora();
	    pnlHora.setBounds(5, 5, 340, 80);		

	    pnlAjustes = new PanelAjustes(ctrl);
	    pnlAjustes.setBounds(5, 95, 340, 80);   

	    pnlFormato = new PanelFormato(ctrl);
	    pnlFormato.setBounds(5, 185, 340, 80);
	     
		ctrl.conectar(pnlHora);
		
		setSize(360,310);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		add(pnlHora);
		add(pnlAjustes);
		add(pnlFormato);
		
		setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		InterfazApp interfaz = new InterfazApp(new Controlador());
	}
}
