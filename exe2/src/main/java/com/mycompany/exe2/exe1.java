package com.mycompany.exe2;

import java.util.Scanner;

public class exe1 {

    public String palavra;

    public exe1() {    
    }
    
    public String getPalavra() {
        return palavra;
    }
    
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
 
     public void imprimirQL() {
        int QL = palavra.length();
        System.out.println("A palavra digitada possui " + QL + " letras.");
    }

     public  String criarP() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String entrada = scanner.nextLine();
        return entrada;
    }
}

    