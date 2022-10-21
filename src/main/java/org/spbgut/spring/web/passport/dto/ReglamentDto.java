package org.spbgut.spring.web.passport.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReglamentDto {
    private String ReglamentName;
    private int NumberIngineer;
    private LocalDateTime ReglamentDate;
}
