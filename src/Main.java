
import java.util.Scanner;
/**
 * Programa para lanzar un dado entre 6 y 12 caras.
 * @author Juan Alberto Díaz Socías
 */
public class Main {

  public static void main(String[] args) {

    Dado dado = new Dado(0, ' ');
    int contador = 0;
    int contadorLetra = 0;
    char letraAcumulada;

    dado.crearDado();

    System.out.println("Resultado es: " + dado.tirarDado());
    Scanner leer = new Scanner(System.in);
    String lectura = leer.nextLine();

    do {
      System.out.println("Enter para volver a lanzar el dado");

      lectura = leer.nextLine();
      letraAcumulada = dado.ultimaLetra();
      dado.tirarDado();
      if (lectura.length() == 0) {

        System.out.println("Resultado es: " + letraAcumulada);
        contador++;

      } else {
        char resultado;
        resultado = letraAcumulada;
        contador++;
       

        if (lectura.equals(String.valueOf(resultado))) {
          System.out.println("Es el mismo resultado");
        } else {
          System.out.println("Ha resultado "+ letraAcumulada+" Has fallado")
                  ;
        }
        
        do {
          contadorLetra++;
        } while (resultado == letraAcumulada && contadorLetra == 2);
        System.exit(0);

      }
    } while (contador < 20 != lectura.equals(String.valueOf(letraAcumulada == 'A')));
    System.out.println("Juan Alberto Díaz Socias");
  }

}
