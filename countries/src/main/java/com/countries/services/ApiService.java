package com.countries.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.countries.models.City;
import com.countries.models.Country;
import com.countries.repositories.CityRepo;
import com.countries.repositories.CountryRepo;
import com.countries.repositories.LanguageRepo;

@Service
public class ApiService {
	
	private CountryRepo countryRepo;
	private LanguageRepo languageRepo;
	private CityRepo cityRepo;
	
	public ApiService(CountryRepo countryRepo, LanguageRepo languageRepo, CityRepo cityRepo) {
		this.countryRepo = countryRepo;
		this.languageRepo = languageRepo;
		this.cityRepo = cityRepo;
	}
	
	public List<Object[]> findCountriesByLanguage(String language){
		return countryRepo.findCountriesByLanguageDesc(language);
	}
	
	public List<Object[]> findCountriesWithNumCities(){
		return countryRepo.findCountriesWithNumCities();
	}
	
	public List<City> findCitiesInCountryWithPopulationGreaterThan(String country, Integer population){
		return cityRepo.findCitiesInCountryWithPopulationGreaterThan(country, population);
	}
	
	public List<Object[]> findLanguagesWithPercentageGreaterThan(Double percentage){
		return countryRepo.findLanguagesWithPercentageGreaterThan(percentage);
	}
	
	public List<Country> findCountriesWithSurfaceAreaBelowThanAndPopulationGreaterThan(Double surfaceArea, Integer population){
		return countryRepo.findCountriesWithSurfaceAreaBelowThanAndPopulationGreaterThan(surfaceArea, population);
	}
	
	public List<Country> findCountriesWithGovermentFormAndCapitalGreaterThanAndLifeExpectancyGreaterThan(String govermentForm, Integer capital, Double lifeExpectancy){
		return countryRepo.findCountriesWithGovermentFormAndCapitalGreaterThanAndLifeExpectancyGreaterThan(govermentForm, capital, lifeExpectancy);
	}
	
	public List<Object[]> findCitiesInArgentinaInBuenosAiresWithPopulationGreaterThan(Integer population){
		return countryRepo.findCitiesInArgentinaInBuenosAiresWithPopulationGreaterThan(population);
	}
	
	public List<Object[]> findNumberOfCountriesInEachRegion(){
		return countryRepo.findNumberOfCountriesInEachRegion();
	}
	
}