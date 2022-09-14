package datos.colegio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class gestorcatedraticos {
    private ArrayList<catedraticos> catedraticos;
	
    public gestorcatedraticos() {
        catedraticos = new ArrayList<catedraticos>();
    }
    public boolean nuevocatedraticos() {
        String materia = JOptionPane.showInputDialog(null, "Introduzca materia:", "Nuevo catedratico", JOptionPane.QUESTION_MESSAGE);
	String nombre = JOptionPane.showInputDialog(null, "Nombre:", "Nuevo catedratico", JOptionPane.QUESTION_MESSAGE);
	String apellidos = JOptionPane.showInputDialog(null, "Apellidos:", "Nuevo catedratico", JOptionPane.QUESTION_MESSAGE);
	String genero = JOptionPane.showInputDialog(null, "Genero:", "Nuevo catedratico", JOptionPane.QUESTION_MESSAGE);
	int edad = 0;
	try {
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad:", "Nuevo catedratico", JOptionPane.QUESTION_MESSAGE));
            }
	catch (NumberFormatException e) {
	JOptionPane.showMessageDialog(null, "Solo se admite introducir numeros para la edad\nNo se ha registrado el valor introducido", "Error", JOptionPane.WARNING_MESSAGE);
        }
	catedraticos nuevocatedratico = new catedraticos(materia, nombre, apellidos, edad, genero);
            return catedraticos.add(nuevocatedratico);
	}

    public void mostrarcatedraticos() {
        if (catedraticos.isEmpty())
            JOptionPane.showMessageDialog(null, "No hay catedraticos registrados", "Mostrar catedraticos",
            JOptionPane.WARNING_MESSAGE);
        else {
            for (catedraticos c: catedraticos)
                c.mostrar();
            }
	}
}
