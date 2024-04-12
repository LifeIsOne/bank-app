package com.example.bank.account;


import com.example.bank.user.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Table(name = "account_tb")
@Entity
@Data
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ; //pr키

    @ManyToOne(fetch = FetchType.LAZY)
    private User user; //유저 정보

    @Column(unique = true,nullable = false,length = 4)
    private Integer number ; // 계좌번호

    @Column(nullable = false,length = 4)
    private String password; // 비밀번호

    @Column(nullable = false)
    private Long balance; //잔액

    private Boolean status ; // 계좌 활성화 여부, 계좌 삭제하면 false 상태가 됨. 계좌를 조회할 때는 true 인 것 만 조회
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Builder
    public Account(Long id, User user, Integer number, String password, Long balance, Boolean status, LocalDateTime createdAt) {
        this.id = id;
        this.user = user;
        this.number = number;
        this.password = password;
        this.balance = balance;
        this.status = status;
        this.createdAt = createdAt;
    }
}
