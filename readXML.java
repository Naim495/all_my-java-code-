import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.File;

public class ReadXML {
    public static void main(String[] args) throws Exception {
        File file = new File("students.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document doc = builder.parse(file);

        doc.getDocumentElement().normalize();

        NodeList list = doc.getElementsByTagName("student");

        for (int i = 0; i < list.getLength(); i++) {
            Element student = (Element) list.item(i);

            String name = student.getElementsByTagName("name").item(0).getTextContent();
            String grade = student.getElementsByTagName("grade").item(0).getTextContent();

            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}
