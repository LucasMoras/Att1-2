package com.mycompany.exe2;

public class exe3 {

    private String palavra;

    public exe3() {

    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
    public void Inverter(){
        System.out.println(new StringBuilder(getPalavra()).reverse().toString());
    }
}
