package orgmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import orgmvc.dto.Employee;
import orgmvc.service.EmployeeService;

@Controller
public class EmpolyeeController {

	@Autowired
	EmployeeService service;
	
	
	@GetMapping({"/","/home"})
	public String loadhome() {
		return "home.jsp";
	}
	
	@GetMapping("/add")
	public String loadadd()
	{
		return "add.jsp";
	}
	
	@PostMapping("/add")
	public String add(Employee employee,ModelMap map) {
		System.out.println(employee.getName());
		return service.add(employee,map);
	}
	
}
