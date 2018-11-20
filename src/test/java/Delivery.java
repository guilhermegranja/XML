public class Delivery {

    private String nome, CPF, RG, CNH, autoMarca, autoModelo, autoPlaca, phone;

    Delivery() {
        this.nome = getNome();
        this.CPF = getCPF();
        this.RG = getRG();
        this.CNH = getCNH();
        this.autoMarca = getAutoMarca();
        this.autoModelo = getAutoModelo();
        this.autoPlaca = getAutoPlaca();
        this.phone = getPhone();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public String getAutoMarca() {
        return autoMarca;
    }

    public void setAutoMarca(String autoMarca) {
        this.autoMarca = autoMarca;
    }

    public String getAutoModelo() {
        return autoModelo;
    }

    public void setAutoModelo(String autoModelo) {
        this.autoModelo = autoModelo;
    }

    public String getAutoPlaca() {
        return autoPlaca;
    }

    public void setAutoPlaca(String autoPlaca) {
        this.autoPlaca = autoPlaca;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
