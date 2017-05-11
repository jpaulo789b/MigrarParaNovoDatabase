package com.jpaulo.migrarparanovodatabase.executar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jpaulo.migraparanovodatabase.entidades.Tabelao;

public class importarCSV {
	
	static String csvFile = "/home/aluno/workspace/MigrarParaNovoDatabase/TABELAO.csv";
	static BufferedReader br = null;
	static String line = "";
	static String cvsSplitBy = ",";
    
	public static List<Tabelao> linhas() throws Exception {
		try {
			DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		    
			List<Tabelao> lista = new ArrayList<>();
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] TABELAOARRAY = line.split(cvsSplitBy);
                Tabelao t = new Tabelao();
                int i = 1;
                Date date = (Date)formatter.parse(TABELAOARRAY[i++]);
                
                //CATEGORIAS_CodigoDaCategoria
                t.setCategoriasCodigoDaCategoria();
                //NomeDaCategoria
                t.setNomeDaCategoria();
                //Descricao
                t.setDescricao();
                //Clientes_CodigoDoCliente
                t.setClientesCodigoDoCliente();
                //Clientes_NomeDaEmpresa
                t.setClientesNomeDaEmpresa();
                //Clientes_NomeDoContato
                t.setClientesNomeDoContato();
                //Clientes_CargoDoContato
                t.setClientesCargoDoContato();
                //Clientes_Endereco
                t.setClientesEndereco();
                //Clientes_Cidade
                t.setClientesCidade();
                //Clientes_Regiao
                t.setClientesRegiao();
                //Clientes_CEP
                t.setClientesCep();
                //Clientes_Pais
                t.setClientesPais();
                //Clientes_Telefone
                t.setClientesTelefone();
                //Clientes_Fax
                t.setClientesFax();
                //Detalhes_Pedido_NumeroDoPedido
                t.setDetalhesPedidoNumeroDoPedido();
                //Detalhes_Pedido_CodigoDoProduto
                t.setDetalhesPedidoCodigoDoProduto();
                //Detalhes_Pedido_PrecoUnitario
                t.setDetalhesPedidoPrecoUnitario();
                //Quantidade
                t.setQuantidade();
                //Desconto
                t.setDesconto();
                //CodigoDoFuncionario
                t.setCodigoDoFuncionário();
                //Sobrenome
                t.setSobrenome();
                //Nome
                t.setNome();
                //Cargo
                t.setCargo();
                //Tratamento
                t.setTratamento();
                //DataDeNascimento
                t.setDataDeNascimento();
                //DataDeContratacao
                t.setDataDeContratacao();
                //Empregados_Endereco
                t.setEmpregadosEndereco();
                //Empregados_Cidade
                t.setEmpregadosCidade();
                //Empregados_Regiao
                t.setEmpregadosRegiao();
                //Empregados_CEP
                t.setEmpregadosCep();
                //Empregados_Pais
                t.setEmpregadosPais();
                //TelefoneResidencial
                t.setTelefoneResidencial();
                //Ramal
                t.setRamal();
                //Observacoes
                t.setObservacoes();
                //Supervisor
                t.setSupervisor();                
                //Fornecedores_CodigoDoFornecedor
                t.setFornecedoresCodigoDoFornecedor();
                //Fornecedores_NomeDaEmpresa
                t.setFornecedoresNomeDaEmpresa();
                //Fornecedores_NomeDoContato	
                t.setFornecedoresNomeDoContato();
                //Fornecedores_CargoDoContato
                t.setFornecedoresCargoDoContato();
                //Fornecedores_Endereco
                t.setFornecedoresEndereco();
                //Fornecedores_Cidade
                t.setFornecedoresCidade();
                //Fornecedores_Regiao
                t.setFornecedoresRegiao();
                //Fornecedores_CEP	
                t.setFornecedoresCep();
                //Fornecedores_Pais	
                t.setFornecedoresPais();
                //Fornecedores_Telefone
                t.setFornecedoresPais();
                //Fornecedores_Fax
                t.setFornecedoresFax();
                //HomePage	
                //Pedidos_NumeroDoPedido	
                //Pedidos_CodigoDoCliente	
                //CodigoDoFuncionário	
                //DataDoPedido	
                //DataDeEntrega	DataDeEnvio	Via	Frete	NomeDoDestinatario	EnderecoDoDestinatario	CidadeDeDestino	RegiaoDeDestino	CEPdeDestino	PaisDeDestino	Produtos_CodigoDoProduto	NomeDoProduto	Produtos_CodigoDoFornecedor	Produtos_CodigoDaCategoria	QuantidadePorUnidade	Produtos_PrecoUnitario	UnidadesEmEstoque	UnidadesPedidas	NivelDeReposicao	Descontinuado	CodigoDaTransportadora	Transportadoras_NomeDaEmpresa	Transportadoras_Telefone


                lista.add(t);
                t = null;
            }
            return lista;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new Exception("VISH");
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception("VISH");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		
		
	}
}
