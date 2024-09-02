package com.mycompany.exe2;

public class exe4 {

    private String palavra;
    private String palavraInvertida;

    public exe4() {
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

     public String getPalavraInvertida() {
        return palavraInvertida;
    }

    public void setPalavraInvertida(String palavraInvertida) {
        this.palavraInvertida = palavraInvertida;
    }

    public void Inverter() {
        this.palavraInvertida = new StringBuilder(getPalavra()).reverse().toString();
        
    }

    public void Verificar() {
        if (getPalavra().equalsIgnoreCase(getPalavraInvertida())) {
            System.out.println("E um palindromo");
        } else {
            System.out.println("Nao e um palindromo");
        }
    }
}

   
