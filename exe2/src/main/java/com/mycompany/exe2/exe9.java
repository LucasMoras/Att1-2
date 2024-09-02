package com.mycompany.exe2;

public class exe9 {
    
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String removerEspacosExtras() {
        if (texto == null) {
            return null; 
        }
        return texto.trim().replaceAll("\\s+", " ");
    }
}
