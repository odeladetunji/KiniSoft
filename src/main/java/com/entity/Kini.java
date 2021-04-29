package com.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Kini {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TELEPHONE")
    private Long telephone;

}
