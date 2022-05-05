package com.dfy.assignment0504.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 5/4/22 9:31 AM
 */


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="USERS")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="First_Name", nullable=false)
    private String firstName;

    @Column(name="Last_Name", nullable=false)
    private String lastName;

    @Column(name="Email", nullable=false)
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
