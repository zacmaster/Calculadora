package interfaz;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Display extends JTextField{
	private static final long serialVersionUID = 1L;
	
	public Display() {
		configuracion();
	}
	
	private void configuracion() {
		
		setBackground(Color.WHITE);
		setEditable(false);
		setHorizontalAlignment(SwingConstants.RIGHT);
		setBounds(	Medidas.DISPLAY_X,
					Medidas.DISPLAY_Y,
					Medidas.DISPLAY_ANCHO,
					Medidas.DISPLAY_ALTO);
		setColumns(10);
		
	}
	
}
