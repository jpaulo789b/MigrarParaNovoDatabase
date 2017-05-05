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
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setCodigoDoFornecedor(t.getFornecedoresCodigoDoFornecedor());
            fornecedor.setCargoDoContato(t.getFornecedoresCargoDoContato());
            fornecedor.setPais(t.getFornecedoresPais());
            fornecedor.setCidade(t.getFornecedoresCidade());
            fornecedor.setCep(t.getFornecedoresCep());
            fornecedor.setEndereco(t.getFornecedoresEndereco());
            fornecedor.setTelefone(t.getFornecedoresTelefone());
            fornecedor.setRegiao(t.getFornecedoresRegiao());
            fornecedor.setNomeDaEmpresa(t.getFornecedoresNomeDaEmpresa());
            fornecedores.add(fornecedor);
            // 
            Produto produto = new Produto();
            produto.setCodigoDoProduto(t.getProdutosCodigoDoProduto());
            produto.setCodigoDaCategoria(categoria);
            produto.setCodigoDoFornecedor(fornecedor);
            produto.setDescontinuado(t.getDescontinuado());
            produto.setNivelDeReposicao(t.getNivelDeReposicao());
            produto.setNomeDoProduto(t.getNomeDoProduto());
            produto.setPrecoUnitario(t.getProdutosPrecoUnitario());
            produto.setQuantidadePorUnidade(t.getQuantidadePorUnidade());
            produto.setUnidadesEmEstoque(t.getUnidadesEmEstoque());
            produto.setUnidadesPedidas(t.getUnidadesPedidas());
            //
            Pedido pedido = new Pedido();
            pedido.setCodigoDoCliente(cliente);
            pedido.setDataDoPedido(t.getDataDoPedido());
            pedido.setNumeroDoPedido(t.getPedidosNumeroDoPedido());
            pedido.setVia(t.getVia());
            pedidos.add(pedido);
            //
            DetalhePedido detalhePedido = new DetalhePedido();
            
            detalhePedido.setPedido(pedido);
            detalhePedido.setProduto(produto);
            detalhePedidos.add(detalhePedido);
            detalhePedido.setPrecoUnitario(t.getDetalhesPedidoPrecoUnitario());
            //
            Entrega entrega = new Entrega();
            entrega.setCodigoPedido(pedido);
            entrega.setDataDeEntrega(t.getDataDeEntrega());
            entrega.setDataDeEnvio(t.getDataDeEnvio());
            entregas.add(entrega);
            //
            Transportadora transportadora = new Transportadora();
            transportadora.setCodigoDaTransportadora(t.getCodigoDaTransportadora());
            transportadora.setNomeDaEmpresa(t.getTransportadorasNomeDaEmpresa());
            transportadora.setTelefone(t.getTransportadorasTelefone());
            transportadoras.add(transportadora);
            //
            session.persist(transportadora);
            session.persist(categoria);
            session.persist(cliente);
            session.persist(fornecedor);
            session.persist(produto);
            session.persist(pedido);
            session.persist(produto);
            session.persist(detalhePedido);
            session.beginTransaction().commit();
            
        }
        session.close();
    }
   
}
