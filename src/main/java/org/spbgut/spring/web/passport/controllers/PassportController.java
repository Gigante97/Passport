package org.spbgut.spring.web.passport.controllers;

import lombok.RequiredArgsConstructor;
import org.spbgut.spring.web.passport.converters.PassportConverter;
import org.spbgut.spring.web.passport.dto.PassportDto;
import org.spbgut.spring.web.passport.entities.Passport;
import org.spbgut.spring.web.passport.exceptions.ResourceNotFoundException;
import org.spbgut.spring.web.passport.services.PassportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/passport")
@RequiredArgsConstructor
public class PassportController {
    private final PassportService passportService;
    private final PassportConverter passportConverter;

    @GetMapping("/{number}")
    public Optional<PassportDto> getProductByNumber(@PathVariable Integer number) {
       // Passport passport = passportService.findByNumber(number).orElseThrow(() -> new ResourceNotFoundException("Product not find" + number));
        //return passport;
        //PassportDto passportDto = passportService.findByNumber(number).map(p->passportConverter.entityToDto(p)).orElseThrow(()->new ResourceNotFoundException("Product not found with id: " + number));
        passportService.findByNumber(number).orElseThrow(()->new ResourceNotFoundException("Product not found with id: " + number));
        return passportService.findByNumber(number).map(p->passportConverter.entityToDto(p));
    }
}
