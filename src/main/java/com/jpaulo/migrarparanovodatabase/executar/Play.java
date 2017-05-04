/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpaulo.migrarparanovodatabase.executar;

import com.jpaulo.migraparanovodatabase.entidades.Categoria;
import com.jpaulo.migraparanovodatabase.entidades.Cliente;
import com.jpaulo.migraparanovodatabase.entidades.DetalhePedido;
import com.jpaulo.migraparanovodatabase.entidades.Entrega;
import com.jpaulo.migraparanovodatabase.entidades.Fornecedor;
import com.jpaulo.migraparanovodatabase.entidades.Pedido;
import com.jpaulo.migraparanovodatabase.entidades.Produto;
import com.jpaulo.migraparanovodatabase.entidades.Tabelao;
import com.jpaulo.migraparanovodatabase.entidades.Transportadora;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author jpaulo
 */
public class Play {
    
    public static void main(String[] args) {
         Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Tabelao> tabelaoGeral = session.createCriteria(Tabelao.class).list();
        
        List<Categoria> categorias = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<DetalhePedido> detalhePedidos = new ArrayList<>();
        List<Entrega> entregas = new ArrayList<>();
        List<Fornecedor> fornecedores = new ArrayList<>();
        List<Pedido> pedidos = new ArrayList<>();
        List<Produto> produtos = new ArrayList<>();
        List<Transportadora> transportadoras = new ArrayList<>();
        
        for(Tabelao t:tabelaoGeral){
            // Objetos 
            Categoria categoria = new Categoria();
            categoria.setCodigoDaCategoria(t.getCategoriasCodigoDaCategoria());
            categoria.setNomeDaCategoria(t.getNomeDaCategoria());
            categorias.add(categoria);
            //
            Cliente cliente = new Cliente();
            cliente.setCodigoDoCliente(t.getClientesCodigoDoCliente());
            cliente.setCargoDoContato(t.getClientesCargoDoContato());
            cliente.setCep(t.getClientesCep());
            cliente.setCidade(t.getClientesCidade());
            cliente.setPais(t.getClientesPais());
            cliente.setTelefone(t.getClientesTelefone());
            cliente.setFax(t.getClientesFax());
            cliente.setNomeDaEmpresa(t.getClientesNomeDaEmpresa());
            cliente.setNomeDoContato(t.getClientesNomeDoContato());
            clientes.add(cliente);
            
            //
            DetalhePedido detalhePedido = new DetalhePedido();
            detalhePedidos.add(detalhePedido);
            //
            Entrega entrega = new Entrega();
            entregas.add(entrega);
            //
            Pedido pedido = new Pedido();
            pedidos.add(pedido);
            //
            Transportadora transportadora = new Transportadora();
            transportadoras.add(transportadora);
            // 
            Fornecedor fornecedor = new Fornecedor();
            fornecedores.add(fornecedor);
            //////////////////////////////////////////////////////
            
        }
        session.close();
    }
   
}
