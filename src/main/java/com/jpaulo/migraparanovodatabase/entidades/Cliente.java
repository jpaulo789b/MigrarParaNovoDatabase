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
public class Cliente {
     @Id
     private String clientesCodigoDoCliente;
     @Column
     private String clientesNomeDaEmpresa;
     @Column
     private String clientesNomeDoContato;
     @Column
     private String clientesCargoDoContato;
     @Column
     private String clientesEndereco;
     @Column
     private String clientesCidade;
     @Column
     private String clientesRegiao;
     @Column
     private String clientesCep;
     @Column
     private String clientesPais;
     @Column
     private String clientesTelefone;
     @Column
     private String clientesFax;
}
