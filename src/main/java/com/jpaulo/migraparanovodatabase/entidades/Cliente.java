/**
 * This file was generated by the Jeddict
 */
package com.jpaulo.migraparanovodatabase.entidades;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author aluno
 */
@Entity
public class Cliente {

    @Id
    private String CodigoDoCliente;

    @Basic
    private String NomeDaEmpresa;

    @Basic
    private String NomeDoContato;

    @Basic
    private String CargoDoContato;

    @Basic
    private String Cidade;

    @Basic
    private String Regiao;

    @Basic
    private String Cep;

    @Basic
    private String Pais;

    @Basic
    private String Telefone;

    @Basic
    private String Fax;

    public String getCodigoDoCliente() {
        return this.CodigoDoCliente;
    }

    public void setCodigoDoCliente(String CodigoDoCliente) {
        this.CodigoDoCliente = CodigoDoCliente;
    }

    public String getNomeDaEmpresa() {
        return this.NomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String NomeDaEmpresa) {
        this.NomeDaEmpresa = NomeDaEmpresa;
    }

    public String getNomeDoContato() {
        return this.NomeDoContato;
    }

    public void setNomeDoContato(String NomeDoContato) {
        this.NomeDoContato = NomeDoContato;
    }

    public String getCargoDoContato() {
        return this.CargoDoContato;
    }

    public void setCargoDoContato(String CargoDoContato) {
        this.CargoDoContato = CargoDoContato;
    }

    public String getCidade() {
        return this.Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getRegiao() {
        return this.Regiao;
    }

    public void setRegiao(String Regiao) {
        this.Regiao = Regiao;
    }

    public String getCep() {
        return this.Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getPais() {
        return this.Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getTelefone() {
        return this.Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getFax() {
        return this.Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.CodigoDoCliente);
        hash = 97 * hash + Objects.hashCode(this.NomeDaEmpresa);
        hash = 97 * hash + Objects.hashCode(this.NomeDoContato);
        hash = 97 * hash + Objects.hashCode(this.CargoDoContato);
        hash = 97 * hash + Objects.hashCode(this.Cidade);
        hash = 97 * hash + Objects.hashCode(this.Regiao);
        hash = 97 * hash + Objects.hashCode(this.Cep);
        hash = 97 * hash + Objects.hashCode(this.Pais);
        hash = 97 * hash + Objects.hashCode(this.Telefone);
        hash = 97 * hash + Objects.hashCode(this.Fax);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.CodigoDoCliente, other.CodigoDoCliente)) {
            return false;
        }
        if (!Objects.equals(this.NomeDaEmpresa, other.NomeDaEmpresa)) {
            return false;
        }
        if (!Objects.equals(this.NomeDoContato, other.NomeDoContato)) {
            return false;
        }
        if (!Objects.equals(this.CargoDoContato, other.CargoDoContato)) {
            return false;
        }
        if (!Objects.equals(this.Cidade, other.Cidade)) {
            return false;
        }
        if (!Objects.equals(this.Regiao, other.Regiao)) {
            return false;
        }
        if (!Objects.equals(this.Cep, other.Cep)) {
            return false;
        }
        if (!Objects.equals(this.Pais, other.Pais)) {
            return false;
        }
        if (!Objects.equals(this.Telefone, other.Telefone)) {
            return false;
        }
        if (!Objects.equals(this.Fax, other.Fax)) {
            return false;
        }
        return true;
    }

    
}
