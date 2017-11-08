package tabla;
public class ControlTabla
 {
     /**
      * Constructor. Se le pasa el modelo, al que añade varios elementos y
      * se lo guarda.
      */
     public ControlTabla(ModeloTabla2 modelo)
     {
         this.modelo = modelo;
         
         modelo.anhadePersona(new Persona ("Chuidiang", "Roxas", 38));
         modelo.anhadePersona(new Persona ("Ballena", "Llena", 24));
         modelo.anhadePersona(new Persona ("Loco", "Locati", 15));
         modelo.anhadePersona(new Persona ("Juan", "ola", 48));
     }
     
     /**
      * Añade una fila en el modelo, al final del mismo
      */
     public void anhadeFila ()
     {
         // Crea una nueva Persona, construyéndola a base del atributo 
         // numero.
         Persona dato = new Persona (
            "Nombre " + Integer.toString (numero),
            "Apellido " + Integer.toString (numero), 
            numero);
         
         modelo.anhadePersona (dato);
         
         // Incrementa numero para que la siguiente Persona a añadir sea
         // distinta.
         numero++;
     }
     
     /** Elimina la primera fila del modelo */
     public void borraFila ()
     {
         if (modelo.getRowCount() > 0)
            modelo.borraPersona (0);
     }
     
     /** El modelo de la tabla */
     private ModeloTabla2 modelo = null;
     
     /** Numero que nos servirá para construir personas distintas para la 
      tabla */
     private static int numero = 0;
}
