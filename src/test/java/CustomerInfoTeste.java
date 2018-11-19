public class CustomerInfoTeste {

    private String companyname, contactname, contacttitle, address, city, state, country, CNPJ, phone, CEP;

    //metodo construtores
    CustomerInfoTeste (String companyname, String CNPJ, String address, String city, String state, String country,
                             String CEP, String contactname, String contacttitle, String phone) {
        this.companyname = companyname;
        this.CNPJ = CNPJ;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.CEP = CEP;
        this.contactname = contactname;
        this.contacttitle = contacttitle;
        this.phone = phone;
    }





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

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
}
