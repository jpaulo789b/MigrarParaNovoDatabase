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
public class Categoria {
    @Id
    private Integer CodigoDaCategoria;
    @Column
    private String NomeDaCategoria;
}
