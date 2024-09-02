package com.mycompany.exe2;

public class exe8 {
     private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String mascararNumero() {
      
        if (numero == null || numero.length() <= 4) {

        }

        String asteriscos = "*".repeat(numero.length() - 4);
        String ultimosDigitos = numero.substring(numero.length() - 4);

        return asteriscos + ultimosDigitos;
    }
}
