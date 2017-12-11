package interfaz;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	private static final long serialVersionUID = 1L;
	private Display pantalla = new Display();

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
		getContentPane().add(pantalla);
	}
	
}
