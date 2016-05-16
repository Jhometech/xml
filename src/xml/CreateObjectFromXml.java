package xml;

import java.io.FileInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class CreateObjectFromXml {
	public static void main(String[] args) throws Exception {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Employee emp =
				(Employee) unmarshaller.unmarshal(new FileInputStream("C:/employee.xml"));
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getPhone());
	}
}
