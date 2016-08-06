
/**
 *
 * @author Usuario
 */
public class Sensor {
    
    
    boolean Medicion;
    
    public Sensor (boolean medicion){
        this.Medicion = medicion;
    }
    
    public Boolean medir(boolean medicion){
        boolean medir;
        if (medicion==true){
         medir = true;
        }
        else {
        medir = false;
        }
        return medir;
        
    }
    
}
