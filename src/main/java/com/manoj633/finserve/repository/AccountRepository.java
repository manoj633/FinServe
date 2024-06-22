package com.manoj633.finserve.repository;

import com.manoj633.finserve.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
