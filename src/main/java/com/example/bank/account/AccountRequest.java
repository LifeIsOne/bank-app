package com.example.bank.account;

import lombok.Data;

public class AccountRequest {
    @Data
    public static class TransferDTO{
        private Integer senderNumber;    // 보내는 사람 계좌번호
        private Integer receiverNumber; // 받는 사람 계좌번호
        private Long amount;            // 송금 금액
        private String senderPassword;  // 비밀번호가 일치해야 이체 실행
    }
}