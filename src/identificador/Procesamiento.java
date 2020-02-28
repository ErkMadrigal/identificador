package identificador;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Procesamiento {

    public static void existeArchivo(String nombreArchivo) {
        boolean siExiste;
        File archivo = new File(nombreArchivo);
        siExiste = archivo.exists();
//		if(siExiste) {
//			System.out.println("El archivo existe");
//		}else {
//			System.out.println("Error no se encuentra el archivo");
//		}
        if (!siExiste) {
            System.out.println("Error no se encuentra el archivo");
        }
    }

    public static ArrayList<Character> leerArreglo(ArrayList<Character> arregloTokens, String nombreArchivo) throws IOException {
        //aqui va el código de procesamiento del archivo
        try (FileInputStream archivoEntrada = new FileInputStream(nombreArchivo)) {
            //aqui va el código de procesamiento del archivo
            int atChar;
            int indiceActual = 0;
//		while((atChar=archivoEntrada.read())!=-1) {
//			arregloTokens.add(indiceActual,(char)(atChar));
//                         
//			indiceActual++;
//		}
            while ((atChar = archivoEntrada.read()) != -1) {
                if (atChar != '\n' || atChar != '\t') {
                    arregloTokens.add(indiceActual, (char) (atChar));
                    indiceActual++;

                }
            }
            for (int i = 0; i < arregloTokens.size(); i++) {
                System.out.println(arregloTokens.get(i));
            }
        }
        return arregloTokens;
    }

}
