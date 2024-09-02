package com.mycompany.exe2;

public class exe2 {
    private String entrada;
     
            
    public exe2() {
        
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }
    public void Substituir(){
        System.out.println( getEntrada().replace('a','*'));
    }
}
