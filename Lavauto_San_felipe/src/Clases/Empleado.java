/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 

package Clases;
import java.util.ArrayList;

public class Empleado extends Persona{
	private int Code;
    ArrayList<Pago> pagos = new ArrayList <Pago>();
    
    
    public Empleado(int Code) {
    this.Code=Code;
    }
   
   
   
 
    public ArrayList<Pago> getPagos(){
    return pagos;
    }
    
}