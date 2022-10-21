package org.spbgut.spring.web.passport.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.spbgut.spring.web.passport.entities.Reglament;

import java.time.LocalDateTime;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassportDto {
    private int number;
    private String serial;
    private Collection<ReglamentDto> reglaments;
    private LocalDateTime createdAt;
    private LocalDateTime saledAt;

}
