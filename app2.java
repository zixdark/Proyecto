import java.io.*;

public class app2{

//instanciació d'una classe per llegir de consola
  private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

  public static void main (String args[]) throws IOException{
    int i = 0;
    char c;
    String entrada;

    System.out.print("Escriu un nombre sencer: ");
    entrada = stdin.readLine();
    i = Integer.parseInt(entrada);

    System.out.print("Escriu un caràcter: ");
    entrada = stdin.readLine();
    c = entrada.charAt(0);

    System.out.println("Has escrit el nombre: " + i);
    System.out.println("Has escrit el caràcter: " + c);

  }

}