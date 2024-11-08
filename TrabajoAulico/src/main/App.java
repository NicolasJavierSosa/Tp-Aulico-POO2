package main;
import modelo.Aplicacion;
import modelo.AplicacionN;


/**
 * Clase App es en donde está la logica del programa
 */
public class App {

    
    /**
     * Método principal del programa.
     * 
     * @param args Argumentos de la línea de comandos (no se usan en este caso).
     * @throws Exception En caso de que ocurra un error durante la ejecución.
     */
    public static void main(String[] args) throws Exception {
        Aplicacion Componente = new Aplicacion();
        AplicacionN ComponenteN = new AplicacionN();

        Componente.ejecutarOperacion();
        ComponenteN.ejecutarOperacion();

        System.out.println("Ambos componentes usan la misma instancia: " +
        (Componente.dbConnection == ComponenteN.dbConnection));

    }

}
