/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string1;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class String1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva uma frase:");
        String s1 = scanner.next();
        System.out.println("Escreva outra frase:");
        String s2 = scanner.next();
        
        if(s1.length()== s2.length()){
            System.out.println("As frases possuem a mesma quantidade de caracteres.");
        } else {
            System.out.println("A primeira frase possui " + s1.length() + " caracteres.");
            System.out.println("A segunda frase possui " + s2.length() + " caracteres.");
        }
        
    }
    
}
