package sda.band.customer.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sda.band.customer.dto.CustomerDto;
import sda.band.customer.mapper.MapperCustomer;
import sda.band.customer.model.Customer;
import sda.band.customer.repository.CustomerRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepo;
    private final MapperCustomer mapperCustomer;

    public List<CustomerDto> getAllCustomer() {
        return customerRepo.findAll()
                .stream()
                .map(mapperCustomer::toCustomerDto)
                .collect(Collectors.toList());
    }

    public CustomerDto addCustomer(CustomerDto customerDto) {
        Customer customer = mapperCustomer.toCustomer(customerDto);
        return mapperCustomer.toCustomerDto(customerRepo.save(customer));
    }

    public CustomerDto getCustomerById(Long id) {
        return mapperCustomer.toCustomerDto(customerRepo.getOne(id));
    }

    public CustomerDto deleteCustomerById(Long id) {
        Customer customer = customerRepo.getOne(id);
        customerRepo.delete(customer);
        return mapperCustomer.toCustomerDto(customer);
    }
}
