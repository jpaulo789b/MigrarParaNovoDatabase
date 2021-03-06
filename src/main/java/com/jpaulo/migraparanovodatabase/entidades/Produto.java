/**
 * This file was generated by the Jeddict
 */
package com.jpaulo.migraparanovodatabase.entidades;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author aluno
 */
@Entity
public class Produto {

    @Id
    private Integer CodigoDoProduto;

    @Basic
    private String nomeDoProduto;

    @Basic
    private String produtosCodigoDaCategoria;

    @Basic
    private Float PrecoUnitario;

    @Basic
    private int unidadesEmEstoque;

    @Basic
    private int unidadesPedidas;

    @Basic
    private Integer nivelDeReposicao;

    @Basic
    private char descontinuado;

    @Basic
    private String quantidadePorUnidade;

    @OneToOne(targetEntity = Fornecedor.class)
    @JoinColumn(name = "CodigoDoFornecedor")
    private Fornecedor CodigoDoFornecedor;

    @OneToOne(targetEntity = Categoria.class)
    @JoinColumn(name = "CodigoDaCategoria")
    private Categoria CodigoDaCategoria;

    public Integer getCodigoDoProduto() {
        return this.CodigoDoProduto;
    }

    public void setCodigoDoProduto(Integer CodigoDoProduto) {
        this.CodigoDoProduto = CodigoDoProduto;
    }

    public String getNomeDoProduto() {
        return this.nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getProdutosCodigoDaCategoria() {
        return this.produtosCodigoDaCategoria;
    }

    public void setProdutosCodigoDaCategoria(String produtosCodigoDaCategoria) {
        this.produtosCodigoDaCategoria = produtosCodigoDaCategoria;
    }

    public Float getPrecoUnitario() {
        return this.PrecoUnitario;
    }

    public void setPrecoUnitario(Float PrecoUnitario) {
        this.PrecoUnitario = PrecoUnitario;
    }

    public int getUnidadesEmEstoque() {
        return this.unidadesEmEstoque;
    }

    public void setUnidadesEmEstoque(int unidadesEmEstoque) {
        this.unidadesEmEstoque = unidadesEmEstoque;
    }

    public int getUnidadesPedidas() {
        return this.unidadesPedidas;
    }

    public void setUnidadesPedidas(int unidadesPedidas) {
        this.unidadesPedidas = unidadesPedidas;
    }

    public Integer getNivelDeReposicao() {
        return this.nivelDeReposicao;
    }

    public void setNivelDeReposicao(Integer nivelDeReposicao) {
        this.nivelDeReposicao = nivelDeReposicao;
    }

    public char getDescontinuado() {
        return this.descontinuado;
    }

    public void setDescontinuado(char descontinuado) {
        this.descontinuado = descontinuado;
    }

    public String getQuantidadePorUnidade() {
        return this.quantidadePorUnidade;
    }

    public void setQuantidadePorUnidade(String quantidadePorUnidade) {
        this.quantidadePorUnidade = quantidadePorUnidade;
    }

    public Fornecedor getCodigoDoFornecedor() {
        return this.CodigoDoFornecedor;
    }

    public void setCodigoDoFornecedor(Fornecedor CodigoDoFornecedor) {
        this.CodigoDoFornecedor = CodigoDoFornecedor;
    }

    public Categoria getCodigoDaCategoria() {
        return this.CodigoDaCategoria;
    }

    public void setCodigoDaCategoria(Categoria CodigoDaCategoria) {
        this.CodigoDaCategoria = CodigoDaCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.CodigoDoProduto);
        hash = 17 * hash + Objects.hashCode(this.nomeDoProduto);
        hash = 17 * hash + Objects.hashCode(this.produtosCodigoDaCategoria);
        hash = 17 * hash + Objects.hashCode(this.PrecoUnitario);
        hash = 17 * hash + this.unidadesEmEstoque;
        hash = 17 * hash + this.unidadesPedidas;
        hash = 17 * hash + Objects.hashCode(this.nivelDeReposicao);
        hash = 17 * hash + this.descontinuado;
        hash = 17 * hash + Objects.hashCode(this.quantidadePorUnidade);
        hash = 17 * hash + Objects.hashCode(this.CodigoDoFornecedor);
        hash = 17 * hash + Objects.hashCode(this.CodigoDaCategoria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.unidadesEmEstoque != other.unidadesEmEstoque) {
            return false;
        }
        if (this.unidadesPedidas != other.unidadesPedidas) {
            return false;
        }
        if (this.descontinuado != other.descontinuado) {
            return false;
        }
        if (!Objects.equals(this.nomeDoProduto, other.nomeDoProduto)) {
            return false;
        }
        if (!Objects.equals(this.produtosCodigoDaCategoria, other.produtosCodigoDaCategoria)) {
            return false;
        }
        if (!Objects.equals(this.quantidadePorUnidade, other.quantidadePorUnidade)) {
            return false;
        }
        if (!Objects.equals(this.CodigoDoProduto, other.CodigoDoProduto)) {
            return false;
        }
        if (!Objects.equals(this.PrecoUnitario, other.PrecoUnitario)) {
            return false;
        }
        if (!Objects.equals(this.nivelDeReposicao, other.nivelDeReposicao)) {
            return false;
        }
        if (!Objects.equals(this.CodigoDoFornecedor, other.CodigoDoFornecedor)) {
            return false;
        }
        if (!Objects.equals(this.CodigoDaCategoria, other.CodigoDaCategoria)) {
            return false;
        }
        return true;
    }

}
