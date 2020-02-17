package notas;

public class Trabajo {
    
	private final int PLAZO_MAXIMO = 6;
	private boolean isPresentado;
	private int diasRetraso;
	
	
    public Trabajo() {
        
    }
    
    public void generarPresentado () {
    	
    	isPresentado = ((int) (Math.random() * 10) > 5)?true:false;
    	
    }
    
    
    public void generarDiasRetraso() {
    	diasRetraso = (int) (Math.random() * PLAZO_MAXIMO);
    }
    
    public boolean trabajoAprobado () {
        
        if(isPresentado) {
            if(diasRetraso > 5) {
                return false;
            }else {
                return true;
            }
        }
        
        return false;
    }
    
  
    public boolean haEntregadoTodosLosTrabajos(boolean[] trabajos) {
    	
    	for (boolean b : trabajos) {
            if (b == false) {
                    return false;
            }
        }
    	return true;
    }

}
