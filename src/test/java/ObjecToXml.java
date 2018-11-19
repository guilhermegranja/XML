import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ObjecToXml {

    public static void main(String[] args) {

        CustomerInfoTeste cliente = new CustomerInfoTeste();
        ShipInfoTeste dadosentrega = new ShipInfoTeste();

        //Dados do cliente
        cliente.setCompanyname("Burger King");
        cliente.setCNPJ("74.958.458/0001.58");
        cliente.setAddress("Avenida Candido Portinari, 250");
        cliente.setCity("Goiania");
        cliente.setState("GO");
        cliente.setCountry("BR");
        cliente.setCEP("74575070");
        cliente.setContactname("Guilherme Granja");
        cliente.setContacttitle("Gerente Comercial");
        cliente.setPhone("(62) 994684069");

        //Dados da entrega
        dadosentrega.setShipAdress("Rua Para, 200");
        dadosentrega.setShipCity("Goiania");
        dadosentrega.setShipState("GO");
        dadosentrega.setShipCountry("BR");
        dadosentrega.setShipCEP("74575060");
        dadosentrega.setShipProduct("Maionese, Ketchup, Molhos, Pães, Carne");
        dadosentrega.setShipWeight(2500); //em Kilos
        dadosentrega.setShipTransp("Caminhão");
        dadosentrega.setShipOrder("20.11.2018");
        dadosentrega.setShipExit("21.11.2018");
        dadosentrega.setShipArraival("28.11.2018");

        XStream xstream = new XStream(new DomDriver());
        xstream.alias("Cliente info", CustomerInfoTeste.class);
        xstream.alias("Entrega info", ShipInfoTeste.class);
        String xml = xstream.toXML(cliente);
        String xml2 = xstream.toXML(dadosentrega);

        System.out.println(xml);
        System.out.println(xml2);

        gerarArquivo(xml);
        gerarArquivo2(xml2);

    }

    public static void gerarArquivo(String xml) {

        File file = new File("C:\\Users\\guilh\\Desktop\\Guilherme\\XML Arquivo\\cliente.xml");
        try {
            PrintWriter print = new PrintWriter(file);

            print.write(xml);
            print.flush();
            print.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void gerarArquivo2 (String xml2) {

        File file2 = new File("C:\\Users\\guilh\\Desktop\\Guilherme\\XML Arquivo\\entrega.xml");
        try {
            PrintWriter print2 = new PrintWriter(file2);

            print2.write(xml2);
            print2.flush();
            print2.close();

        } catch (FileNotFoundException i) {
            i.printStackTrace();
        }
    }
}