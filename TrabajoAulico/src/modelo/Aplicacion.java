package modelo;


/**
 * Clase de aplicación que interactúa con la base de datos.
 */
public class Aplicacion {
    public BaseDeDatos dbConnection;


    /**
     * Constructor de la clase Aplicacion.
     * Obtiene la instancia de la clase BaseDeDatos.
     */
    public Aplicacion() {

        // Obtener la instancia de BaseDeDatos
        this.dbConnection = BaseDeDatos.getInstance();
    }
    /**
     * Método que simula una operación en la base de datos.
     */
    public void ejecutarOperacion() {
        dbConnection.realizarOperacion("Operación en Componente G");
    }
}
