public class DeliveryInfoTeste {

    private String nomeEntregador, CPF, phoneEntregador, modeloAuto, marcaAuto, placaAuto;

    public String entregadorInfo (String nomeEntregador, String CPF, String phoneEntregador, String marcaAuto,
                                  String modeloAuto, String placaAuto) {
        String dadosEntregador = this.getNomeEntregador()
                + this.getCPF()
                + this.getPhoneEntregador()
                + this.getMarcaAuto()
                + this.getModeloAuto()
                + this.getPlacaAuto();

        return dadosEntregador;
    }

    public String getNomeEntregador() {
        return nomeEntregador;
    }

    public void setNomeEntregador(String nomeEntregador) {
        this.nomeEntregador = nomeEntregador;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getPhoneEntregador() {
        return phoneEntregador;
    }

    public void setPhoneEntregador(String phoneEntregador) {
        this.phoneEntregador = phoneEntregador;
    }

    public String getModeloAuto() {
        return modeloAuto;
    }

    public void setModeloAuto(String modeloAuto) {
        this.modeloAuto = modeloAuto;
    }

    public String getMarcaAuto() {
        return marcaAuto;
    }

    public void setMarcaAuto(String marcaAuto) {
        this.marcaAuto = marcaAuto;
    }

    public String getPlacaAuto() {
        return placaAuto;
    }

    public void setPlacaAuto(String placaAuto) {
        this.placaAuto = placaAuto;
    }
}
