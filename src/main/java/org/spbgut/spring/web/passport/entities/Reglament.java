package org.spbgut.spring.web.passport.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "reglaments")
public class Reglament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "reglament_name")
    private String ReglamentName;

    @Column(name = "number_ingineer")
    private int NumberIngineer;

    @CreationTimestamp
    @Column(name = "reglament_date")
    private LocalDateTime reglamentDate;

}
