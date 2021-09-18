import java.util.Scanner;

public class Vista {

    Scanner sn = new Scanner(System.in);
    Archivo archivo = new Archivo();
    
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

    public void nuevaRAM(){
        archivo.archivoE();
        archivo.archivoP();
    }

    public void datosRAM(){
        System.out.println("Tamaño RAM: 16GB, 256 bloques en total");
        return;
    }

    public void programas(){

        archivo.Programas();
    }

    public void programasC(){

        archivo.ProgramaC();
    }

    public void programasE(){

        archivo.ProgramasE();
    }
    
    public void Salir(){
        System.out.println("Fin del programa");
    }
}