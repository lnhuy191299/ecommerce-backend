package com.nh7.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name="user_details")
public class UserDetails extends BaseEntity{
    @Column
    private String gmail;
    @Column
    private char[] phoneNumber;
    @Column
    private String address;
    @Column
    private String fullName;
    @Column
    private String dayOfBird;
    @Column
    private String gender;
    @OneToOne(mappedBy = "userDetails")
    private User user;

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public char[] getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(char[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDayOfBird() {
        return dayOfBird;
    }

    public void setDayOfBird(String dayOfBird) {
        this.dayOfBird = dayOfBird;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
