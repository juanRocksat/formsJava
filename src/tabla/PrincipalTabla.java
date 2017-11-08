package tabla;
import javax.swing.*;

/**
 * Crea la vista, el modelo y el control del ejemplo de uso de la tabla.
 * Hereda de JFrame.
 */
public class PrincipalTabla extends JFrame
{
    
    /** Creates a new instance of PrincipalTabla */
    public PrincipalTabla() 
    {
        // Crea el modelo
        ModeloTabla2 modelo = new ModeloTabla2();
        
        // Crea el control, pasándole el modelo
        ControlTabla control = new ControlTabla (modelo);
        
        // Crea la vista, pasándole el control
        this.getContentPane().add (new PanelCompleto(modelo, control));
        
        // Hace que la ventana sea visible.
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        new PrincipalTabla();
    }
    
}
