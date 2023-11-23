package com.bhas.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    @GeneratedValue(strategy = GenerationType.UUID)
    private int addId;
    private String addType;
    private String addValue;
}
