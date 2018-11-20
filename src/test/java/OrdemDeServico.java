import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeServico {

    public static void main(String[] args) {

        List<Customer> cliente = new ArrayList<Customer>();
        List<Order> pedido = new ArrayList<Order>();
        List<Delivery> entregador = new ArrayList<Delivery>();


            Customer c = new Customer();
            c.setCompanyName("Burger King");
            c.setCNPJ("01.254.256/0001-80");
            c.setAdress("Avenida Candido Portinari, 1254");
            c.setCity("São Paulo");
            c.setState("SP");
            c.setCountry("BR");
            c.setCEP("03565-080");
            c.setContactName("Paulo Heliatan");
            c.setContactTitle("Gerente Comercial");
            c.setContactPhone("(11) 968452310");

            Order p = new Order();
            p.setOrderAdress("Avenida Columbus, 250");
            p.setOrderCity("Goiania");
            p.setOrderState("GO");
            p.setOrderCountry("BR");
            p.setOrderCEP("74575-070");
            p.setOrderDescr("Maionese, ketchup, pão e molhos");
            p.setOrderWeight(2500.2);
            p.setOrderDay("21.11.2018");
            p.setOrderExit("23.11.2018");
            p.setOrderArrival("30.11.2018");
            c.setOrder(p);

            Delivery e = new Delivery();
            e.setNome("Mauricio da Silva");
            e.setCPF("001.435.751-80");
            e.setRG("5124329");
            e.setCNH("12345678910");
            e.setPhone("(65) 994652310");
            e.setAutoType("Caminhão");
            e.setAutoMarca("Volkswagen");
            e.setAutoModelo("Constellation");
            e.setAutoPlaca("DFG-4523");
            c.setDelivery(e);

            cliente.add(c);

            // Object to XML
            XStream xstream = new XStream(new DomDriver());
            String OSXML = xstream.toXML(c);

            // System.out.println(OSXML);

            //Gera arquivo
            gerarArquivo(OSXML);

            //Le Arquivo
            buscaArquivo();
    }

    // gerar arquivo XML
    public static void gerarArquivo(String OSXML) {

        File file = new File("C:\\Users\\guilherme.marcal\\Desktop\\Guilherme\\Arquivo XML\\OS.xml");
        try {
            PrintWriter print = new PrintWriter(file);

            print.write(OSXML);
            print.flush();
            print.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    //Le arquivo XML
    public static void buscaArquivo() {

        try {
            FileReader ler = new FileReader("C:\\Users\\guilherme.marcal\\Desktop\\Guilherme\\Arquivo XML\\OS.xml");
            XStream xstream = new XStream(new DomDriver());

            //Feito o cast pois retorna objeto
            Customer c = (Customer) xstream.fromXML(ler);

            System.out.println("** Dados da Empresa **");
            System.out.println("Nome da empresa: " + c.getCompanyName());
            System.out.println("CNPJ: " + c.getCNPJ());
            System.out.println("Endereço da empresa: " + c.getAdress());
            System.out.println("Cidade: " + c.getCity());
            System.out.println("Estado: " + c.getState());
            System.out.println("País: " + c.getCountry());
            System.out.println("CEP: " + c.getCEP());
            System.out.println("Representante: " + c.getContactName());
            System.out.println("Cargo: " + c.getContactTitle());
            System.out.println("Telefone de contato: " + c.getContactPhone());

            System.out.println("\n ** Dados do Pedido **");
            System.out.println("Endereço da entrega: " + c.getOrder().getOrderAdress());
            System.out.println("Cidade: " + c.getOrder().getOrderCity());
            System.out.println("Estado: " + c.getOrder().getOrderState());
            System.out.println("País: " + c.getOrder().getOrderCountry());
            System.out.println("CEP: " + c.getOrder().getOrderCEP());
            System.out.println("Descrição da carga: " + c.getOrder().getOrderDescr());
            System.out.println("Peso da carga: " + c.getOrder().getOrderWeight());
            System.out.println("Data de entreda do pedido: " + c.getOrder().getOrderDay());
            System.out.println("Data de saída do pedido: " + c.getOrder().getOrderExit());
            System.out.println("Data de chegada do pedido: " + c.getOrder().getOrderArrival());

            System.out.println("\n ** Dados do entregador **");
            System.out.println("Nome do motorista: " + c.getDelivery().getNome());
            System.out.println("CPF: " + c.getDelivery().getCPF());
            System.out.println("RG: " + c.getDelivery().getRG());
            System.out.println("CNH: " + c.getDelivery().getCNH());
            System.out.println("Telefone de contato: " + c.getDelivery().getPhone());
            System.out.println("Forma de transporte: " + c.getDelivery().getAutoType());
            System.out.println("Marca: " + c.getDelivery().getAutoMarca());
            System.out.println("Modelo: " + c.getDelivery().getAutoModelo());
            System.out.println("Placa: " + c.getDelivery().getAutoPlaca());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
