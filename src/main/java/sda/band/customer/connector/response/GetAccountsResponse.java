package sda.band.customer.connector.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sda.band.customer.dto.AccountDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAccountsResponse {
    private List<AccountDto> accounts;
}




