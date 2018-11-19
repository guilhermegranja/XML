public class OrderDescrip {

    //Dados empresa
    private String companyName, CNPJ, adress, city, state, country, CEP, contactName, contactTitle, contactPhone;

    //Dados entrega
    private String orderAdress, orderCity, orderState, orderCountry, orderCEP, orderDescr;
    private double orderWeight;
    private String orderDay, orderExit, orderArrival;

    //Dados entregador
    private String nome, CPF, RG, CNH, autoMarca, autoModelo, autoPlaca, phone;

    public String imprimeDados() {
        String dados = "Dados da empresa: \n"
                + this.getCompanyName()
                + this.getCNPJ()
                +  this.getAdress()
                + this.getCity()
                + this.getState()
                + this.getCountry()
                + this.getCEP()
                + this.getContactName()
                + this.getContactTitle()
                + this.getContactPhone()
                + "Dados do pedido:"
                + this.getOrderAdress()
                + this.getOrderCity()
                + this.getOrderState()
                + this.getOrderCountry()
                + this.getOrderCEP()
                + this.getOrderDescr()
                + this.getOrderWeight()
                + this.getOrderDay()
                + this.getOrderExit()
                + this.getOrderArrival()
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getOrderAdress() {
        return orderAdress;
    }

    public void setOrderAdress(String orderAdress) {
        this.orderAdress = orderAdress;
    }

    public String getOrderCity() {
        return orderCity;
    }

    public void setOrderCity(String orderCity) {
        this.orderCity = orderCity;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getOrderCountry() {
        return orderCountry;
    }

    public void setOrderCountry(String orderCountry) {
        this.orderCountry = orderCountry;
    }

    public String getOrderCEP() {
        return orderCEP;
    }

    public void setOrderCEP(String orderCEP) {
        this.orderCEP = orderCEP;
    }

    public String getOrderDescr() {
        return orderDescr;
    }

    public void setOrderDescr(String orderDescr) {
        this.orderDescr = orderDescr;
    }

    public double getOrderWeight() {
        return orderWeight;
    }

    public void setOrderWeight(double orderWeight) {
        this.orderWeight = orderWeight;
    }

    public String getOrderDay() {
        return orderDay;
    }

    public void setOrderDay(String orderDay) {
        this.orderDay = orderDay;
    }

    public String getOrderExit() {
        return orderExit;
    }

    public void setOrderExit(String orderExit) {
        this.orderExit = orderExit;
    }

    public String getOrderArrival() {
        return orderArrival;
    }

    public void setOrderArrival(String orderArrival) {
        this.orderArrival = orderArrival;
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
