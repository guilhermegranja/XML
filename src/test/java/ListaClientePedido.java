import java.util.ArrayList;

public class ListaClientePedido {

    ArrayList<CustomerInfoTeste> customer = new ArrayList<CustomerInfoTeste>();
    ArrayList<ShipInfoTeste> ship = new ArrayList<ShipInfoTeste>();
    ArrayList<DeliveryInfoTeste> delivery = new ArrayList<DeliveryInfoTeste>();

    public static void main(String[] args) {

        ListaClientePedido cliente = new ListaClientePedido();

        cliente.customer.add(new CustomerInfoTeste(
                "Burger King",
                "\n 74.958.458/0001.58",
                "\n Avenida Candido Portinari, 250",
                "\n Goiania",
                "\n Goias",
                "\n Brasil",
                "\n 74575-070",
                "\n Paulo Heliatan",
                "\n Gerente Comercial",
                "\n (62) 994684069"

        ));

        cliente.ship.add(new ShipInfoTeste());
        cliente.delivery.add(new DeliveryInfoTeste());


    }

}
