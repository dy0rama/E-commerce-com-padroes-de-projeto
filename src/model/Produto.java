package model;

import java.text.NumberFormat;
import java.util.Locale;

public final class Produto implements Comparable<Produto> {
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    private String formatarPreco(double valor) {
        NumberFormat formatador = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        return formatador.format(valor);
    }

    @Override
    public int compareTo(Produto o) {
        return Double.compare(o.preco, this.preco);
    }

    @Override
    public String toString() {
        return String.format("""
                Nome: %s
                Preço: %s
                """, nome, formatarPreco(preco));
    }
}
