package interfaz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Display extends JTextField{
	private static final long serialVersionUID = 1L;
	private String texto = "0";
	
	public Display() {
		
		configuracion();
	}
	
	public void setTexto(Double d) {
		texto = d.toString();
		setText(texto);
	}
	
	
	
	private void configuracion() {
		
		configuracionTexto();
		setBackground(Color.WHITE);
		setEditable(false);
		setHorizontalAlignment(SwingConstants.RIGHT);
		setBounds(	Medidas.DISPLAY_X,
					Medidas.DISPLAY_Y,
					Medidas.DISPLAY_ANCHO,
					Medidas.DISPLAY_ALTO);
		setColumns(10);
		
	}
	
	private void configuracionTexto() {
		setText(texto);
		setFont(new Font("Courier", Font.BOLD,24));
	}
	
	
}
