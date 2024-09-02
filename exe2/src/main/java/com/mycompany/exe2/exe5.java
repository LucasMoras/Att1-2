package com.mycompany.exe2;

public class exe5 {

    private String palavra;

    public exe5() {
    }
    

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public void Contar() {
        System.out.println(getPalavra().length());
    }

}
