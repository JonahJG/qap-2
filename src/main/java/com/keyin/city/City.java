package com.keyin.city;

import com.keyin.airport.Airport;
import com.keyin.passenger.Passenger;

import javax.persistence.*;
import java.util.List;

@Entity
public class City {

    @Id
    @SequenceGenerator(name = "city_sequence", sequenceName = "city_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "city_sequence")

    private Long id;

    private String name;

    private String state;

    private String population;

    @ManyToMany
    private List<Airport> airports;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }


}

