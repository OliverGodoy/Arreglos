package umg.progra3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import umg.progra3.clases.ClaseArboles;
import umg.progra3.ejemploLombok.Persona;

import java.util.Date;

import static umg.progra3.ejercicios.EjercicioTreeSetAndMap.*;


public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
//        logger.debug("Mensaje de depuración");
//        logger.warn("Mensaje de advertencia");
//        logger.error("Mensaje de error");

        // EjecutarMinOperaciones();
        // EjecutarAgruparPersonas();
        // EjecutarConvertirArregloAMatriz();
        // EjecutarOrdenarElementosFrecuencia();

        // EjecutarArray();
        // EjecutarSuma();
         // EjecutarDiagonal();
        
//        eliminarDuplicados();
//        invertirElemento();
//        unirListas();

        //ejemploLombok();
        AnalisisFrecuenciaPalabras();
        RastreadorVersion();
        GestorEvento();

    }

    public static void ejemploLombok() {
        Persona persona = new Persona("Oliver","Godoy",new Date(90,5,15));
        persona.setAddress("Jutiapa");
        persona.setCity("Guatemala");

        logger.info("Información " + persona);
    }
}