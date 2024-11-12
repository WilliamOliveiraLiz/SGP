package Gerenciador;

import modelo.Produto;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos extends Produto {
    private List<Produto> produtos = new ArrayList<>();
    private Integer proximoID = 1;

    public GerenciadorProdutos(String nome, Double preco, String categoria) {
        super(nome, preco, categoria);
    }
    public void criar(Produto produto){
        validarProduto(produto);
        produto.setId(proximoID++);
        produtos.add(produto);
    }
    private void validarProduto(Produto produto) {
        if (produto.getNome()==null) {
            System.out.println("Não foi possivel registrar o cadastro, nome não informado!");
        }else if (produto.getPreco()==null) {
            System.out.println("Não foi possivel registrar o cadastro, preço não informado!\"");
        } else {

        }
    }
}
