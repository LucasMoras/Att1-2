package com.mycompany.exe2;

public class exe6 {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void capitalizar() {

        System.out.println(capitalizarNome(getNome()));
    }
    private String capitalizarNome(String nome) {

        String[] palavras = nome.split(" ");
        StringBuilder nomeFormatado = new StringBuilder();

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {

                String palavraFormatada = Character.toUpperCase(palavra.charAt(0)) + palavra.substring(1).toLowerCase();
                nomeFormatado.append(palavraFormatada).append(" ");
            }
        }
        return nomeFormatado.toString().trim();
    }
}
