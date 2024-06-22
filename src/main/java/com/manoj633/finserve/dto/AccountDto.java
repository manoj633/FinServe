package com.manoj633.finserve.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class AccountDto {

    private Long id;
    private String accountHolderName;
    private Double balance;
}
