package project.sistema;

import java.util.HashMap;
import java.util.Map;

public class CepApi {

    private static CepApi instancia = new CepApi();
    private String cep = "";
    private Map<String, String> pessoa = new HashMap<>();

    // Construtor privado para padrão Singleton
    private CepApi() {
        super();
    }

    // Método para obter a instância Singleton
    public static CepApi getInstance() {
        return instancia;
    }

    // Método para definir o CEP
    public void setCep(String cep) {
        this.cep = cep;
    }

    // Método que consulta CEP e armazena os dados fictícios no mapa `pessoa`
    public void consultaCep() {
        pessoa.clear(); // Limpa o mapa antes de adicionar novos valores

        if (this.cep.equals("01001-000")) {
            pessoa.put("Nome", "Ana");
            pessoa.put("logradouro", "Avenida Paulista");
            pessoa.put("complemento", "Próximo ao metrô Trianon");
            pessoa.put("bairro", "Bela Vista");
            pessoa.put("localidade", "São Paulo");
            pessoa.put("uf", "SP");
            pessoa.put("estado", "São Paulo");
            pessoa.put("regiao", "Sudeste");

        } else if (this.cep.equals("12345-678")) {
            pessoa.put("Nome", "João");
            pessoa.put("logradouro", "Rua das Palmeiras");
            pessoa.put("complemento", "Apto 502");
            pessoa.put("bairro", "Botafogo");
            pessoa.put("localidade", "Rio de Janeiro");
            pessoa.put("uf", "RJ");
            pessoa.put("estado", "Rio de Janeiro");
            pessoa.put("regiao", "Sudeste");

        } else {
            pessoa.put("CEP", "Não localizado");
            pessoa.put("Nome", "Desconhecido");
            pessoa.put("logradouro", "Não informado");
            pessoa.put("complemento", "Não informado");
            pessoa.put("bairro", "Não informado");
            pessoa.put("localidade", "Não informado");
            pessoa.put("uf", "Não informado");
            pessoa.put("estado", "Não informado");
            pessoa.put("regiao", "Não informado");
        }
    }

    // Retorna os dados coletados do CEP
    public Map<String, String> getDadosCep() {
        return pessoa;
    }
}
