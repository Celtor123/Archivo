
package archivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    File a= new File("archivo.txt");
    public void crear(){
        if(a.exists()){
            System.out.println("Ya existe");
        }
        else{
        try{
        if (a.createNewFile()){
    System.out.println("El fichero se ha creado correctamente");}
        else{
    System.out.println("No ha podido ser creado el fichero");
      }}
        catch (IOException ioe) {
    System.out.println(ioe);}
    }}
public void leer(String archivo)throws FileNotFoundException, IOException{
    
      String cadena;
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
      while((cadena = b.readLine())!=null) {
          System.out.println(cadena);
      }
      b.close();
}
public void escribir() throws IOException{
    String ruta = "archivo.txt";
File archivo = new File(ruta);
BufferedWriter bw;
if(archivo.exists()) {
     bw = new BufferedWriter(new FileWriter(archivo));
      bw.write("El fichero de texto ya estaba creado.");
} else {
      bw = new BufferedWriter(new FileWriter(archivo));
      bw.write("Acabo de crear el fichero de texto.");
}bw.close();
}

    public static void main(String[] args) throws IOException {
       Archivo p= new Archivo();
       p.crear();
       p.leer("archivo.txt");
       p.escribir();
    }
    
}
