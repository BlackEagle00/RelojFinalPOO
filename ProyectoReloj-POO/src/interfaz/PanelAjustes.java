package interfaz;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class PanelAjustes extends JPanel implements ActionListener
{
	JButton btnHora;
	JButton btnMinutos;
	JButton btnSegundos;
	
	private Controlador ctrl;
	
	public PanelAjustes(Controlador ctrl) 
	{
		setSize(350,100);
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Ajustes")));
		
		
		btnHora = new JButton("H");
		btnHora.setBounds(25, 100, 45, 20);
		btnHora.addActionListener(this);
		add(btnHora);
		
		btnMinutos = new JButton("M");
		btnMinutos.setBounds(100, 100, 45, 20);
		btnMinutos.addActionListener(this);
		add(btnMinutos);
		
		btnSegundos = new JButton("S");
		btnSegundos.setBounds(200, 100, 45, 20);
		btnSegundos.addActionListener(this);
		add(btnSegundos);
		

		this.ctrl = ctrl;
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		
	}
}
