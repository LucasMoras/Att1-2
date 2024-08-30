
package com.mycompany.exe1;

public class exe4 {
   
    public String frase;

    public exe4(String frase) { 
        this.frase = frase;
    };

    public int obterTamanho() {
        return frase.length();
    }

    public String converterParaMaiusculas() {
        return frase.toUpperCase();
    }

    public String converterParaMinusculas() {
        return frase.toLowerCase();
    }

    public String extrairSubstring() {

        return frase.substring(11, 28);
    }

    public void imprimirResultados() {
        System.out.println("Tamanho da frase: " + obterTamanho());
        System.out.println("Frase em maiúsculas: " + converterParaMaiusculas());
        System.out.println("Frase em minúsculas: " + converterParaMinusculas());
        System.out.println("Substring extraída: " + extrairSubstring());
    } 
}
