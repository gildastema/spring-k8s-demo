package com.example.javaspringkubernetes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "persons")
@NoArgsConstructor @AllArgsConstructor @Data @Builder
public class Person {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email" , unique = true)
    private String email;

    private String name;


}
