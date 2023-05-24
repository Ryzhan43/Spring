package com.mryzhan.bootstrap;

import com.mryzhan.enums.UserRole;
import com.mryzhan.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    AccountRepository accountRepository;

    public DataGenerator(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("============  Account Repo   ==============");
        accountRepository.findAllByAccountDetails_CountryOrAccountDetails_State("United States","Kentucky").forEach(System.out::println);
        accountRepository.findAllByAccountDetails_AgeLessThanEqual(34).forEach(System.out::println);
        accountRepository.findAllByOrderByAccountDetails_Age().forEach(a-> System.out.println(a.getAccountDetails().getAge()));
        accountRepository.readAllAccounts().forEach(System.out::println);
        accountRepository.readAllAdminAccounts().forEach(System.out::println);
        accountRepository.readAllAccountsSortedByAge().forEach(a-> System.out.println(a.getAccountDetails().getAge()));

        System.out.println("==========================");

        accountRepository.readAllByAgeLessThanNative(47).forEach(System.out::println);









    }
}
