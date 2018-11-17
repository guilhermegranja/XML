import javax.swing.*;

public class InserirDadosTeste {

    public static void main(String[] args) {

        CustomerOrderTeste OS = new CustomerOrderTeste();

        OS.setCompanyname(JOptionPane.showInputDialog("Informe o nome da Empresa"));
        OS.setCNPJ(JOptionPane.showInputDialog("Informe o CNPJ"));
        OS.setContactname(JOptionPane.showInputDialog("Nome do representante:"));
        OS.setContacttitle(JOptionPane.showInputDialog("Cargo do epresentante"));
        OS.setPhone();

    }
}
