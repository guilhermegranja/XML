import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.util.GregorianCalendar;

public class ObjecToXml {

    public static void main(String[] args) {

        CustomerInfoTeste cliente = new CustomerInfoTeste();

        cliente.setCompanyname("Burger King");
        cliente.setCNPJ("74.958.458/0001.58");
        cliente.setAddress("Avenida Candido Portinari, 250");
        cliente.setCity("Goiania");
        cliente.setState("GO");
        cliente.setCountry("BR");
        cliente.setCEP(74575-070);
        cliente.setContactname("Guilherme Granja");
        cliente.setContacttitle("Gerente Comercial");
        cliente.setPhone("(62) 994684069");

        XStream stream = new XStream(new DomDriver());
        stream.alias("Info cliente", CustomerInfoTeste.class);
        System.out.println(stream.toXML(cliente));

        ShipInfoTeste dadosentrega = new ShipInfoTeste();

        dadosentrega.setShipAdress("Rua Para, 200");
        dadosentrega.setShipCity("Goiania");
        dadosentrega.setShipState("GO");
        dadosentrega.setShipCountry("BR");
        dadosentrega.setShipCEP(74575-060);
        dadosentrega.setShipProduct("Maionese, Ketchup, Molhos, Pães, Carne");
        dadosentrega.setShipWeight(2500); //em Kilos
        dadosentrega.setShipTransp("Caminhão");
        dadosentrega.setShipOrder(new GregorianCalendar(2018, 11, 20));
        dadosentrega.setShipExit(new GregorianCalendar(2018, 11, 21));
        dadosentrega.setShipArraival(new GregorianCalendar(2018, 11, 28));

        XStream stream1 = new XStream(new DomDriver());
        stream1.alias("Info Entrega", ShipInfoTeste.class);
        System.out.println(stream1.toXML(dadosentrega));


    }


}