package sda.band.customer.mapper;

import org.springframework.stereotype.Component;
import sda.band.customer.dto.CustomerDto;
import sda.band.customer.model.Customer;

@Component
public class MapperCustomer {

    public Customer toCustomer(CustomerDto customerDto) {
        return Customer.builder()
                .id(customerDto.getId())
                .firstName(customerDto.getFirstName())
                .lastName(customerDto.getLastName())
                .build();
    }

    public CustomerDto toCustomerDto(Customer customer) {
        return CustomerDto.builder()
                .id(customer.getId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .build();
    }
}
