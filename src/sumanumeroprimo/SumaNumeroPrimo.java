/*
22. Leer una secuencia de 30 números y mostrar la suma de los primos.
 */
package sumanumeroprimo;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class SumaNumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static boolean numeroPrimo(int numero) {
        boolean encontrado = false;
        int divisor = 2;
        while (divisor < numero) {
            while (numero % divisor != 0) {
                divisor++;
            }
            if (numero == divisor) {
                encontrado = true;
            } else {
                encontrado = false;
            }

        }
        return (encontrado);
    }

    public static void main(String[] args) {

        int numero;
        int a;
        int sumando = 0;
        int primo = 0;
        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
            SumaNumeroPrimo sumaNumeroPrimo = new SumaNumeroPrimo();
            sumaNumeroPrimo.numeroPrimo(numero);

            if (sumaNumeroPrimo.numeroPrimo(numero) == true) {
                sumando = sumando + numero;
                System.out.println("Valor de Suma " + sumando);
            } else {
                System.out.println("Numero NO primo");
            }
        } while (primo < 5);

    }
}
