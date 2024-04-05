/**
 * Aqui se introducen los valores con los que contará cada proceso, así como la memoria y el quantum 
 */

package proyecto_so;
import java.util.Scanner; //Libreria para poder utilizar clase Scanner

public class Proyecto_SO {

    public static void main(String[] args) {
        int memoriaTot;
        int quantumTot;
        int totProcesos;
        
        System.out.println("--> BIENVENIDO AL SIMULADOR DE PLANIFICADOR DE PROCESOS <---");
        
        Scanner scanner = new Scanner(System.in); // Inicializa el scanner
    
        do {
            System.out.println("\nPrimero, introduzca el valor que tendra la memoria (debe ser mayor a cero):");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
            }
            memoriaTot = scanner.nextInt();

            if (memoriaTot < 1) {
                System.out.println("El valor ingresado debe ser mayor a cero. Por favor, intentelo nuevamente.");
            }
        } while (memoriaTot < 1);
        
        do {
            System.out.println("\nAhora, introduzca el Quantum que tendra cada proceso al ejecutarse: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
            }
            quantumTot = scanner.nextInt();

            if (quantumTot < 1) {
                System.out.println("El valor ingresado debe ser mayor a cero. Por favor, intentelo nuevamente.");
            }
        } while (quantumTot < 1);
        
        do {
            System.out.print("\nAhora, introduzca el numero total de procesos que se van a ejecutar: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
            }
            totProcesos = scanner.nextInt();

            if (totProcesos  < 1) {
                System.out.println("El valor ingresado debe ser mayor a cero. Por favor, intentelo nuevamente.");
            }
        } while (totProcesos  < 1);
        
        
        ColaProcesosListos procesos = new ColaProcesosListos(); // Se inicializa la cola de procesos listos
        
        System.out.println("\nGracias, por favor introduzca los datos de cada uno de los procesos que se le piden a continuacion");
        
        for(int i = 1; i <= totProcesos; i++){ // El siguiente for ayudará a ingresar uno por uno los datos de todos los procesos totales que se declararon al principio
            int tiempoLlegada;
            
            System.out.println("\n--- PROCESO " + i + " ---"); 
            String idProceso = "P" + i; //Indicamos proceso a teclear
            String nomProceso = "Proceso " + i;
            
            
            System.out.print("Tamano a ocupar de memoria: ");
            int memoProceso = scanner.nextInt(); //Cada tamaño se guarda en memoProceso
            
            if(memoProceso > memoriaTot){
                System.out.println("\nLo siento pero tu proceso es mayor que el de la memroia total, por lo tanto, no puede ser cargado");
                System.exit(0);
            }
            
            
            System.out.print("Tiempo de rafaga: ");
            int tiempoRafaga = scanner.nextInt(); //Cada rafaga guardada en tiempoRafaga
            do {
                System.out.print("Tiempo de llegada: ");
                while (!scanner.hasNextInt()) {
                    String input = scanner.next();
                }
                tiempoLlegada = scanner.nextInt();

                if (tiempoLlegada  < 0) {
                    System.out.println("El valor ingresado debe ser mayor o igual a cero. Por favor, inténtelo nuevamente.");
                }
            } while (tiempoLlegada  < 0);
            
            //Llamando al método insertarProceso dentro de la clase ColaProcesosListos, con argumentos un nuevo objeto Proceso
            procesos.insertarProceso(new Proceso(idProceso, nomProceso, memoProceso, tiempoRafaga, tiempoLlegada)); 
        }

        //Creando Cola FIFO vacío
        ColaFIFO colaFIFO = new ColaFIFO(); 

        //Creando administrador de procesos vacío
        AdministradorProcesos administrador = new AdministradorProcesos();
        
        //Llamando al método simularCargaProcesos con argumentos de proceso, colaFIIFO, memoriaTot y quantumTot
        administrador.simularCargaProcesos(procesos, colaFIFO, memoriaTot, quantumTot,totProcesos);     
     
        procesos.imprimirContenido();

        
    }
}
