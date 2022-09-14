package datos.colegio;

import javax.swing.JOptionPane;

public class alumnos {
    private String nombre;
    private String apellidos;
    private String grado;
    private String genero;
    private int edad;
    
    public alumnos(String nombre, String apellidos, String grado, int edad, String genero){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.grado = grado;
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
    public String getGrado(){
        return grado;
    }
    public void setGrado(String grado){
        this.grado = grado;
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
        String mensaje = "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nGrado: " + grado
                + "\nEdad: " + edad + "\nGenero: " + genero;
	JOptionPane.showMessageDialog(null, mensaje, "Mostrar alumnos", JOptionPane.INFORMATION_MESSAGE);
    }
}
