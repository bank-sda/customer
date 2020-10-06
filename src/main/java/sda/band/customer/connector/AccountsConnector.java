package sda.band.customer.connector;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sda.band.customer.dto.AccountDto;

import java.util.List;

@FeignClient(name = "accounts")
public interface AccountsConnector {
    @GetMapping("/api/accounts/{ownerId}")
    // GetAccountsResponse getAccounts(@PathVariable Long ownerId);
    List<AccountDto> getAccounts(@PathVariable Long ownerId);
}
