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
public class Transportadora {

    @Id
    private Integer codigoDaTransportadora;

    @Basic
    private String NomeDaEmpresa;

    @Basic
    private String Telefone;

    public Integer getCodigoDaTransportadora() {
        return this.codigoDaTransportadora;
    }

    public void setCodigoDaTransportadora(Integer codigoDaTransportadora) {
        this.codigoDaTransportadora = codigoDaTransportadora;
    }

    public String getNomeDaEmpresa() {
        return this.NomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String NomeDaEmpresa) {
        this.NomeDaEmpresa = NomeDaEmpresa;
    }

    public String getTelefone() {
        return this.Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.codigoDaTransportadora);
        hash = 23 * hash + Objects.hashCode(this.NomeDaEmpresa);
        hash = 23 * hash + Objects.hashCode(this.Telefone);
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
        final Transportadora other = (Transportadora) obj;
        if (!Objects.equals(this.NomeDaEmpresa, other.NomeDaEmpresa)) {
            return false;
        }
        if (!Objects.equals(this.Telefone, other.Telefone)) {
            return false;
        }
        if (!Objects.equals(this.codigoDaTransportadora, other.codigoDaTransportadora)) {
            return false;
        }
        return true;
    }
    

}
