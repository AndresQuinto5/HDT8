import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class LeerArchivo {
    public static Vector mostrarContenido(String archivo) {
        Vector parrafo = new Vector(20,5);
        try{
        String linea;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((linea = b.readLine())!=null) {
            parrafo.addElement(linea);
        }
        b.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        return parrafo;
    }

}
