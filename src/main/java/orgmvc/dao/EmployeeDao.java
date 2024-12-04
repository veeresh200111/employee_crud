package orgmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import orgmvc.dto.Employee;

@Repository
public class EmployeeDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("m5");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	public void save(Employee employee) {
		
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
	}
	
	
}
