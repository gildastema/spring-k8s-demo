package com.example.javaspringkubernetes;

import com.gildastema.validations.constraints.Unique;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@NoArgsConstructor @Data
public class CreatePersonRequest {

    @NotNull @NotBlank @Email @Unique(field = "email", table = "persons")
    private String email;
    @NotBlank @NotNull
    private String name;
}
