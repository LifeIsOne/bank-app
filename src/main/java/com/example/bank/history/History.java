package com.example.bank.history;

import com.example.bank.account.Account;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
@Table(name = "history_tb")
@Entity
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // SELECT * FROM history_tb WHERE sender = 1111 or receiver = 1111;
    @ManyToOne(fetch = FetchType.LAZY)
    private Account sender;                 // 보낸 사람

    @ManyToOne(fetch = FetchType.LAZY)
    private Account receiver;               // 받는 사람

    @Column(nullable = false)
    private Long amount;                    // 이체 금액

    @Column(nullable = false)
    private Long senderBalance;             // 보낸 사람 잔액. 최종 잔액 X, 그 시점 잔액

    @Column(nullable = false)
    private Long receiverBalance;           // 받는 사람 잔액

    @CreationTimestamp
    private Timestamp createdAt;

    @Builder
    public History(Long id, Account sender, Account receiver, Long amount, Long senderBalance, Long receiverBalance, Timestamp createdAt) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.senderBalance = senderBalance;
        this.receiverBalance = receiverBalance;
        this.createdAt = createdAt;
    }
}
