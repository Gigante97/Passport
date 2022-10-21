package org.spbgut.spring.web.passport.converters;

import org.spbgut.spring.web.passport.dto.ReglamentDto;
import org.spbgut.spring.web.passport.entities.Reglament;
import org.springframework.stereotype.Component;

@Component
public class ReglamentConverter {
    public ReglamentDto entityToDto(Reglament reglament){
        return new ReglamentDto(reglament.getReglamentName(),reglament.getNumberIngineer(),reglament.getReglamentDate());
    }
}
