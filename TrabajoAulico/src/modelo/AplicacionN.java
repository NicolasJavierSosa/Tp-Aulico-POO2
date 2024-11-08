package modelo;


/**
 * Clase de aplicación que interactúa con la base de datos.
 */
public class AplicacionN {
    public BaseDeDatos dbConnection;
    /**
     * Constructor de la clase AplicacionN.
     * Obtiene la instancia de la clase BaseDeDatos.
     */
        public AplicacionN() {
    
            this.dbConnection = BaseDeDatos.getInstance();
    }
    /**
     * Método que simula una operación en la base de datos.
     */
    public void ejecutarOperacion() {
        dbConnection.realizarOperacion("Operación en Componente N");
    }
}

