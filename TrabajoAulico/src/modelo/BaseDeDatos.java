package modelo;
/**
 * Clase que representa la conexión a la base de datos.
 * Utiliza el patrón Singleton para garantizar una única instancia.
 */
public class BaseDeDatos {
    // Instancia única de BaseDeDatos
    private static BaseDeDatos instance = null;


    /**
     * Constructor privado para evitar la creación de instancias directas.
     */
    private BaseDeDatos(){
        System.out.println("Conexión a la base de datos establecida");
    }
    /**
     * Método para obtener la instancia única de BaseDeDatos.
     * 
     * @return La instancia de la clase BaseDeDatos.
     */
    public static BaseDeDatos getInstance() {
        if (instance == null) {
            instance = new BaseDeDatos();
        }
        return instance;
    }

    
    /**
     * Realiza una operación en la base de datos.
     * 
     * @param operacion La operación a realizar.
     */
    public void realizarOperacion(String operacion) {
        System.out.println("Realizando operación: " + operacion);
    }
}
