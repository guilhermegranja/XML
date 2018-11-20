public class Order {

    private String orderAdress, orderCity, orderState, orderCountry, orderCEP, orderDescr;
    private double orderWeight;
    private String orderDay, orderExit, orderArrival;

    Order() {
        this.orderAdress = getOrderAdress();
        this.orderCity = getOrderCity();
        this.orderState = getOrderState();
        this.orderCountry = getOrderCountry();
        this.orderCEP = getOrderCEP();
        this.orderDescr = getOrderDescr();
        this.orderWeight = getOrderWeight();
        this.orderDay = getOrderDay();
        this.orderExit = getOrderExit();
        this.orderArrival = getOrderArrival();
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
}
