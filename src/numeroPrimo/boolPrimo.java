/*
 * Programa en Java que dado un número entero positivo determina si es número
 * primo o no.
 */
package numeroPrimo;

import java.util.Scanner;

/**
 *
 * @author Enrique A. Martínez Agudelo
 */
public class boolPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variable 'noErr' para usar en ciclo si existe error al
        // digitar valores erroneos. 'noErr' toma valor true.
        boolean noErr = true;
        // Declaración de ciclo 'while' el cual se ejecutará mientras se digiten
        // caracteres no permitidos por el objeto 'Scanner'.
        while (noErr) {
            // Instrucción captura errores.
            try {
                // Declaración objeto Scanner().
                Scanner num = new Scanner(System.in);
                // Mensaje pidiendo que digite un número primo.
                System.out.println("Digite entero primo positivo");
                // Llamada al metodo numPri(). Pasando como argumento la captura
                // del valor pedido.
                numPri(num.nextInt());
                // 'noErr' cambia de valor a false.
                noErr = false;
            } catch (Exception e) {
                // Mensaje informando de error de digitación.
                System.out.println("Valor distinto a entero positivo. Error: "
                        +e.toString());
            }
        }
    }
    
    /**
     * numPri() evalua si un valor dado representa a un número primo o no. Para
     * este fin numPri() divide este valor con el conjunto de valores menores al
     * dado excluyebdo a valores negativos, cero, uno y el mismo valor de
     * referencia. Ya que los números primos considerados son aquellos enteros
     * positivos que son divisibles por sí mismos y por el valor 1. Siendo el
     * valor 1 excluido de tal conjunto por convenciones matemáticas
     * internacionales.
     * @param nextInt Valor a evaluar como primo o no.
     */
    private static void numPri(int nextInt) {
        // Evalua que 'nextInt' no sea menor o igual a 1.
        if(nextInt <= 1) {
            // Advierte que el valor ingresado no es evaluable por estar fuera
            // del rango
            System.out.println(nextInt
                    +" no representa a conjunto de números validos.");
        }
        else {
            // Declaración de variable 'primo', usada al momento de definicione
            // del ciclo 'for'. 'primo' toma valor true.
            boolean primo = true;
            // Declaración del ciclo 'for', con una variable llamada 'aux'
            // inicializada cn un valor menor al de 'nextInt'.
            for(int aux = (nextInt - 1); primo && aux > 1 ;aux--) {
                // Evalua si el modulo entre 'nextInt' y 'aux' es cero. de
                // llegar a serlo 'primo' cambia de valor a false.
                if(nextInt % aux == 0) {
                    primo = false;
                }
            }
            // Evalua el valor 'primo' si es true muestra el 1er mensaje, sino
            // muestra el segundo mensaje.
            if(primo) {
                // Muestra el valor de 'nextInt' y el mensaje:
                // 'es es un numero primo.'
                System.out.println(nextInt+" es un numero primo.");
            }
            else {
                // Muestra el valor de 'nextInt' y el mensaje:
                // 'no es es un numero primo.'
                System.out.println(nextInt+" no es un numero primo.");
            }
        }
    }
    
}
