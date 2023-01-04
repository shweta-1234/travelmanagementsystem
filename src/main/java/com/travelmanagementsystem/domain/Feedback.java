package com.travelmanagementsystem.domain;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customerId;

    @Column(name = "submitted_date")
    private LocalDate submittedDate;

    @Column(name = "customer_feedback")
    private String CustomerFeedback;

    @Column(name = "customer_rating")
    private String customerRating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getCustomerId() {
        return customerId;
    }

    public void setCustomerId(User customerId) {
        this.customerId = customerId;
    }

    public LocalDate getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(LocalDate submittedDate) {
        this.submittedDate = submittedDate;
    }

    public String getCustomerFeedback() {
        return CustomerFeedback;
    }

    public void setCustomerFeedback(String customerFeedback) {
        CustomerFeedback = customerFeedback;
    }

    public String getCustomerRating() {
        return customerRating;
    }

    public void setCustomerRating(String customerRating) {
        this.customerRating = customerRating;
    }
}
