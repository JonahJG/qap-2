package com.keyin.passenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "passenger", path = "passenger")
public interface passengerRESTAPI extends JpaRepository<Passenger, Long> {
    public List<Passenger> findByFirstName(@RequestParam String name);

    public List<Passenger> findByLastName(@RequestParam String state);

    public List<Passenger> findByPhoneNumber(@RequestParam String population);

}
