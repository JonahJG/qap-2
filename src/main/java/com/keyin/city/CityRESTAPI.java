package com.keyin.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "city", path = "city")
public interface CityRESTAPI extends JpaRepository<City, Long> {
    public List<City> findByName(@RequestParam String name);

    public List<City> findByState(@RequestParam String state);

    public List<City> findByPopulation(@RequestParam String population);

}
