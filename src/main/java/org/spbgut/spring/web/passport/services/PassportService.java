package org.spbgut.spring.web.passport.services;

import lombok.RequiredArgsConstructor;
import org.spbgut.spring.web.passport.entities.Passport;
import org.spbgut.spring.web.passport.repositories.PassportRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PassportService {
    private final PassportRepository passportRepository;

    public Optional<Passport> findByNumber(Integer number){
        return passportRepository.findByNumber(number);
    }
}
