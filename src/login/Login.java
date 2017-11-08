package login;

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Login extends JFrame
{
	TextField user  = new TextField("User  ");
	TextField pass = new TextField("Pass  ");
	JButton loggear	= new JButton("Loggear");
	JButton salir = new JButton("!Salir!");
	
	private Boolean verificarSiIngresoBien()
	{
		return pass.getText()=="1234";
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
