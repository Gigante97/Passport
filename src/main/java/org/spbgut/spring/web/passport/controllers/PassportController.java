package org.spbgut.spring.web.passport.controllers;

import lombok.RequiredArgsConstructor;
import org.spbgut.spring.web.passport.entities.Passport;
import org.spbgut.spring.web.passport.exceptions.ResourceNotFoundException;
import org.spbgut.spring.web.passport.services.PassportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/passport")
@RequiredArgsConstructor
public class PassportController {
    private final PassportService passportService;

    @GetMapping("/{number}")
    public Passport getProductByNumber(@PathVariable String number) {
        Passport passport = passportService.findByNumber(number).orElseThrow(() -> new ResourceNotFoundException("Product not find" + number));
        return passport;
    }
}
