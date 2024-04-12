package com.example.bank.history;

import com.example.bank.account.Account;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Table(name = "history_tb")
@Entity
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Account sender ;  //보낸 계좌

    @ManyToOne(fetch = FetchType.LAZY)
    private Account receiver ; // 받는 계좌

    //역 정규화.중복해서 저장하면 조인할 필요가 없음.
//    private Long senderNumber ;
//    private Long receiverNumber ;
//    // 업데이트가 자주 일어나면 업데이트가 자주 일어나면 중복으로 데이터를 저장하면 안됨. 중복되었기 때문에 변경되면 다 변경해야되기 때문. 하지만 업데이터가 자주 안일어나면 중복해서 저장하는게 셀렉트에서 효율적임. insert 할떄는 귀찮지만. 지금은 조인한다.
//    private String senderFullname ;
//    private String reveiverFullname;
    @Column(nullable = false)
    private Long senderBalance ; // 이체 시점의 잔액
    @Column(nullable = false)
    private Long receiverBalance ;
    //Account 로 조인해서 조회된 잔액은 최종 잔액이라 이전 잔액을 확인할 수 없음.
    @Column(nullable = false)
    private Long amount ; // 이체 금액

    @CreationTimestamp
    private LocalDateTime createdAt;

    @Builder
    public History(Long id, Account sender, Account receiver, Long senderBalance, Long receiverBalance, Long amount, LocalDateTime createdAt) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.senderBalance = senderBalance;
        this.receiverBalance = receiverBalance;
        this.amount = amount;
        this.createdAt = createdAt;
    }
}
