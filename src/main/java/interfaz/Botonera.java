package interfaz;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Botonera {
	ArrayList<ArrayList<JButton>> botones = new ArrayList<ArrayList<JButton>>();
	
//	private JButton bCero = new JButton("0");
//	private JButton bUno = new JButton("1");
//	private JButton bDos = new JButton("2");
//	private JButton bTres = new JButton("3");
//	private JButton bCuatro = new JButton("4");
//	private JButton bCinco = new JButton("5");
//	private JButton bSeis = new JButton("6");
//	private JButton bSiete = new JButton("7");
//	private JButton bOcho = new JButton("8");
//	private JButton bNueve = new JButton("9");
//	private JButton bSuma = new JButton("+");
//	private JButton bResta = new JButton("-");
//	private JButton bDivision = new JButton("/");
//	private JButton bProducto = new JButton("*");
//	private JButton bDecimal = new JButton(".");
//	private JButton bIgual = new JButton("=");
	
	public Botonera() {
		cargarArray();
		cargarBotones();
	}
	private void cargarArray() {
		for (int i = 0; i < 4; i++) {
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
		
		
		
	}
	
	private void cargarBotones() {
		int contadorColumnas = 0;
		int contadorFilas = 0;
		
		int medidaBase = Medidas.BOTONERA_FILA1;
		int distancia = Medidas.BOTONES_MARGEN;
//		botones.get(0).get(0).setBounds(Medidas.BOTONERA_COLUMNA1, medidaBase, Medidas.BOTON_ANCHO, Medidas.BOTON_ALTO);
//		botones.get(0).get(1).setBounds(Medidas.BOTONERA_COLUMNA1, medidaBase -  distancia, Medidas.BOTON_ANCHO, Medidas.BOTON_ALTO);
		for (int j = 0; j < 4; j++) {
			botones.get(0).get(j).setBounds(Medidas.BOTONERA_COLUMNA1, medidaBase, Medidas.BOTON_ANCHO, Medidas.BOTON_ALTO);
			
			medidaBase -= distancia;
		}
	}

}
