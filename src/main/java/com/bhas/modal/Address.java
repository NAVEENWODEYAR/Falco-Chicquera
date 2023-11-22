package com.bhas.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address
{
    private int addId;
    private String addType;
    private String addValue;
}
