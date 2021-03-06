/**
 * Esta clase es donde secrean los archivos a almacenar los arreglos del programa.
 * @author: Linda Ines Jimenez Vides
 * @version: 17 - septiembre - 2021
 */
import java.util.Arrays;
import java.io.File;
import java.lang.String;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Archivo {

    //Creacion de objeto tipo scanner
    Scanner sn = new Scanner(System.in);

    //Creacion de archivos de texto
    File programa = new File("Programas.txt");
    File ejecucion = new File("ProgramasE.txt");

    //Creacion de arreglos donde se encuentran los programas de la computadora
    String[] ProgramasT = new String[256];
    String[] Programas = new String[]{"GOOGLE CHROME,2070,8", " - FIREFOX,64,16", " - ZOOM,320,60", " - WHATSAPP,128,8", " - TELEGRAM,128,8", " - VISUAL STUDIO,320,60", " - MAIL,32,15", " - CONTACTOS,32,8", " - WORD,1024,10", " - TEAMS,1024,10", " - DISCORD,1024,10"};
    String[] ProgramasC = new String[8];
    
    /**
     * Metodo agrega los programas con que se inicia la memoria ram
     * @return ProgramasT
     */
    public void ProgramasE(){
        try {
            ProgramasT[0] = "ZOOM,320,60";
            ProgramasT[1] = "DISCORD,320,60";
            ProgramasT[2] = "TEAMS,320,60";
            System.out.println("Programas en ejecucion: " +Arrays.toString(ProgramasT));
            return;
        } catch (Exception e) {
            System.out.println("Ocurrio un error al crear el archivo");
        }
    }

    /**
     * Metodo que agrega los programas en cola a una lista
     * @return ProgramasC
     */
    public void ProgramaC(){
        try{
            ProgramasC[0] = "GOOGLE CHROME,2070,8";
            ProgramasC[1] = "FIREFOX,64,16";
            ProgramasC[2] = "WHATSAPP,128,8";
            ProgramasC[3] = "TELEGRAM,128,8";
            ProgramasC[4] = "VISUAL STUDIO,320,60";
            ProgramasC[5] = "MAIL,32,15";
            ProgramasC[6] = "CONTACTOS,32,8";
            ProgramasC[7] = "WORD,1024,10";
            System.out.println("Programas en Cola: " +Arrays.toString(ProgramasC));
            return;
        } catch (Exception e){
            System.out.println("Error en actualizar lista");
        }
    }

    /**
     * Metodo que imprime la lista de tosos los programas de la omputadora.
     * @return Programas
     */
    public void Programas(){
        System.out.println("Lista de Programas Instalados: " +Arrays.toString(Programas));
            return;
    }

    /**
     * Metodo que crea el archivo para los programas en ejeucion
     */
    public void archivoE(){
        try {
            // Si el archivo no existe es creado
            if (!ejecucion.exists()) {
                ejecucion.createNewFile();
            }
            FileOutputStream fo = new FileOutputStream(ejecucion);
            ObjectOutputStream os = new ObjectOutputStream(fo);
            os.writeObject(ProgramasT);
            os.close();
        } catch (Exception e) {
            System.out.println("Ocurrio un error al crear el archivo");
        }
    }

    /**
     * Metodo que crea el archivo con los programas de la computadora
     */
    public void archivoP(){
        try {
            // Si el archivo no existe es creado
            if (!programa.exists()) {
                programa.createNewFile();
            }
            FileOutputStream fo2 = new FileOutputStream(programa);
            ObjectOutputStream os2 = new ObjectOutputStream(fo2);
            os2.writeObject(Programas);
            os2.close();
        } catch (Exception e) {
            System.out.println("Ocurrio un error al crear el archivo");
        }
    }

    /**
     * Metodo que lee e imprime el cntenido del archivo de programas
     */
    public void leerProgramas(){
        try{
            String leer;
            FileReader fr = new FileReader(programa);
            BufferedReader bf = new BufferedReader(fr);
            leer = bf.readLine();
            System.out.println("Programas Instalados en la Computadora:\n" +leer);
            fr.close();
        } catch (Exception e) {
            System.out.println("Ocurrio un error al leer el archivo");
        }
    }

    /**
     * Metodo que lee e imprime el archivo de programas en ejecucion
     */
    public void leerProgramaE(){
        try{  
            String leerA; 
            FileReader fr2 = new FileReader(ejecucion);
            BufferedReader bf2 = new BufferedReader(fr2);
            leerA = bf2.readLine();
            System.out.println("Programas en ejecucion" +leerA);
            fr2.close();
        } catch (Exception e) {
            System.out.println("Ocurrio un error al leer el archivo");
        }
    }

    /**
     * Metodo que agrega el programa Google Chrome a la lista de programas en ejecucion
     * @return ProgramasT
     */
    public void aGoogle(){
        ProgramasT[3] = "GOOGLE CHROME,2070,8";
        System.out.println("Programas en ejecucion: " +Arrays.toString(ProgramasT));
        return;
    }

    /**
     * Metodo que agrega el programa Firefox a la lista de programas en ejecucion
     * @return ProgramasT
     */
    public void aFire(){
        ProgramasT[4] = "FIREFOX,64,16";
        System.out.println("Programas en ejecucion: " +Arrays.toString(ProgramasT));
        return;
    }

    /**
     * Metodo que agrega el programa Whatsapp a la lista de programas en ejecucion
     * @return ProgramasT
     */
    public void aWhats(){
        ProgramasT[5] = "WHATSAPP,128,8";
        System.out.println("Programas en ejecucion: " +Arrays.toString(ProgramasT));
        return;
    }

    /**
     * Metodo que agrega el programa Telegram a la lista de programas en ejecucion
     * @return ProgramasT
     */
    public void aTel(){
        ProgramasT[6] = "TELEGRAM,128,8";
        System.out.println("Programas en ejecucion: " +Arrays.toString(ProgramasT));
        return;
    }

    /**
     * Metodo que agrega el programa Visual Studio a la lista de programas en ejecucion
     * @return ProgramasT
     */
    public void aVS(){
        ProgramasT[7] = "VISUAL STUDIO,320,60";
        System.out.println("Programas en ejecucion: " +Arrays.toString(ProgramasT));
        return;
    }

    /**
     * Metodo que agrega el programa Word a la lista de programas en ejecucion
     * @return ProgramasT
     */
    public void aWord(){
        ProgramasT[7] = "WORD,1024,10";
        System.out.println("Programas en ejecucion: " +Arrays.toString(ProgramasT));
        return;
    }

    /**
     * Metodo que agrega el programa Mail a la lista de programas en ejecucion
     * @return ProgramasT
     */
    public void aMail(){
        ProgramasT[8] = "MAIL,32,15";
        System.out.println("Programas en ejecucion: " +Arrays.toString(ProgramasT));
        return;
    }
}