import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeServico {

    public static void main(String[] args) {

        List<OrderDescrip> OS = new ArrayList<OrderDescrip>();

        //Dados empresa
        OrderDescrip cliente = new OrderDescrip();
        cliente.setCompanyName("TESTE");
        cliente.setCNPJ("TESTE");
        cliente.setAdress("TESTE");
        cliente.setCity("TESTE");
        cliente.setState("TESTE");
        cliente.setCountry("TESTE");
        cliente.setCEP("TESTE");
        cliente.setContactName("TESTE");
        cliente.setContactTitle("TESTE");
        cliente.setContactPhone("TESTE");

        OS.add(cliente);

        for(int i = 0; i < OS.size(); i++) {
            System.out.println();
        }
    }
}
