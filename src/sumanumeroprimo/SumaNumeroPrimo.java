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

    public static void main(String[] args) {

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Numero"));

        int divisor = 2;
        int suma = 0;
        while (divisor < numero) {
            while (numero % divisor != 0) {
                divisor++;
                suma = suma + numero;
            }

        }

        if (numero != 0) {
            System.out.println("Suma" + suma);
        }

    }
}
