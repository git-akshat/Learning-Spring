package com.akshat.learningspring.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "GUEST")
public class Guest {

    @Id
    @Column(name = "Guest_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long guestId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL_ADDRESS")
    private String email;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "STATE")
    private String state;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
}
