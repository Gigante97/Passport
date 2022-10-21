package org.spbgut.spring.web.passport.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Data
@Table(name = "products")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "number")
    private Integer number;

    @Column(name = "serial")
    private String serial;

    @ManyToMany
    @JoinTable(name = "works",
                joinColumns = @JoinColumn(name = "product_id"),
                inverseJoinColumns = @JoinColumn(name = "reglament_id"))
    private Collection<Reglament> reglaments;

    @CreationTimestamp
    @Column(name = "create_date")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "saled_date")
    private LocalDateTime saledAt;


}
