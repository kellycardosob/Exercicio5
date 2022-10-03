import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

  System.out.println("Digite um valor em metros");
  double metros = entrada.nextFloat();

    double  centimetros = metros * 100;

  System.out.println("Esse valor em centimetros é "+ centimetros + " cm ");

    }
}
