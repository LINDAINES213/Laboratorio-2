public class Controlador {

    public static void main (String[] args){

        Vista vista = new Vista();
        Archivo archivo = new Archivo();

        int opcion = 0;
        int opcionp = 0;

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

            } else if (opcion == 7){

                opcionp = vista.menuProgramas();

                if (opcionp == 1){

                    archivo.aWord();
                    
                } else if (opcionp == 2){


                } else if (opcionp == 3){


                }

            } else if (opcion == 8){
                
                vista.Salir();

            }
        }

    }
    
}
