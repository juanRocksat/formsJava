package login;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import EventosDelSistema.CerrarVentana;

public class Login extends JFrame implements ActionListener , Action
{
	public JLabel labelUser = new JLabel("user : ");
	public JLabel labelPass = new JLabel("Pass : ");
	public String titulo_de_ventana = new String("iniciar sesion ");
	public Color  color_de_fondo  ;
	public TextField user  = new TextField("User  ");
	public TextField pass = new TextField("Pass  ");
	JButton loggear	= new JButton("Loggear");
	JButton salir = new JButton("!Salir!");
	JPasswordField  pass2 = new JPasswordField();
	Integer [] posisionBotonLoggear={30,20};  
	Integer [] posisionBotonSalir={30,50}; 
	public Login()
	{
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mostrarLogin();
	}
	private void configurarBotones()
	{
		loggear.setCursor(getCursor());
		loggear.setBounds(posisionBotonLoggear[0],posisionBotonLoggear[1],10,10);
		salir.setBackground(Color.RED);
		salir.setBounds(posisionBotonSalir[0],posisionBotonSalir[1],10,10);
		add(loggear);add(salir);
		loggear.addActionListener(this);
		salir.addActionListener(this);
	}
	private void configurarCamposDeTexto()
	{
		add(user);add(pass);
		user.setBounds(20,30,50,15);
		pass.setBounds(20,40,50,15);
	}
	private void configurarLabels()
	{
		
	}
	private void setearColores()
	{
		color_de_fondo=Color.BLUE;
		setBackground(color_de_fondo);
	}
	private void mostrarLogin()
	{
		setearColores();
		setSize(500,500);
		setTitle(titulo_de_ventana);
		setVisible(true);
		configurarBotones();
//		posicionBotonSalir(posisionBotonSalir);
//		posicionBotonLoggear(posisionBotonLoggear);
		setBounds(20,20,250,270);
	}
//	private void posicionBotonLoggear(Integer[] posisionBotonLoggear)
//	{
//		 loggear.setBounds(0,0,posisionBotonLoggear[0],posisionBotonLoggear[1]);
//	}
//	private void posicionBotonSalir(Integer[] posisionBotonSalir)
//	{
//		salir.setBounds(0,0,posisionBotonSalir[0],posisionBotonSalir[1]);
//	}
	private Boolean verificarContraseņa()
	{
		return pass.getText()=="1234" || pass2.getText()=="1234"?true : mostrarQueIngreseDeVuelta();
	}
	private Boolean mostrarQueIngreseDeVuelta()
	{
		pass.setText("");
		pass2.setText("");
		JOptionPane.showMessageDialog(this,"Ingresar devuelta la contraseņa","Error", ERROR, null);
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
		verificarContraseņa();
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
