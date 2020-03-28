package pl.coderslab.service;

import java.util.List;

import pl.coderslab.entity.Customer;
import pl.coderslab.exception.ResourceNotFoundException;

public interface CustomerService {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId) throws ResourceNotFoundException;

	public void deleteCustomer(int theId) throws ResourceNotFoundException;
}
