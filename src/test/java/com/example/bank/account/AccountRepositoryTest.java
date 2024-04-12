package com.example.bank.account;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public void findByUserId_test() throws JsonProcessingException {
        // given
        int userId = 1;

        // when
        List<Account> accountList = accountRepository.findByUserId(userId);

        // 👀
        ObjectMapper om = new ObjectMapper();
        String respBody = om.writeValueAsString(accountList);
        System.out.println(respBody);
        // then
        Assertions.assertThat(accountList).isNotNull(); // accountList가 null이 아닌지 확인
        Assertions.assertThat(accountList).isNotEmpty(); // accountList가 비어있지 않은지 확인
        for (Account account : accountList) {
            Assertions.assertThat(accountList).isEqualTo(userId);
        }

    }
}
