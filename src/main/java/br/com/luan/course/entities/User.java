package br.com.luan.course.entities;

import java.io.Serializable;
import java.util.Objects;

public class User  implements Serializable {
    private Long id;
     private String name;
     private String email;
     private String phone;
     private String passworld;

    public User() {
    }

    public User(Long id, String name, String email, String phone, String passworld) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.passworld = passworld;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
