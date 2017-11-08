package botones;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import EventosDelSistema.CerrarVentana;

public class Finalizar extends JFrame implements ActionListener
{
	Button finish = new Button();
	private void hacerloFinalizar()
	{
		finish.addActionListener(this);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if (botonFuePresionado(e)){
			cerrarVentana();
		}
	}
	private void cerrarVentana()
	{
		System.exit(0);
	}
	private boolean botonFuePresionado(ActionEvent e)
	{
		//e.Auto-generated method stub
		return e.getSource()==finish;
	}
	

}
