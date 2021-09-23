package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
import java.util.Objects;

public class Event {

    private int id;
    private static int nextId=1;

    @NotBlank(message="Name is required")
    @Size(min=3, max=50, message="Name must be 3 characters.")
    private String name;

    @Size(max=500, message="description too long")
    private String description;

    @NotBlank(message="Email is required")
    @Email(message=  "Invalid Email.Try Again.")
    private String contactEmail;

    @Size(min=2, max=30, message="Location must be between 2 to 30 characters.")
    @NotBlank(message="Location is required")
    private String location;

    @AssertTrue(message="Must Register")
    private Boolean mustRegister;

//    @Size(min=1, max=30, message="Any number over zero and maximum 30")
//    @NotNull
//    private int numberOfAttendees;


    private EventType type;

    public Event(String name, String description, String contactEmail, String location,EventType type) {
        this();
        this.name = name;
        this.description=description;
        this.contactEmail=contactEmail;
        this.type= type;
        this.location=location;



    }

    public Event() {
        this.id = nextId;
        nextId++;
    }

    public Boolean getMustRegister() {
        return mustRegister;
    }

    public void setMustRegister(Boolean mustRegister) {
        this.mustRegister = mustRegister;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

//    public int getNumberOfAttendees() {
//        return numberOfAttendees;
//    }
//
//    public void setNumberOfAttendees(int numberOfAttendees) {
//        this.numberOfAttendees = numberOfAttendees;
//    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return getId() == event.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
