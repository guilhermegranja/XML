import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class XmlToObject extends ObjectToXml {

    public static void main(String[] args) {

        buscaArquivo();
    }


    public static void buscaArquivo() {

        try {
            FileReader ler = new FileReader("C:\\Users\\guilh\\Desktop\\Java Projects\\OS.xml");
            XStream xstream = new XStream(new DomDriver());

            //Feito o cast pois retorna objeto
            Customer c = (Customer) xstream.fromXML(ler);

            JOptionPane.showMessageDialog(null,"** Dados da Empresa **"
                                            + "\n Razão social: " + c.getCompanyName()
                                            + "\n CNPJ: " + c.getCNPJ()
                                            + "\n Endereço: " + c.getAdress()
                                            + "\n Cidade: " + c.getCity()
                                            + "\n Estado: " + c.getState()
                                            + "\n País: " + c.getCountry()
                                            + "\n CEP: " + c.getCEP()
                                            + "\n Representante: " + c.getContactName()
                                            + "\n Cargo: " + c.getContactTitle()
                                            + "\n Telefone de contato: " + c.getContactPhone()
                                            + "\n Email: " + c.getEmail()

                                            + "\n \n"

                                            + "** Dados do Pedido **"
                                            + "\n Endereço da entrega: " + c.getOrder().getOrderAdress()
                                            + "\n Cidade: " + c.getOrder().getOrderCity()
                                            + "\n Estado: " + c.getOrder().getOrderState()
                                            + "\n País: " + c.getOrder().getOrderCountry()
                                            + "\n CEP: " + c.getOrder().getOrderCEP()
                                            + "\n Descrição da carga: " + c.getOrder().getOrderDescr()
                                            + "\n Peso da carga: " + c.getOrder().getOrderWeight() + " KG"
                                            + "\n Data de entreda do pedido: " + c.getOrder().getOrderDay()
                                            + "\n Data de saída do pedido: " + c.getOrder().getOrderExit()
                                            + "\n Data de chegada do pedido: " + c.getOrder().getOrderArrival()
                                            + "\n OBS: Data de chegada é uma previsão"

                                            + "\n \n "

                                            + "** Dados do entregador **"
                                            + "\n Nome do motorista: " + c.getDelivery().getNome()
                                            + "\n CPF: " + c.getDelivery().getCPF()
                                            + "\n RG: " + c.getDelivery().getRG()
                                            + "\n CNH: " + c.getDelivery().getCNH()
                                            + "\n Telefone de contato: " + c.getDelivery().getPhone()
                                            + "\n Marca: " + c.getDelivery().getAutoMarca()
                                            + "\n Modelo: " + c.getDelivery().getAutoModelo()
                                            + "\n Placa: " + c.getDelivery().getAutoPlaca());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}