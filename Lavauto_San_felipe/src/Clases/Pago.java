/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;
import java.util.Date;
import java.util.ArrayList;
public class Pago {
	private int numero;
	private Date fecha;
        private Empleado Empleado;
	private int valor;
private ArrayList<Pago> pago=new ArrayList<Pago>();
    public Pago(int num_pago, Date fec_pag, int val_pag) {
    	this.numero=num_pago;
    	this.fecha=fec_pag;
    	this.valor=val_pag;
    }
    
    public void setNumero(int num_pago){
    	this.numero=num_pago;
    }
    public int getNumero(){
    	return numero;
    }
    public void setFecha(Date fec_pag){
    	this.fecha=fec_pag;
    }
    public Date getFecha(){
    	return fecha;
    }
    public void setValor(int val_pag){
    	this.valor=val_pag;
    }
    public int getValor(){
    	return valor;
    }
}