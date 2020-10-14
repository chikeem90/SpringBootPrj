package io.chikeem90.springbootsecurity2;

import io.chikeem90.springbootsecurity2.account.Account;
import io.chikeem90.springbootsecurity2.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {
    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account doyeon = accountService.createAccount("doyeon", "1234");
        System.out.println("doyeon.getUsername() + doyeon.getPassword() = " + doyeon.getUsername() + doyeon.getPassword());

    }
}
