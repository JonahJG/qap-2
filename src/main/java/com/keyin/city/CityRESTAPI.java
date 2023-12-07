package com.keyin.city;

import com.keyin.airport.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "city", path = "city")
public interface CityRESTAPI extends JpaRepository<City, Long> {
    public List<City> findByName(String name);

    public List<City> findByState(String state);

    public List<City> findByPopulation(String population);


    public List<City> findByAirports_Id(Long airportId);

}
