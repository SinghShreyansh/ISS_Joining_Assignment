
package org.example;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class XML {
    public static void main(String[] args) {
        String xmlString = """
                <dept>
                    <id>tech</id>
                    <value>IT</value>
                    <location>
                        <count>3</count>
                        <addresses>
                            <address>
                                <state>CA</state>
                            </address>
                            <address>
                                <state>FL</state>
                            </address>
                            <address>
                                <state>OH</state>
                            </address>
                        </addresses>
                    </location>
                </dept>
                """;

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new java.io.ByteArrayInputStream(xmlString.getBytes()));
            document.getDocumentElement().normalize();

            Element dept = (Element) document.getElementsByTagName("dept").item(0);
            System.out.println("dept is " + dept);

            String id = dept.getElementsByTagName("id").item(0).getTextContent();
            System.out.println("id is " + id);

            Element location = (Element) dept.getElementsByTagName("location").item(0);
            int count = Integer.parseInt(location.getElementsByTagName("count").item(0).getTextContent());
            System.out.println("count is " + count);

            NodeList addresses = location.getElementsByTagName("address");
            System.out.println("addresses are " + addresses);

            for (int i = 0; i < addresses.getLength(); i++) {
                Node addressNode = addresses.item(i);
                if (addressNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element address = (Element) addressNode;
                    System.out.println("address is " + address);
                    String state = address.getElementsByTagName("state").item(0).getTextContent();
                    System.out.println("state is " + state);
                }
            }

            String secondState = ((Element) addresses.item(1)).getElementsByTagName("state").item(0).getTextContent();
            System.out.println("second state is " + secondState);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
