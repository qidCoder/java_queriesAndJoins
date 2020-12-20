package com.countries.repositories;

import org.springframework.data.repository.CrudRepository;

import com.countries.models.Language;

public interface LanguageRepo extends CrudRepository<Language, Long>{

}