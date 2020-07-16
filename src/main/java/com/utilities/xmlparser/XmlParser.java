package com.utilities.xmlparser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Path;
import java.nio.file.Paths;


public class XmlParser {
        public static void main(String args[]){
            try {
                String xmlString = "<employee>" +
                        "    <department>" +
                        "        <id>101</id>" +
                        "        <name>IT</name>" +
                        "    </department>" +
                        "    <firstName>Lokesh</firstName>" +
                        "    <id>1</id>" +
                        "    <lastName>Gupta</lastName>" +
                        "</employee>";

                Path currentRelativePath = Paths.get("");
                String s = currentRelativePath.toAbsolutePath().toString();
                System.out.println("Current relative path is: " + s);

                JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
                Unmarshaller jaxUnmarshaller = jaxbContext.createUnmarshaller();
           /*     Employee employee = (Employee) jaxUnmarshaller.unmarshal(
                     //   new File(s+"/src/main/java/com/utilities/xmlparser/sample.xml")
                        new StringReader(xmlString)
                        );

                System.out.println(employee.toString());*/

                StringWriter sw = new StringWriter();
                Marshaller jaxMarshaller = jaxbContext.createMarshaller();
                Employee employee2 = new Employee(1,"yuva","prasath", new Department(2,"Depart"));
                jaxMarshaller.marshal(employee2, sw);
                String xmlString2 = sw.toString();

                System.out.println(xmlString2);

            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }
}
