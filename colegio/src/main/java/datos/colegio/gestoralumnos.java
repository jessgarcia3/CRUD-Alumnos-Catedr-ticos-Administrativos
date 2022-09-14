package datos.colegio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class gestoralumnos {
    private ArrayList<alumnos> alumnos;
	
    public gestoralumnos() {
        alumnos = new ArrayList<alumnos>();
    }
    public boolean nuevoalumnos() {
        String grado = JOptionPane.showInputDialog(null, "Introduzca grado:", "Nuevo alumno", JOptionPane.QUESTION_MESSAGE);
	String nombre = JOptionPane.showInputDialog(null, "Nombre:", "Nuevo alumno", JOptionPane.QUESTION_MESSAGE);
	String apellidos = JOptionPane.showInputDialog(null, "Apellidos:", "Nuevo alumno", JOptionPane.QUESTION_MESSAGE);
	String genero = JOptionPane.showInputDialog(null, "Genero:", "Nuevo alumno", JOptionPane.QUESTION_MESSAGE);
	int edad = 0;
	try {
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad:", "Nuevo alumno", JOptionPane.QUESTION_MESSAGE));
            }
	catch (NumberFormatException e) {
	JOptionPane.showMessageDialog(null, "Solo se admite introducir numeros para la edad\nNo se ha registrado el valor introducido", "Error", JOptionPane.WARNING_MESSAGE);
        }
	alumnos nuevoalumno = new alumnos(grado, nombre, apellidos, edad, genero);
            return alumnos.add(nuevoalumno);
	}

    public void mostraralumnos() {
        if (alumnos.isEmpty())
            JOptionPane.showMessageDialog(null, "No hay alumnos registrados", "Mostrar alumnos",
            JOptionPane.WARNING_MESSAGE);
        else {
            for (alumnos l: alumnos)
                l.mostrar();
            }
	}
}
