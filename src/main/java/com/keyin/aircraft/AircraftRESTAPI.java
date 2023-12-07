package com.keyin.aircraft;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "aircraft", path = "aircraft")
public interface AircraftRESTAPI extends JpaRepository<Aircraft, Long> {

    public List<Aircraft> findByType(String type);

    public List<Aircraft> findByAirlineName(String airlineName);

    public List<Aircraft> findByNumberOfPassengers(int numberOfPassengers);

    public List<Aircraft> findByAirport_Id(Long airportId);

    public List<Aircraft> findByPassengers_Id(Long passengerId);

}
