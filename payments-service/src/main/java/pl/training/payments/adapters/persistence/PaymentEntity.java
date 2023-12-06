package pl.training.payments.adapters.persistence;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

import org.hibernate.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Payment")
@Getter
@Setter
public class PaymentEntity {

    @Id
    private String id;
    @Column(name = "amount")
    private BigDecimal value;
    private String currency;
    private Instant timestamp;
    private String status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PaymentEntity that = (PaymentEntity) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
