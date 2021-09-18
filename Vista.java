/**
 * Esta clase es la vista del programa, donde imprime toda la informacion requerida
 * @author: Linda Ines Jimenez Vides
 * @version: 17 - septiembre - 2021
 */
import java.util.Scanner;

public class Vista {

    //Creacion de contructor de la clase scanner
    Scanner sn = new Scanner(System.in);
    //Creacion de objeto tipo archivo
    Archivo archivo = new Archivo();
    
    //Vista del menu principal
    public int menu(){

            int opcion;
    
            String menu = "\n¿Que opcion desea ejecutar?\n" +
                                "1. Nueva RAM\n" +
                                "2. Datos de RAM\n" +
                                "3. Ver Programas Instalados\n" +
                                "4. Programas en Ejecucion\n" +
                                "5. Programas en Cola\n" +
                                "6. Ver Programas en bloques\n" +
                                "7. Ejecutar un nuevo programa\n" +
                                "8. Salir\n";
    
            System.out.println(menu);
            opcion =  sn.nextInt();
    
            return opcion;
    }

    //Vista del menu secundario
    public int menuProgramas(){
        int opcionp;
    
            String menu = "\n¿Que programa desea ejecutar?\n" +
                                "1. GOOGLE CHROME,2070,8\n" +
                                "2. FIREFOX,64,16\n" +
                                "3. WHATSAPP,128,8\n" +
                                "4. TELEGRAM,128,8\n" +
                                "5. VISUAL STUDIO,320,60\n" +
                                "6. MAIL,32,15\n" +
                                "7. WORD,1024,10\n";
    
            System.out.println(menu);
            opcionp =  sn.nextInt();
    
            return opcionp;
    }

    /**
     * Metodo que permite crear los archivos cuando se crea una nueva memoria ram
     */
    public void nuevaRAM(){
        archivo.archivoE();
        archivo.archivoP();
    }

    /**
     * Metodo que imprime los datos de la memoria ram
     */
    public void datosRAM(){
        System.out.println("Tamaño RAM: 16GB, 256 bloques en total");
        return;
    }

    /**
     * Metodo que imprime la lista de todos los programas de la computadora
     */
    public void programas(){

        archivo.Programas();
    }

    /**
     * Metodo que imprime la lista de los programas en cola
     */
    public void programasC(){

        archivo.ProgramaC();
    }

    /**
     * Metodo que imprime los programas en ejecucion
     */
    public void programasE(){

        archivo.ProgramasE();
    }
    
    //Impresion mensaje final
    public void Salir(){
        System.out.println("Fin del programa");
    }
}