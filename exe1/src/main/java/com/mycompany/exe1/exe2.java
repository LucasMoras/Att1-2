
package com.mycompany.exe1;

import java.util.Scanner;

public class exe2 {
       
    private String nome;

    public exe2(String nome) {
        this.nome = nome;
    }
    public exe2() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Saudacao1() {
        String mensagem = "Olá, " + nome + "! Bem-vindo ao programa.";
        System.out.println(mensagem);
    }

    public static void Saudacao2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

    }
}
