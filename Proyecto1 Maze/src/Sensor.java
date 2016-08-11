/*
Universidad del Valle de Guatemala
Proyecto1 AED
Juan Pablo Cahueque
Enma Lopez
Diego Rivera
Jorge Tezen
Motor.java
*/
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.IOException;
import java.util.Vector;


/**
 *
 * @author JuanPablo
 */
    //Para la simulacion esta clase lee el archivo que simula el laberinto y contiene las detecciones
    public class Sensor {
    
    private String archivo;
    private Vector parrafo;
    private int contador;
    private boolean medicion;
    
    
    public Sensor() {
        archivo = "C:\\Users\\JuanPablo\\Documents\\NetBeansProjects\\Proyecto\\src\\Proyecto\\laberintoComplejo.txt";
        //Descomente aqui para volver la lectura mas dinamica (si no quiere cambiar la direccion manualmente)
//        try{
//            JFileChooser chooser = new JFileChooser();
//            int returnVal = chooser.showOpenDialog(null);
//            if (returnVal == JFileChooser.APPROVE_OPTION){
//                System.out.println("Usted eligio este archivo: " + chooser.getSelectedFile().getName());
//                archivo = chooser.getSelectedFile().getAbsolutePath();
//            }
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        try{
            parrafo = LecturaArchivo.mostrarContenido(archivo);
            contador = parrafo.size();
        }
        catch(Exception e){
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
        //Al detectar se elimina la instruccion leida
        contador = contador-1;
        String linea = (String) parrafo.elementAt(0);
        parrafo.removeElementAt(0);
        return linea;
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
