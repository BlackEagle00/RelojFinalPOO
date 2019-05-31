package interfaz;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelHora extends JPanel 
{
	
	JLabel hora;
	JLabel minutos;
	JLabel segundos;
	
	JLabel h;
	JLabel m;
	JLabel s;
	
	JLabel sHorario;
	
	public PanelHora() 
	{
	
		setSize(350,100);
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Hora")));
		
		hora = new JLabel("Hora");
		hora.setBounds(25, 25, 30, 15);
		add(hora);
		
		h = new JLabel("12");
		h.setBounds(25, 50, 30, 15);
		add(h);
		
		minutos = new JLabel("Minutos");
		minutos.setBounds(110, 25, 45, 15);
		add(minutos);
		
		m = new JLabel("0");
		m.setBounds(110, 50, 45, 15);
		add(m);
		
		segundos = new JLabel("Segundos");
		segundos.setBounds(200, 25, 60, 15);
		add(segundos);
	
		s = new JLabel("0");
		s.setBounds(200, 50, 60, 15);
		add(s);
		
		sHorario = new JLabel("AM");
		sHorario.setBounds(310, 50, 60, 15);
		add(sHorario);
	}

}
