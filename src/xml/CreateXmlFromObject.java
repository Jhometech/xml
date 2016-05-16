package xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class CreateXmlFromObject {
	public static void main(String[] args) throws Exception {
		JAXBContext context = JAXBContext.newInstance(EmployeeList.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		List<Employee> employees = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			Employee e = new Employee();
			e.setId(123+i);
			e.setName("Kiran"+i);
			e.setPhone("9999999999"+i);
			employees.add(e);
		}
		EmployeeList list = new EmployeeList();
		list.setEmployees(employees);
	
		marshaller.marshal(list, new File("C:/employee.xml"));
	}
}
