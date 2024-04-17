package com.capstone.GetServices.DTOs;

public class UserListDTO {
    private Integer user_id;
    private String email;
    private String phone_number;
    private String full_name;
    private Boolean blocked = false;

    public UserListDTO(Integer user_id, String email, String phone_number, String full_name) {
        this.user_id = user_id;
        this.email = email;
        this.phone_number = phone_number;
        this.full_name = full_name;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "UserListDTO{" +
                "user_id=" + user_id +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", full_name='" + full_name + '\'' +
                ", blocked=" + blocked +
                '}';
    }
}
