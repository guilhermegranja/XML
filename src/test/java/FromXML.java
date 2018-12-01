import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FromXML extends ToXML {

    public static void main(String[] args) {

        buscaArquivo();
    }


    public static void buscaArquivo() {

        try {
            FileReader ler = new FileReader("C:\\Users\\guilherme.marcal\\Desktop\\Guilherme\\Arquivo XML\\OS.xml");
            XStream xstream = new XStream(new DomDriver());

            //Feito o cast pois retorna objeto
            Customer c = (Customer) xstream.fromXML(ler);

            System.out.println("** Dados da Empresa **");
            JOptionPane.showMessageDialog(null, c.getCompanyName() + c.getCNPJ());
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
            System.out.println("Peso da carga: " + c.getOrder().getOrderWeight() + " KG");
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