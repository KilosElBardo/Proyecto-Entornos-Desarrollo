package notas;

public class Trabajo {
	

    static boolean[] trabajosPasados;
    
    public Trabajo() {
        
    }
    
    public static boolean trabajoAprobado (boolean isPresentado, int retraso) {
        
        if(isPresentado) {
            if(retraso > 5) {
                return false;
            }else {
                return true;
            }
        }
        
        return false;
    }
    
    
    public static boolean haEntregadoTodosLosTrabajos(boolean[] trabajos) {
    	
    	for (boolean b : trabajos) {
            if (b == false) {
                    return false;
            }
        }
    	return true;
    }

}
