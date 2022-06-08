/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ENTRADA DE DADOS //
        Scanner teclado = new Scanner(System.in);               
        // SAIDA DE DADOS //
        String nome = teclado.nextLine(); // LER LETRAS E PALAVRAS
        System.out.println("Digite o nome do Aluno: ");
        float nota = teclado.nextFloat(); // LER NUMEROS REAIS
        System.out.println("Digite a nota do Aluno: ");
        
        System.out.println("A nota é " + nota);
        System.out.printf("A nota de %s é %.1f \n", nome, nota);        
        ////////////////////////////////////////////////////////////
        
        
        
        
    }
    
}
