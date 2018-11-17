public class CustomerOrderTeste {

    String companyname, contactname, contacttitle, address, city, state, country;
    float phone;
    float CEP;
    String CNPJ;

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getContacttitle() {
        return contacttitle;
    }

    public void setContacttitle(String contacttitle) {
        this.contacttitle = contacttitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public float getPhone() {
        return phone;
    }

    public void setPhone(float phone) {
        this.phone = phone;
    }

    public float getCEP() {
        return CEP;
    }

    public void setCEP(float CEP) {
        this.CEP = CEP;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String Dados() {

        String dados = "Dados do pedido:"
                + "\n Nome Fantasia da empresa:" + this.getCompanyname()
                + "\n Endereço:"                 + this.getAddress()
                + "\n Representante da empresa:" + this.getContactname()
                + "\n Cargo do representante:"   + this.getContacttitle()
                + "\n Telefone da empresa:"      + this.getPhone()
                + "\n CNPJ:"                     + this.getCNPJ()
                + "\n Cidade:"                   + this.getCity()
                + "\n Estado:"                   + this.getState()
                + "\n País:"                     + this.getCountry()
                + "\n CEP:"                      + this.getCEP();

        return dados;
    }
}
