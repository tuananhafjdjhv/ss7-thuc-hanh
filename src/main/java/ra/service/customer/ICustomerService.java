package ra.service.customer;

import ra.model.Customer;
import ra.model.Province;
import ra.service.IGenerateService;

public interface ICustomerService extends IGenerateService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
