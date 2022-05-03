package com.example.userregistration.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "userId_generator")
    private Long userId;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String username;

    @Column
    @JsonIgnore
    private String password;

    @Column
    @JsonIgnore
    private boolean enabled;


}
