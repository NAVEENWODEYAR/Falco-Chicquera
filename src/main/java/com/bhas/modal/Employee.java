package com.bhas.modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String empName;
    private String empEmail;
    private String empPhone;
    private String empCategory;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "addId")
    private List<Address> address = new ArrayList<>();
}
