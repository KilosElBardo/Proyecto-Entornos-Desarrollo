package notas;

// TODO: Auto-generated Javadoc
/**
 * The Class Trabajo.
 */
public class Trabajo {
    
	/**PLAZO_MAXIMO establece el plazo máximo de días que el programa puede generar de retraso en la entrega
	 * de un trabajo */
	private final int PLAZO_MAXIMO = 6;
	
	/**isPresentado indica si el trabajo está presentado o no */
	private boolean isPresentado;
	
	/** indica los días de retraso */
	private int diasRetraso;
	
	
    /**
     * Constructor que genera 
     */
    public Trabajo() {
        generarPresentado();
        generarDiasRetraso();
    }
    
    /**
     * Instantiates a new trabajo.
     *
     * @param isPresentado the is presentado
     * @param diasRetraso the dias retraso
     */
    public Trabajo(boolean isPresentado, int diasRetraso) {
    	this.isPresentado = isPresentado;
    	this.diasRetraso = diasRetraso;
    }
    
    /**
     * Generar presentado.
     */
    public void generarPresentado () {
    	
    	isPresentado = ((int) (Math.random() * 7) < 5)?true:false;
    	
    }
    
    
    /**
     * Generar dias retraso.
     */
    public void generarDiasRetraso() {
    	
    	if(isPresentado) {
    		diasRetraso = (int) (Math.random() * PLAZO_MAXIMO);
    	}
    	
    }
    
    /**
     * Trabajo aprobado.
     *
     * @return true, if successful
     */
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
    
    /**
     * Ha entregado todos los trabajos.
     *
     * @param trabajos the trabajos
     * @return true, if successful
     */
    static public boolean haEntregadoTodosLosTrabajos(Trabajo[] trabajos) {
    	
    	for (Trabajo b : trabajos) {
            if (b.isPresentado() == false) {
                    return false;
            }
        }
    	return true;
    }

	/**
	 * Checks if is presentado.
	 *
	 * @return true, if is presentado
	 */
	public boolean isPresentado() {
		return isPresentado;
	}

	/**
	 * Gets the dias retraso.
	 *
	 * @return the dias retraso
	 */
	public int getDiasRetraso() {
		return diasRetraso;
	}
	
	/**
	 * Gets the trabajo.
	 *
	 * @return the trabajo
	 */
	public String getTrabajo() {
		
		return (trabajoAprobado())?"Aprobado":"Suspendido";
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "Is presentado " + isPresentado + "\nDias retraso " + diasRetraso;
	}

}
