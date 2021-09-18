/**
 * Esta clase es el controlador del programa.
 * @author: Linda Ines Jimenez Vides
 * @version: 17 - septiembre - 2021
 */
public class Controlador {

    public static void main (String[] args){

        //Creacion de objeto tipo vista
        Vista vista = new Vista();
        //Creacion de objeto tipo archivo
        Archivo archivo = new Archivo();

        int opcion = 0;
        int opcionp = 0;

        // If del menu impreso desde la clase vista donde se colocan los metodos para llamar a otroa previamente programados para que funcione el programa completo
        while(opcion != 8){

            opcion = vista.menu();

            if (opcion == 1){

                vista.nuevaRAM();

            } else if (opcion == 2){

                vista.datosRAM();

            } else if (opcion == 3){

                vista.programas();

            } else if (opcion == 4){

                vista.programasE();

            } else if (opcion == 5){

                vista.programasC();

            } else if (opcion == 6){

                vista.programasE();

            } else if (opcion == 7){

                opcionp = vista.menuProgramas();

                if (opcionp == 1){

                    archivo.aGoogle();
                    
                } else if (opcionp == 2){

                    archivo.aFire();

                } else if (opcionp == 3){

                    archivo.aWhats();

                } else if (opcionp == 4){

                    archivo.aTel();

                } else if (opcionp == 5){

                    archivo.aVS();

                } else if (opcionp == 6){

                    archivo.aMail();

                } else if (opcionp == 7){

                    archivo.aWord();
                }

            } else if (opcion == 8){
                
                vista.Salir();

            }
        }

    }
    
}
