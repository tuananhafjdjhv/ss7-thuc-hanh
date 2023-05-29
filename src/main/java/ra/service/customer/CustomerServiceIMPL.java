package ra.service.customer;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ra.model.Customer;
import ra.model.Province;
import ra.repository.ICustomerRepository;

import java.util.Optional;
@Repository
public class CustomerServiceIMPL implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }
}

