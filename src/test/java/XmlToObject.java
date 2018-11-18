import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XmlToObject {

    public static void main(String[] args) {

        XStream stream = new XStream(new DomDriver());
        stream.alias("Info Cliente", CustomerInfoTeste.class);
        CustomerInfoTeste cliente = (CustomerInfoTeste) stream.fromXML("<Info cliente>\n" +
                "  <companyname>Burger King</companyname>\n" +
                "  <contactname>Guilherme Granja</contactname>\n" +
                "  <contacttitle>Gerente Comercial</contacttitle>\n" +
                "  <address>Avenida Candido Portinari, 250</address>\n" +
                "  <city>Goiania</city>\n" +
                "  <state>GO</state>\n" +
                "  <country>BR</country>\n" +
                "  <CNPJ>74.958.458/0001.58</CNPJ>\n" +
                "  <phone>(62) 994684069</phone>\n" +
                "  <CEP>74519.0</CEP>\n" +
                "</Info cliente>");
        System.out.println(cliente.getAddress());
    }
}
