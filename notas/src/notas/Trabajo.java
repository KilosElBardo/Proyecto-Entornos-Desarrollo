package notas;

public class Trabajo {
    
	private final int PLAZO_MAXIMO = 6;
	private boolean isPresentado;
	private int diasRetraso;
	
	
    public Trabajo() {
        generarPresentado();
        generarDiasRetraso();
    }
    
    public Trabajo(boolean isPresentado, int diasRetraso) {
    	this.isPresentado = isPresentado;
    	this.diasRetraso = diasRetraso;
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
    
    static public boolean haEntregadoTodosLosTrabajos(Trabajo[] trabajos) {
    	
    	for (Trabajo b : trabajos) {
            if (b.isPresentado() == false) {
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
	
	public String getTrabajo() {
		
		return (trabajoAprobado())?"Aprobado":"Suspendido";
	}
	
	public String toString() {
		return "Is presentado " + isPresentado + "\nDias retraso " + diasRetraso;
	}

}
