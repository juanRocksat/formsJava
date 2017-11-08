package tabla_borrador;
import javax.swing.*;

/**
 * Crea la vista, el modelo y el control del ejemplo de uso de la tabla.
 * Hereda de JFrame.
 */
public class AppletTable extends JApplet
{
    
    /** Creates a new instance of PrincipalTabla */
    public void init() 
    {
        // Crea el modelo
        ModeloTabla2 modelo = new ModeloTabla2();
        
        // Crea el control, pasándole el modelo
        ControlTabla control = new ControlTabla (modelo);
        
        // Crea la vista, pasándole el control
        this.getContentPane().add (new PanelCompleto(modelo, control));
    }
}
