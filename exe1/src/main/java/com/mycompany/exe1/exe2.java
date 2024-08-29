
package com.mycompany.exe1;

import java.util.Scanner;

public class exe2 {
    
     public static void Saudacao() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        
        String nome = scanner.nextLine();

        String mensagem = "Olá, " + nome + "! Bem-vindo ao programa.";

        System.out.println(mensagem);

    }
}
