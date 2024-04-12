package com.example.bank.account;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class AccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void findByUserId_test(){
        // given
        int userId = 1;

        // when
        List<Account> accountList = accountRepository.findByUserId(userId);

        // 👀
//        ObjectsMapper mapper = new ObjectMapper();

        // then
        Assertions.assertThat(accountList).isNotNull(); // accountList가 null이 아닌지 확인
        Assertions.assertThat(accountList).isNotEmpty(); // accountList가 비어있지 않은지 확인
        }

}
