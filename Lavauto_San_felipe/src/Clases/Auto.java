


package Clases;
import java.util.LinkedList;


public class Auto {
	private String placa;
	private String propietario;
	
	public Auto(String pl, String pro){
		this.placa=pl;
		this.propietario=pro;
	}
	
	public void setPlaca(String pl){
    	this.placa=pl;
    }
    
    public String getPlaca(){
    	return placa;
    }
	
	public void setPropietario(String pro){
		this.propietario=pro;
	}
	
	public String getPropietario(){
		return propietario;
	}
}
