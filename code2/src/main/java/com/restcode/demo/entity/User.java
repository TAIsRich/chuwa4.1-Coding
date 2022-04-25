package com.restcode.demo.entity;
import lombok.Data;
import javax.persistence.*;

//Annotate with @Entity, then name of the class represents name of table.
@Entity
@Data
public class User {
    @Id //==PK
    //    //indicate the field is generated and will not need to set and logic is from geneator with name USER_ID_SEQ
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "USER_ID_SEQ") //auto increase

    // logic to generate the id. uses user_seq sequence starting from intial value
    @SequenceGenerator(sequenceName = "user_seq", allocationSize = 1, name = "USER_ID_SEQ", initialValue = 4)
    private Long id;


    @Column(name = "loginname")
    private String loginName;

    @Column(name = "email")
    private String email;
}
