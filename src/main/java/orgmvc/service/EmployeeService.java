package orgmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import orgmvc.dao.EmployeeDao;
import orgmvc.dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;

	public String add(Employee employee, ModelMap map) {
		dao.save(employee);
		map.put("Success", "Added Success");
		return "home.jsp";
	}



}
