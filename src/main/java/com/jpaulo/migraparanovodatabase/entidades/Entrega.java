/**
 * This file was generated by the Jeddict
 */
package com.jpaulo.migraparanovodatabase.entidades;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author aluno
 */
@Entity
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer CodigoEntrega;

    @Basic
    private float frete;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date dataDeEntrega;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date dataDeEnvio;

    @OneToOne(targetEntity = Pedido.class)
    private Pedido CodigoPedido;

    @OneToOne(targetEntity = Transportadora.class)
    private Transportadora transportadora;

    public Integer getCodigoEntrega() {
        return this.CodigoEntrega;
    }

    public void setCodigoEntrega(Integer CodigoEntrega) {
        this.CodigoEntrega = CodigoEntrega;
    }

    public float getFrete() {
        return this.frete;
    }

    public void setFrete(float frete) {
        this.frete = frete;
    }

    public Date getDataDeEntrega() {
        return this.dataDeEntrega;
    }

    public void setDataDeEntrega(Date dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }

    public Date getDataDeEnvio() {
        return this.dataDeEnvio;
    }

    public void setDataDeEnvio(Date dataDeEnvio) {
        this.dataDeEnvio = dataDeEnvio;
    }

    public Pedido getCodigoPedido() {
        return this.CodigoPedido;
    }

    public void setCodigoPedido(Pedido CodigoPedido) {
        this.CodigoPedido = CodigoPedido;
    }

    public Transportadora getTransportadora() {
        return this.transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

}