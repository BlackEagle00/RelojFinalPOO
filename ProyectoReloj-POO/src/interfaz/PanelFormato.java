package interfaz;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class PanelFormato extends JPanel 
{
	
	private JRadioButton btn12;
	private JRadioButton btn24;
	private ButtonGroup btn_format;
	
	private Controlador ctrl;
	
	public PanelFormato(Controlador ctrl)
	{
		
		setSize(350,100);
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Formato")));
		
		btn12 = new JRadioButton(" 12 Horas ", true);
		add(btn12);
	    btn24 = new JRadioButton(" 24 Horas ", false);
	    btn_format = new ButtonGroup();
	    add(btn24);

		
		this.ctrl = ctrl;
	}

}
