import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeServico {

    public static void main(String[] args) {

        List<Customer> cliente = new ArrayList<Customer>();
        List<Order> pedido = new ArrayList<Order>();
        List<Delivery> entregador = new ArrayList<Delivery>();

        for(int i = 0; i <2; i++) {

            Customer c = new Customer();
            c.setCompanyName(JOptionPane.showInputDialog("Razão social"));
            c.setCNPJ(JOptionPane.showInputDialog("Razão social"));
            c.setAdress(JOptionPane.showInputDialog("Razão social"));
            c.setCity(JOptionPane.showInputDialog("Razão social"));
            c.setState(JOptionPane.showInputDialog("Razão social"));
            c.setCountry(JOptionPane.showInputDialog("Razão social"));
            c.setContactName(JOptionPane.showInputDialog("Razão social"));
            c.setContactTitle(JOptionPane.showInputDialog("Razão social"));
            c.setContactPhone(JOptionPane.showInputDialog("Razão social"));



            Order p = new Order();
            p.setOrderAdress(JOptionPane.showInputDialog("Razão social"));
            p.setOrderCity(JOptionPane.showInputDialog("Razão social"));
            p.setOrderState(JOptionPane.showInputDialog("Razão social"));
            p.setOrderCountry(JOptionPane.showInputDialog("Razão social"));
            p.setOrderCEP(JOptionPane.showInputDialog("Razão social"));
            p.setOrderDescr(JOptionPane.showInputDialog("Razão social"));
            p.setOrderWeight(Double.parseDouble(JOptionPane.showInputDialog("wieght")));
            p.setOrderDay(JOptionPane.showInputDialog("Razão social"));
            p.setOrderExit(JOptionPane.showInputDialog("Razão social"));
            p.setOrderArrival(JOptionPane.showInputDialog("Razão social"));
            c.setOrder(p);

            Delivery e = new Delivery();
            e.setNome(JOptionPane.showInputDialog("Razão social"));
            e.setCPF(JOptionPane.showInputDialog("Razão social"));
            e.setRG(JOptionPane.showInputDialog("Razão social"));
            e.setCNH(JOptionPane.showInputDialog("Razão social"));
            e.setPhone(JOptionPane.showInputDialog("Razão social"));
            e.setAutoMarca(JOptionPane.showInputDialog("Razão social"));
            e.setAutoModelo(JOptionPane.showInputDialog("Razão social"));
            e.setAutoPlaca(JOptionPane.showInputDialog("Razão social"));
            c.setDelivery(e);

            cliente.add(c);
        }

        System.out.printf(cliente.toString());

    }
}
