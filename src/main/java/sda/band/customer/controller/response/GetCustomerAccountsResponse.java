package sda.band.customer.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sda.band.customer.dto.AccountDto;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetCustomerAccountsResponse {
    private Long customerId;
    private String fullName;
    private List<AccountDto> accounts;
}
