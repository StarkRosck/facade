package project.subsitem;

import java.util.Map;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void gravarCliente(Map<String, String> dadosCep) {
        System.out.println("Cliente cadastrado no sistema CRM com os seguintes dados:");
        for (Map.Entry<String, String> entry : dadosCep.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("----------------------------------");
    }

}
