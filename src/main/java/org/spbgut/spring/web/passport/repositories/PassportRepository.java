package org.spbgut.spring.web.passport.repositories;
//import org.spbgut.spring.web.passport.dto.PassportDto;
import org.spbgut.spring.web.passport.entities.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PassportRepository extends JpaRepository<Passport,Long> {
    Optional<Passport> findByNumber(Integer number);
}
