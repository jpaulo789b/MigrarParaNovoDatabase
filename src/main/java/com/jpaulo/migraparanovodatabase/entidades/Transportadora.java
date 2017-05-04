/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpaulo.migraparanovodatabase.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author minerthal
 */
@Entity
public class Transportadora {
    @Id
     private Integer codigoDaTransportadora;
    @Column
     private String transportadorasNomeDaEmpresa;
    @Column
     private String transportadorasTelefone;
}
