public class ShipInfoTeste {

    private String ShipAdress, ShipCity, ShipState, ShipCountry, ShipProduct, ShipTransp, ShipCEP, ShipOrder, ShipExit, ShipArraival;
    private float ShipWeight;

    public String pedidoInfo (String shipAdress, String shipCity, String shipState, String shipCountry, String shipCEP,
                              String shipTransp, String shipProduct, float shipWeight, String shipOrder, String shipExit,
                              String shipArraival) {
        String dadosPedido = this.getShipAdress()
                + this.getShipCity()
                + this.getShipState()
                + this.getShipCountry()
                + this.getShipCEP()
                + this.getShipTransp()
                + this.getShipProduct()
                + this.getShipWeight()
                + this.getShipOrder()
                + this.getShipExit()
                + this.getShipArraival();

        return dadosPedido;
    }





    public String getShipAdress() {
        return ShipAdress;
    }

    public void setShipAdress(String shipAdress) {
        ShipAdress = shipAdress;
    }

    public String getShipCity() {
        return ShipCity;
    }

    public void setShipCity(String shipCity) {
        ShipCity = shipCity;
    }

    public String getShipState() {
        return ShipState;
    }

    public void setShipState(String shipState) {
        ShipState = shipState;
    }

    public String getShipCountry() {
        return ShipCountry;
    }

    public void setShipCountry(String shipCountry) {
        ShipCountry = shipCountry;
    }

    public String getShipProduct() {
        return ShipProduct;
    }

    public void setShipProduct(String shipProduct) {
        ShipProduct = shipProduct;
    }

    public String getShipTransp() {
        return ShipTransp;
    }

    public void setShipTransp(String shipTransp) {
        ShipTransp = shipTransp;
    }

    public String getShipCEP() {
        return ShipCEP;
    }

    public void setShipCEP(String shipCEP) {
        ShipCEP = shipCEP;
    }

    public String getShipOrder() {
        return ShipOrder;
    }

    public void setShipOrder(String shipOrder) {
        ShipOrder = shipOrder;
    }

    public String getShipExit() {
        return ShipExit;
    }

    public void setShipExit(String shipExit) {
        ShipExit = shipExit;
    }

    public String getShipArraival() {
        return ShipArraival;
    }

    public void setShipArraival(String shipArraival) {
        ShipArraival = shipArraival;
    }

    public float getShipWeight() {
        return ShipWeight;
    }

    public void setShipWeight(float shipWeight) {
        ShipWeight = shipWeight;
    }
}
