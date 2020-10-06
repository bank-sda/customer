package sda.band.customer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import sda.band.customer.controller.response.GetCustomerAccountsResponse;
import sda.band.customer.dto.AccountDto;
import sda.band.customer.dto.CustomerDto;
import sda.band.customer.services.CustomerService;
import sda.band.customer.services.ProductService;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/customer")
public class CustomerController {
    private final CustomerService customerService;
    private final ProductService productService;

    @GetMapping()
    public List<CustomerDto> getCustomer() {
        return customerService.getAllCustomer();
    }

    @GetMapping("/{id}")
    public CustomerDto getCustomer(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/{customerId}/products")
    public GetCustomerAccountsResponse getCustomerProducts(@PathVariable Long customerId) {
        CustomerDto customerDto = customerService.getCustomerById(customerId);
        List<AccountDto> customerAccounts = productService.getCustomerAccounts(customerId);
        return GetCustomerAccountsResponse.builder()
                .customerId(customerDto.getId())
                .fullName(customerDto.getFirstName() + " " + customerDto.getLastName())
                .accounts(customerAccounts)
                .build();
    }

    @PostMapping()
    public CustomerDto getAccounts(@RequestBody CustomerDto customerDto) {
        return customerService.addCustomer(customerDto);
    }

    @DeleteMapping("/{id}")
    public CustomerDto deleteCustomer(@PathVariable Long id) {
        return customerService.deleteCustomerById(id);
    }
}
