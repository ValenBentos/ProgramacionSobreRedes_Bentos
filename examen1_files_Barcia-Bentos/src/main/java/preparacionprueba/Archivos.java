

package preparacionprueba;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

/**

* ACA TODO LO QUE TENGA QUE VER CON LEER DATOS DE UN ARCHIVO, ESCRIBIR, BORRAR

* FUNCIONALIDAD DE ARREGLADO DE FORMATO, Y OJO!! ACA DEBE ESTAR LA

* DUNCIONALIDAD DE MOSTRAR LOS DATOS DEL ARCHIVO

*

* @author 

*/

public class Archivos {



public Archivos() {


}


public static void main(String[] args) {

// TODO Auto-generated method stub

crearYEscribirEnArchivoNuevo();

eliminarArchivo();

}


private static final Logger LOG = Logger.getLogger(Archivos.class.getName());

//static File error = null;


static PrintStream ps = new PrintStream( System.out );


/*

* LEEMOS JUEGOS.DAT

*/

public static String leer() {


String texto="";

try {


FileReader fr = new FileReader("juegos.dat");

BufferedReader br = new BufferedReader( fr );


String linea ="";


while( (linea = br.readLine() ) != null) {

texto += "\n" + linea;

}


br.close();


} catch (FileNotFoundException e) {

// TODO Auto-generated catch block

e.printStackTrace();

} catch (IOException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}


return texto;

}


public static void crearYEscribirEnArchivoNuevo() {



File archivo = new File("juegos.scv");

FileWriter fw;


try {

fw = new FileWriter( archivo , false );

PrintWriter pw = new PrintWriter(fw);



fw.flush();

pw.close();

fw.close();




} catch (IOException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

}



/**

*

*/

public static void eliminarArchivo() {

File rutaArchivo = new File("juegos.dat");


rutaArchivo.delete();
}}
