
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Juan Alberto Díaz Socías
 */
public class Dado {

  int numCaras;
  static char ultimaLetra;

  public Dado(int numCaras, char ultimaLetra) {

    this.numCaras = numCaras;
    Dado.ultimaLetra = ultimaLetra;
  }

  public int crearDado() {
    Scanner leer = new Scanner(System.in);
    int numero;
    System.out.println("Caras del dado entre 6 y 12 caras");
    numero = leer.nextInt();
    this.numCaras = numero;
    if (this.numCaras >= 6 && this.numCaras <= 12) {
      numero = numCaras;

    } else {
      System.err.println("Introduce un numero entre 6 y 12");
    }
    return numero;

  }

  public char tirarDado() {
    Random r = new Random();
    String letras = "ABCDEFGHIJKL";
    int numero;
    int aleatorio;

    aleatorio = r.nextInt(numCaras);

    ultimaLetra = letras.charAt(aleatorio);
    return ultimaLetra;
  }

  public char ultimaLetra() {

    return ultimaLetra;
  }
}
