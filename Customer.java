package com.servlets;


import java.util.UUID;

public class Customer {
    private UUID uuid;
    private String firstName;
    private String lastName;
    private String street;
    private String address;
    private String city;
    private String state;
    private String email;
    private String phone;

    public Customer(String firstName, String lastName, String street, String address,
                    String city, String state, String email, String phone) {
        this.uuid = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phone = phone;
    }

    // Getters and setters for all fields (omit for brevity)
    // ...

    public UUID getUuid() {
        return uuid;
    }

    // You can add other methods as needed (e.g., toString, equals, hashCode)
    // ...
}
