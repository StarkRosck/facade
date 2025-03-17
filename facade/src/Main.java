import project.facade.Facade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //Ex CEPS:01001-000 | 12345-678

        String cep = "01001-000";

        Facade facade = new Facade();

        facade.migraCliente(cep);

    }
}