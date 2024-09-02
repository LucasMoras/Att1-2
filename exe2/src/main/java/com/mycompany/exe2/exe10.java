package com.mycompany.exe2;

public class exe10 {

    private String palavra;

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public void contarVogaisEConsoantes() {
        if (palavra == null || palavra.isEmpty()) {
            System.out.println("A palavra está vazia.");
            return;
        }

        int contadorVogais = 0;
        int contadorConsoantes = 0;
        String palavraLowerCase = palavra.toLowerCase();

        for (char c : palavraLowerCase.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    contadorVogais++;
                } else {
                    contadorConsoantes++;
                }
            }
        }

        System.out.println("Número de vogais: " + contadorVogais);
        System.out.println("Número de consoantes: " + contadorConsoantes);
    }
}
