import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.IOException;
import java.util.Vector;


/**
 *
 * @author JuanPablo
 */
    
    public class Sensor {
    
    private String archivo;
    private Vector parrafo;
    private int contador;
    private boolean medicion;
    
    
    public Sensor() {
        try{
        archivo = "C:\\Users\\diego\\Desktop\\Diego Rivera\\texto\\pruebaLaberinto.txt";
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION){
            System.out.println("Usted eligio este archivo: " + chooser.getSelectedFile().getName());
            archivo = chooser.getSelectedFile().getAbsolutePath();
        }
        parrafo = LecturaArchivo.mostrarContenido(archivo);
        contador = parrafo.size();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
   
    public Sensor (boolean medicion){
        this.medicion = medicion;
    }

    public String getArchivo() {
        return archivo;
    }

    public Vector getParrafo() {
        return parrafo;
    }

    public int getContador() {
        return contador;
    }

    public boolean isMedicion() {
        return medicion;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public void setParrafo(Vector parrafo) {
        this.parrafo = parrafo;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setMedicion(boolean medicion) {
        this.medicion = medicion;
    }
    
    public String Detectar(){
        contador = contador -1;
        return (String) parrafo.elementAt(contador);
    }
    public Boolean medir(boolean medicion){
        boolean medir;
        if (medicion){
         medir = true;
        }
        else {
        medir = false;
        }
        return medir;
        
    }
    
}
