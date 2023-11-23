package com.bhas.modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="addId")
    private int addId;
    private String addType;
    private String addValue;
}
