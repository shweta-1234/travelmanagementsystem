package com.travelmanagementsystem.domain;


import com.travelmanagementsystem.constant.TravelPreference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer_id;

    @Column(name = "booking_date")
    private LocalDate localDate;

    @Column(name = "source_city")
    private String source;

    @Column(name = "destination_city")
    private String destination;

    @Column(name = "travel_vehicle")
    @Enumerated(EnumType.STRING)
    private TravelPreference vehicle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(User customer_id) {
        this.customer_id = customer_id;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public TravelPreference getVehicle() {
        return vehicle;
    }

    public void setVehicle(TravelPreference vehicle) {
        this.vehicle = vehicle;
    }
}
