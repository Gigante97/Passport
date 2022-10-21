package org.spbgut.spring.web.passport.converters;

import lombok.RequiredArgsConstructor;
import org.spbgut.spring.web.passport.dto.PassportDto;
import org.spbgut.spring.web.passport.entities.Passport;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PassportConverter {

    private final ReglamentConverter reglamentConverter;

    public PassportDto entityToDto(Passport passport) {
        PassportDto passportDto = new PassportDto();
        passportDto.setNumber(passport.getNumber());
        passportDto.setSerial(passport.getSerial());
        passportDto.setCreatedAt(passport.getCreatedAt());
        passportDto.setSaledAt(passport.getSaledAt());
        passportDto.setReglaments(passport.getReglaments().stream().map(reglamentConverter::entityToDto).collect(Collectors.toList()));
        return passportDto;
    }
}
