/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Fabrica_Servicios {
	//atributos estaticos para que solo exista una instancia y para hacer consecutivo de codigos de ser.
	private static Fabrica_Servicios instancia = null;
	private static int nservicios=0;

    public Fabrica_Servicios() {
    }
    
    public static Fabrica_Servicios getInstancia(){
    	if (instancia == null){
    		instancia = new Fabrica_Servicios();
    	}
    	return instancia;
    }
    // creando servicio segun tipo. 
    public Servicio crear(int tipo, Empleado e, Cliente c){
    	nservicios++;
    	if (tipo == 1){
     	return new Servicio(nservicios, "Lavado sencillo del auto", 5000, e, c);
    	}
    	if (tipo==2){
    	return new Servicio(nservicios, "Lavado General del auto", 9000, e, c );
    	}
    	if (tipo ==3){
    		return new Servicio(nservicios, "Polichada del auto", 18000, e, c);
    	}
    	if (tipo==4){
    		return new Servicio(nservicios, "petrolizada del auto", 30000, e, c);
    	}
    	if (tipo ==5){
    		return new Servicio(nservicios, "Cambio de aceite", 28000, e, c);
    	}
    	return null;
    }
}