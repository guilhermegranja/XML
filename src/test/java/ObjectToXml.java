import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ObjectToXml {

    public static void main(String[] args) {

        List<Customer> cliente = new ArrayList<Customer>();


        Customer c = new Customer();
        JOptionPane.showMessageDialog(null, "Preencha os dados da empresa");
        c.setCompanyName(JOptionPane.showInputDialog("Razão social"));
        c.setCNPJ(JOptionPane.showInputDialog("CNPJ"));
        c.setAdress(JOptionPane.showInputDialog("Endereço"));
        c.setCity(JOptionPane.showInputDialog("Cidade"));
        c.setState(JOptionPane.showInputDialog("UF"));
        c.setCountry(JOptionPane.showInputDialog("País"));
        c.setCEP(JOptionPane.showInputDialog("CEP"));
        c.setContactName(JOptionPane.showInputDialog("Representante da empresa"));
        c.setContactTitle(JOptionPane.showInputDialog("Cargo do representante"));
        c.setContactPhone(JOptionPane.showInputDialog("Telefone de contato"));
        c.setEmail(JOptionPane.showInputDialog("e-mail de contato"));

        Order p = new Order();
        JOptionPane.showMessageDialog(null, "Preencha os dados da carga");
        p.setOrderAdress(JOptionPane.showInputDialog("Endereço da entrega"));
        p.setOrderCity(JOptionPane.showInputDialog("Cidade"));
        p.setOrderState(JOptionPane.showInputDialog("UF"));
        p.setOrderCountry(JOptionPane.showInputDialog("País"));
        p.setOrderCEP(JOptionPane.showInputDialog("CEP"));
        p.setOrderDescr(JOptionPane.showInputDialog("Descrição da carga"));
        p.setOrderWeight(Integer.parseInt(JOptionPane.showInputDialog("Peso total da carga")));
        p.setOrderDay(JOptionPane.showInputDialog("Data do pedido"));
        p.setOrderExit(JOptionPane.showInputDialog("Data de saida do pedido"));
        p.setOrderArrival(JOptionPane.showInputDialog("Data de chegada"));
        c.setOrder(p);

        Delivery e = new Delivery();
        JOptionPane.showMessageDialog(null, "Preencha os dados do entregador");
        e.setNome(JOptionPane.showInputDialog("Nome completo"));
        e.setCPF(JOptionPane.showInputDialog("CPF (sem pontos)"));
        e.setRG(JOptionPane.showInputDialog("RG"));
        e.setCNH(JOptionPane.showInputDialog("Nº CNH"));
        e.setPhone(JOptionPane.showInputDialog("Telefone de contato"));
        e.setAutoType(JOptionPane.showInputDialog("Automovel de entrega"));
        e.setAutoMarca(JOptionPane.showInputDialog("Marca do automovel"));
        e.setAutoModelo(JOptionPane.showInputDialog("Modelo do automovel"));
        e.setAutoPlaca(JOptionPane.showInputDialog("Placa do automovel"));
        c.setDelivery(e);

        cliente.add(c);

        // Object to XML
        XStream xstream = new XStream(new DomDriver());
        String OSXML = xstream.toXML(c);

        gerarArquivo(OSXML);

        JOptionPane.showMessageDialog(null, "ARQUIVO GERADO COM SUCESSO NO DIRETORIO");

    }

    public static void gerarArquivo(String OSXML) {

        File file = new File("C:\\Users\\guilh\\Desktop\\Java Projects\\OS.xml");
        try {
            PrintWriter print = new PrintWriter(file);

            print.write(OSXML);
            print.flush();
            print.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
