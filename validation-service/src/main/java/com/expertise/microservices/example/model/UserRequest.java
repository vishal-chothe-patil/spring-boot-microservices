package com.expertise.microservices.example.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Name must contain only alphabets")
    private String name;

    @Email(message = "Invalid email format")
    private String email;

    @NotNull
    private Integer age;

    @Pattern(regexp = "\\d{10}", message = "Mobile must be 10 digits")
    private String mobile;

    private String rollNo;

    @NotNull
    @Pattern(regexp = "HR|IT|FINANCE|SALES", message = "Invalid department")
    private String dept;

}