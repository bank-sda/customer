package sda.band.customer.provider;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sda.band.customer.connector.AccountsConnector;
import sda.band.customer.connector.response.GetAccountsResponse;
import sda.band.customer.dto.AccountDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AccountsProvider {
    private final AccountsConnector accountsConnector;

    public List<AccountDto> getCustomerAccounts(Long customerId) {
//        GetAccountsResponse accounts = accountsConnector.getAccounts(customerId);
//        return accounts.getAccounts()
//                .stream()
//                .map(account -> AccountDto.builder()
//                        .id(account.getId())
//                        .currency(account.getCurrency())
//                        .name(account.getName())
//                        .owner(account.getOwner())
//                        .type(account.getType())
//                        .value(account.getValue())
//                        .build())
//                .collect(Collectors.toList());
        List<AccountDto> accounts = accountsConnector.getAccounts(customerId);
        return accounts;
    }
}