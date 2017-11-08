package login;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import EventosDelSistema.CerrarVentana;

public class Login extends JFrame implements ActionListener , Action
{
	public String titulo_de_ventana = new String("iniciar sesion ");
	public Color  color_de_fondo  ;
	public TextField user  = new TextField("User  ");
	public TextField pass = new TextField("Pass  ");
	JButton loggear	= new JButton("Loggear");
	JButton salir = new JButton("!Salir!");
	JPasswordField  pass2 = new JPasswordField();
	Integer [] posisionBotonLoggear={30,40};  
	Integer [] posisionBotonSalir={30,50}; 
	@SuppressWarnings("deprecation")
	public Login()
	{
		mostrarLogin();
		salir.addActionListener(new CerrarVentana() );
	}
	private void setearTamaño()
	{
		setSize(300,300);
		setFocusTraversalPolicy(getFocusTraversalPolicy());
	}
	private void setearColores()
	{
		color_de_fondo=Color.BLUE;
	}
	
	private void mostrarLogin()
	{
		setearColores();
		setearTamaño();
		setTitle(titulo_de_ventana);
		setVisible(true);
		posicionBotonSalir(posisionBotonSalir);
		posicionBotonLoggear(posisionBotonLoggear);
		setBounds(0,0,50,700);
	}
	private void posicionBotonLoggear(Integer[] posisionBotonLoggear)
	{
		 loggear.setBounds(0,0,posisionBotonLoggear[0],posisionBotonLoggear[1]);
	}
	private void posicionBotonSalir(Integer[] posisionBotonSalir)
	{
		salir.setBounds(0,0,posisionBotonSalir[0],posisionBotonSalir[1]);
	}
	private Boolean verificarContraseña()
	{
		Boolean x ;
		return pass.getText()=="1234" || pass2.getText()=="1234"?true : mostrarQueIngreseDeVuelta();
	}
	private Boolean mostrarQueIngreseDeVuelta()
	{
		pass.setText("");
		pass2.setText("");
		JOptionPane.showMessageDialog(this,"Ingresar devuelta la contraseña");
		return false;
	}
	public static void main(String[] args)
	{
		new Login();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object getValue(String key)
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void putValue(String key, Object value)
	{
		// TODO Auto-generated method stub
		
	}

}
