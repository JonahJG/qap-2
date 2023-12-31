package com.keyin.passenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "passenger", path = "passenger")
public interface passengerRESTAPI extends JpaRepository<Passenger, Long> {
    public List<Passenger> findByFirstName(String firstName);

    public List<Passenger> findByLastName(String lastName);

    public List<Passenger> findByPhoneNumber(String phoneNumber);


}
