package com.example.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;

@Entity
@Table(name="person")
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="idCity")
    private City city;

    private String name;

    @CPF
    private String cpf;

    @Email
    private String email;

    private String password;

    private String address;

    @Pattern(regexp = "\\d{5}-\\d{3}", message = "Invalid CEP")
    private String cep;

    @Pattern(regexp = "\\d{2}-\\d{5}-\\d{4}", message = "Invalid phone number")
    private String phone;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
}
