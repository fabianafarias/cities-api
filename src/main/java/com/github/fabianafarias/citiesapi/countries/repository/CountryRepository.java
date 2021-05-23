package com.github.fabianafarias.citiesapi.countries.repository;

import com.github.fabianafarias.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
