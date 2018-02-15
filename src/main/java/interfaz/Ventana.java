package interfaz;


import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame{
	private static final long serialVersionUID = 1L;
	private Display _pantalla = new Display();
	private Botonera _botonera = new Botonera();
	
	public Ventana() {
		
		configuracion();
		agregarComponentes();
	}
	
	private void configuracion() {
		
		setBounds(	Medidas.VENTANA_X,
					Medidas.VENTANA_Y,
					Medidas.VENTANA_ANCHO,
					Medidas.VENTANA_ALTO);
		
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	}
	
	private void agregarComponentes() {
		getContentPane().add(_pantalla);
		cargarBotones();
	}
	
	private void cargarBotones() {
		for (ArrayList<JButton> lista : _botonera.botones) {
			for (JButton jButton : lista) {
				getContentPane().add(jButton);
			}
		}
		
	}
	
}
