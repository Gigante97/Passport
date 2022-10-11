package org.spbgut.spring.web.passport.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "products")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "number")
    private String number;

    @Column(name = "serial")
    private String serial;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "saled_at")
    private LocalDateTime saledAt;


    @Column(name = "reglament_date")
    private LocalDateTime reglamentDate;

    @Column(name = "number_ingineer")
    private String numberIngineer;

    @Column(name = "reglament_name")
    private String reglamentName;

}
