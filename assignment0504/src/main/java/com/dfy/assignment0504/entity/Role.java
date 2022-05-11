package com.dfy.assignment0504.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 5/11/22 2:44 PM
 */

@Getter
@Setter
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

}
