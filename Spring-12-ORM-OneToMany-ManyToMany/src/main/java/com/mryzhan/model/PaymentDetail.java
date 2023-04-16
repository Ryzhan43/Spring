package com.mryzhan.model;

import com.mryzhan.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "paymentDetails")
@Data
@NoArgsConstructor
public class PaymentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private BigDecimal merchantPayoutAmount;
    private BigDecimal commisionAmount;

    private LocalDate payoutDate;
    private Status paymentStatus;

    @OneToOne(mappedBy = "paymentDetail",cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id")
    private Payment payment;

    public PaymentDetail(BigDecimal merchantPayoutAmount, BigDecimal commisionAmount, LocalDate payoutDate) {
        this.merchantPayoutAmount = merchantPayoutAmount;
        this.commisionAmount = commisionAmount;
        this.payoutDate = payoutDate;
    }
}
