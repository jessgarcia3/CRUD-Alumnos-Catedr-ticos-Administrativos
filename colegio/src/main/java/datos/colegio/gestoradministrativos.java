package datos.colegio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class gestoradministrativos {
    private ArrayList<administrativos> administrativos;
	
    public gestoradministrativos() {
        administrativos = new ArrayList<administrativos>();
    }
    public boolean nuevoadministrativos() {
        String areadetrabajo = JOptionPane.showInputDialog(null, "Introduzca area de trabajo:", "Nuevo administrativo", JOptionPane.QUESTION_MESSAGE);
	String nombre = JOptionPane.showInputDialog(null, "Nombre:", "Nuevo administrativo", JOptionPane.QUESTION_MESSAGE);
	String apellidos = JOptionPane.showInputDialog(null, "Apellidos:", "Nuevo administrativo", JOptionPane.QUESTION_MESSAGE);
	String genero = JOptionPane.showInputDialog(null, "Genero:", "Nuevo administrativo", JOptionPane.QUESTION_MESSAGE);
	int edad = 0;
	try {
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad:", "Nuevo administrativo", JOptionPane.QUESTION_MESSAGE));
            }
	catch (NumberFormatException e) {
	JOptionPane.showMessageDialog(null, "Solo se admite introducir numeros para la edad\nNo se ha registrado el valor introducido", "Error", JOptionPane.WARNING_MESSAGE);
        }
	administrativos nuevoadministrativo = new administrativos(areadetrabajo, nombre, apellidos, edad, genero);
            return administrativos.add(nuevoadministrativo);
	}

    public void mostraradministrativos() {
        if (administrativos.isEmpty())
            JOptionPane.showMessageDialog(null, "No hay administrativos registrados", "Mostrar administrativos",
            JOptionPane.WARNING_MESSAGE);
        else {
            for (administrativos a: administrativos)
                a.mostrar();
            }
	}
}
