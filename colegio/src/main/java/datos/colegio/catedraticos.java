package datos.colegio;

import javax.swing.JOptionPane;

public class catedraticos {
    private String nombre;
    private String apellidos;
    private String materia;
    private String genero;
    private int edad;
    
    public catedraticos(String nombre, String apellidos, String materia, int edad, String genero){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.materia = materia;
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
    public String getMateria(){
        return materia;
    }
    public void setMateria(String materia){
        this.materia = materia;
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
        String mensaje = "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nMateria: " + materia
                + "\nEdad: " + edad + "\nGenero: " + genero;
	JOptionPane.showMessageDialog(null, mensaje, "Mostrar alumnos", JOptionPane.INFORMATION_MESSAGE);
    }
}