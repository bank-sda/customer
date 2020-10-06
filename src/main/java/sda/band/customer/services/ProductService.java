package sda.band.customer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sda.band.customer.dto.AccountDto;
import sda.band.customer.provider.AccountsProvider;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {
    private final AccountsProvider accountProvider;
    public List<AccountDto> getCustomerAccounts(Long customerId) {
        List<AccountDto> customerAccounts = accountProvider.getCustomerAccounts(customerId);
        System.out.println("##########");
        System.out.println(customerAccounts.toString());
        System.out.println("##########");
        return customerAccounts;
    }
}
