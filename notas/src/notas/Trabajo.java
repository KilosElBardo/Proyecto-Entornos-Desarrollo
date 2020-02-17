package notas;

public class Trabajo {
    
	private final int PLAZO_MAXIMO = 6;
	private boolean isPresentado;
	private int diasRetraso;
	
	
    public Trabajo() {
        generarPresentado();
        generarDiasRetraso();
    }
    
    public void generarPresentado () {
    	
    	isPresentado = ((int) (Math.random() * 7) < 5)?true:false;
    	
    }
    
    
    public void generarDiasRetraso() {
    	
    	if(isPresentado) {
    		diasRetraso = (int) (Math.random() * PLAZO_MAXIMO);
    	}
    	
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

	public boolean isPresentado() {
		return isPresentado;
	}

	public int getDiasRetraso() {
		return diasRetraso;
	}
	
	public String toString() {
		return "Is presentado " + isPresentado + "\nDias retraso " + diasRetraso;
	}

}
