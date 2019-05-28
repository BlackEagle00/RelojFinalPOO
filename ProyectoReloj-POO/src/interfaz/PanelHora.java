package interfaz;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelHora extends JPanel {
	
	JLabel hora;
	JLabel minutos;
	JLabel segundos;
	JLabel sHorario;
	
	public PanelHora() {
	
		setSize(300,115);
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Hora")));
		
		hora = new JLabel("Hora");
		hora.setBounds(25, 25, 30, 15);
		add(hora);
		
		minutos = new JLabel("Minutos");
		minutos.setBounds(100, 25, 45, 15);
		add(minutos);
		
		segundos = new JLabel("Segundos");
		segundos.setBounds(200, 25, 60, 15);
		add(segundos);
		
	}

}
