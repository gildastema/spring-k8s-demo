package com.example.javaspringkubernetes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @Data @AllArgsConstructor
public class PersonResponse {

    private String name;
    private String email;
}
