package com.chuwa.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name="TITLE")
    private String title;

    @Column(name = "JOIN_date")
    @CreationTimestamp
    Date join_date;

    @Column(name="CREATED_DATE")
    @CreationTimestamp
    Date creat_date;


    @Column(name="UPDATE_DATE")
    @CreationTimestamp
    Date update_date;
}
