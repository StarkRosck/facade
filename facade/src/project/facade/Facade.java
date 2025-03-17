package project.facade;

import project.sistema.CepApi;
import project.subsitem.CrmService;
import java.util.Map;

// Classe Facade para facilitar a comunicação
public class Facade {

    public void migraCliente(String cep) {
        // Obtém a instância Singleton da CepApi
        CepApi apiCep = CepApi.getInstance();
        apiCep.setCep(cep);
        apiCep.consultaCep(); // Realiza a consulta do CEP

        // Obtém os dados do CEP
        Map<String, String> dadosCep = apiCep.getDadosCep();

        // Envia os dados completos para o CRM
        CrmService.gravarCliente(dadosCep);
    }
}
