import java.text.DecimalFormat;
import java.util.Scanner;

public class regradetres {

        public static void main(String[] args) {
            // variaveis
            double x,y,valor;
            // objetos para capturar dados
            Scanner teclado = new Scanner(System.in);
            DecimalFormat formatador = new DecimalFormat("#0.00");
            // entrada
            System.out.println("Regra de 3");
            System.out.println("x% de y = valor");
            System.out.println("Digite o valor de x: ");
            x = teclado.nextDouble();
            System.out.println("Digite o valor de y: ");
            y = teclado.nextDouble();
            //processamento
            valor = (x * y) / 100;
            //saida
            System.out.println(x + "% de " + y + " = " + formatador.format(valor));
            teclado.close();
        }
    }


