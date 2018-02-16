package interfaz;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;

@SuppressWarnings("unused")
public class Botonera {
	ArrayList<ArrayList<JButton>> botones = new ArrayList<ArrayList<JButton>>();
	private final int btn_ancho = Medidas.BOTON_ANCHO;
	private final int btn_alto = Medidas.BOTON_ALTO;
	
	public Botonera() {
		cargarArray();
		cargarBotones();
		cargarListeners();
	}
	private void cargarArray() {
		for (int i = 0; i < 5; i++) {
			botones.add(new ArrayList<JButton>());
		}
		botones.get(0).add(new JButton("."));
		botones.get(0).add(new JButton("1"));
		botones.get(0).add(new JButton("4"));
		botones.get(0).add(new JButton("7"));
		
		botones.get(1).add(new JButton("0"));
		botones.get(1).add(new JButton("2"));
		botones.get(1).add(new JButton("5"));
		botones.get(1).add(new JButton("8"));
		
		botones.get(2).add(new JButton("="));
		botones.get(2).add(new JButton("3"));
		botones.get(2).add(new JButton("6"));
		botones.get(2).add(new JButton("9"));
		
		botones.get(3).add(new JButton("+"));
		botones.get(3).add(new JButton("-"));
		botones.get(3).add(new JButton("x"));
		botones.get(3).add(new JButton("/"));
		
		botones.get(4).add(new JButton("CE"));
		
		
	}
	
	private void cargarBotones() {
		
		int distancia = Medidas.BOTONES_MARGEN_VERTICAL;
		int x = 0;
		for (int i = 0; i < 4; i++) {
			int medidaBase = Medidas.BOTONERA_FILA1;
			if(i == 0)x = Medidas.BOTONERA_COLUMNA1;
			if(i == 1)x = Medidas.BOTONERA_COLUMNA2;
			if(i == 2)x = Medidas.BOTONERA_COLUMNA3;
			if(i == 3)x = Medidas.BOTONERA_COLUMNA4;
			
			for (int j = 0; j < 4; j++) {
				botones.get(i).get(j).setBounds(x, medidaBase, btn_ancho, btn_alto);
				
				medidaBase -= distancia;
			}
		}
		System.out.println(Medidas.BOTONERA_FILA5);
		botones.get(4).get(0).setBounds(Medidas.BOTONERA_COLUMNA4, Medidas.BOTONERA_FILA5, btn_ancho, btn_alto);
	}
	
	private void cargarListeners() {
		for (int i = 0; i < botones.size(); i++) {
			for (int j = 0; j < botones.get(i).size(); j++) {

				//				botones.get(i).get(j).addMouseListener(new MouseAdapter() {
//					@Override
//					public void mouseClicked(MouseEvent arg0) {
//					
//					}
//				});
//				botones.get(i).get(j).setfouse
//				botones.get(i).get(j).setFocusable(true);
				botones.get(i).get(j).addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent arg0) {
						controlarTecla(arg0);
					}

				});
//				System.out.println(botones.get(i).get(j).getText());
			}
		}
	}
	private String texto(String s) {
		return s;
	}
	private void controlarTecla(KeyEvent arg0) {
		switch (arg0.getKeyChar()) {
			case '1':
				System.out.println('1');
				break;
			case '2':
				System.out.println('2');
				break;
		}
			
	}
}
