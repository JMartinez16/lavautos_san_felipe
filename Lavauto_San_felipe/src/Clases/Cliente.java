


package Clases;

public class Cliente extends Persona{
	
	
    private Auto auto;
    
    public Cliente(Auto auto) {
    	
    	this.auto=auto;
    	
    }
    
    
    public void setAuto(Auto auto){
    	this.auto=auto;
    }
    public Auto getAuto(){
    	return auto;
    }
}