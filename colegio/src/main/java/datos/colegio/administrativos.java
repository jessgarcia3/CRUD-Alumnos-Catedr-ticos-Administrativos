package datos.colegio;

import javax.swing.JOptionPane;

public class administrativos {
    private String nombre;
    private String apellidos;
    private String areadetrabajo;
    private String genero;
    private int edad;
    
    public administrativos(String nombre, String apellidos, String areadetrabajo, int edad, String genero){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.areadetrabajo = areadetrabajo;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public String getAreadetrabajo(){
        return areadetrabajo;
    }
    public void setAreadetrabajo(String areadetrabajo){
        this.areadetrabajo = areadetrabajo;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public void mostrar(){
        String mensaje = "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nArea de trabajo: " + areadetrabajo
                + "\nEdad: " + edad + "\nGenero: " + genero;
	JOptionPane.showMessageDialog(null, mensaje, "Mostrar personal administrativo", JOptionPane.INFORMATION_MESSAGE);
    }
}
