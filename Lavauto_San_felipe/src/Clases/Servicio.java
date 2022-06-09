/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Servicio {
	private int codigo_servicio;
	private String descripcion;
	private int valor;
	private Cliente cliente;
	private Empleado empleado;
    

    public Servicio(int cod_ser, String des_ser, int val_ser, Empleado empleado, Cliente ciente) {
    	this.codigo_servicio=cod_ser;
    	this.descripcion=des_ser;
    	this.valor=val_ser;
    	this.cliente=cliente;
    	this.empleado=empleado;
    }


	public void setCodigo_servicio(int cod_ser){
    	this.codigo_servicio=cod_ser;
    }

    public int getCodigo_servicio(){
    	return codigo_servicio;
    }
    public void setDescripcion(String des_ser){
    	this.descripcion=des_ser;
    }
    public String getDescripcion(){
    	return descripcion;
    }
    public void setValor(int val_ser){
    	this.valor=val_ser;
    }
    public int getValor(){
    	return valor;
    }
    public Cliente getCliente(){
    	return cliente;
    }
    public Empleado getEmpleado(){
    	return empleado;
    }
    
}