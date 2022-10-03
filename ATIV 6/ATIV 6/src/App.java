import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o raio de círculo: ");
        double raio = sc.nextDouble();

        sc.close();

        // requisito 2: calcule a area de um circulo
        // =PI() * POTÊNCIA(C3;2)
        double area = Math.PI * Math.pow(raio, 2);

        // requisito 3: imprimir a área do circulo
        System.out.println("A área do circulo é" + area);

    }

}