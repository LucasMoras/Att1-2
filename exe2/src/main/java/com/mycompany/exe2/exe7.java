package com.mycompany.exe2;

public class exe7 {

    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String extrairDominio() {

        if (endereco != null && endereco.contains("@")) {

            return endereco.split("@")[1];
        }
        return null;
    }
}
