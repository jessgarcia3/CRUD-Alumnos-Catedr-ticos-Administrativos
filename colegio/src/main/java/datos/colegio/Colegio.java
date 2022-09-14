package datos.colegio;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;

public final class Colegio {
    static String pedir;
    static Scanner scanner = new Scanner(System.in);
    static int select = -1;
    
    static gestoradministrativos administrativos = new gestoradministrativos();
    static gestoralumnos alumnos = new gestoralumnos();
    static gestorcatedraticos catedraticos = new gestorcatedraticos();
    
    public static void main(String[] args) {
        
        while(select != 0){
            try{
                String lectura = JOptionPane.showInputDialog(null,"***********************\nElige opción:\n" + 
                                                "\n1.- administrativos\n" +
						"\n2.- alumnos\n" +
						"\n3.- catedraticos\n" +
                                                "\n4.- mostrar administrativos\n"+
                                                "\n5.- mostrar alumnos\n"+
                                                "\n6.- mostrar catedraticos\n"+
						"\n0.- Salir\n************************");
				select = Integer.parseInt(lectura); 

				switch(select){
				case 1: 
					administrativos.nuevoadministrativos();

					break;
				case 2: 
					alumnos.nuevoalumnos();
					
					break;
				case 3: 
					catedraticos.nuevocatedraticos();
                                        
					break;
                                case 4:
                                        administrativos.mostraradministrativos();
                                        
                                        break;
                                case 5:
                                        alumnos.mostraralumnos();
                                        
                                        break;
                                case 6:
                                        catedraticos.mostrarcatedraticos();
                                        
                                        break;
				case 0: 
					JOptionPane.showMessageDialog(null,"Saliendo");
					break;
				default:
					JOptionPane.showMessageDialog(null,"Número no reconocido");break;
				}
		
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Error");
			}
            }
        }
    }

