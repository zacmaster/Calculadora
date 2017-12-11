package interfaz;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Botonera {
	ArrayList<JButton> botones = new ArrayList<JButton>();
	public Botonera(JFrame jframe) {
		cargarBotones(jframe);
	}
	
	
	private void cargarBotones(JFrame jframe) {
		int cantidadDeBotones = 8;
		for (int i = 0; i < cantidadDeBotones; i++) {
			JButton b = new JButton();
			b.setBounds(0, 0, 30, 30);
			jframe.getContentPane().add(b);
			
		}
	}
}
