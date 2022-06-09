/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.ArrayList;
import java.util.Date;

public class Factura {
   private String numero_factura;
   private Date fecha_factura;
   private ArrayList<Servicio> servicios = new ArrayList<Servicio>();
   private ArrayList<Factura> facturas = new ArrayList<Factura>();
   private Auto Auto;
   private Empleado Empleado;
   
	
	public Factura( String num_fact, Date fec_fact){
		this.numero_factura=num_fact;
		this.fecha_factura= fecha_factura;
	}
        
	
	public void setNumero_factura(String numero_factura){
		this.numero_factura=numero_factura;
	}
	public String getNumero_factura(){
		return numero_factura;
	}
	

	public  void setFecha_factura( Date fecha_factura){
		this.fecha_factura=fecha_factura;
	}
	public Date getFecha_factura(){
		return fecha_factura;
	}
	
	public ArrayList<Servicio> getServicios(){
		return servicios;
	}



}