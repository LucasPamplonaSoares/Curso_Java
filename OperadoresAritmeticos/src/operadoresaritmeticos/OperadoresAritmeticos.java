/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author lucas
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);*/
        
        /*int numero = 5;
        int valor = 5 + numero ++; POS INCREMENTO
        int valor = 5 + ++numero; PRE INCREMENTO
        numero ++; // ++ INCREMENTO NUMERO = NUMERO + 1
        System.out.println(numero);*/
        
        /*int x = 4;
        x += 2; // x = x + 2
        x *= 2;
        x /= 2;
        x -= 2;
        System.out.println(x);*/
        
        /*float v = 8.3f;
        int ar = (int) Math.floor(v); // ARREDONDA PARA BAIXO FLOOR
        int ar = (int) Math.ceil(v); ARREDONDA PARA CIMA
        int ar = (int) Math.round(v); ARREDONDA NORMAL
        System.out.println(ar);*/
        
        double ale = Math.random();
        int n = (int) (5 + ale * (10 - 5)); // GERA NUMEROS ENTRE 5 E 10
        System.out.println(n);
    }
    
}
