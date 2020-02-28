package identificador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Identificador {

    public static void main(String[] args) throws IOException {
//        Frame fr = new Frame();
//        fr.setVisible(true);
        Scanner entrada = new Scanner(System.in);
        Procesamiento prs=new Procesamiento();
        String nombreArchivo;
        System.out.println("ingresa el nombre del archivo>_");
        nombreArchivo = entrada.next();
        //paso 1 verificar que el archivo existe
        // mandamo llmar a un método del tipo boolean existeArchivo()
        Procesamiento.existeArchivo(nombreArchivo);
        //paso 2 crear un Array List
        ArrayList<Character> arregloTokens = new ArrayList<>();
        ArrayList<String> ensamblado = new ArrayList<>();
        //paso 2  creo un método que lea arreglos de tokens
        Procesamiento.leerArreglo(arregloTokens, nombreArchivo);

    }
}
