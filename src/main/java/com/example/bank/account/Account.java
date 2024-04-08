package com.example.bank.account;


import com.example.bank.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)// 자식만 접근, 외부에서 접근 X
@Data
@Table(name = "user_tb")
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Column(unique = true, nullable = false, length = 4)    // 계좌번호 '4자'
    private Integer number;

    @Column(nullable = false, length = 4)
    private Integer password;

    @Column(nullable = false)
    private Long balance;

    @Column(nullable = false)
    private Boolean status;  // true, false - 계좌활성화, 비활성화

    @CreationTimestamp
    private LocalDateTime createdAt;

    @Builder
    public Account(Long id, User user, Integer number, Integer password, Long balance, Boolean status, LocalDateTime createdAt) {
        this.id = id;
        this.user = user;
        this.number = number;
        this.password = password;
        this.balance = balance;
        this.status = status;
        this.createdAt = createdAt;
    }
}
