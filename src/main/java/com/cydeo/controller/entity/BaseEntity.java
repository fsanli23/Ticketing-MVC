package com.cydeo.controller.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {

    private long id;
    private LocalDate insertDateTime;
    private LocalDate insertUserId;
    private LocalDate lastUpdateDateTime;
    private Long lastUpdateUserId;


}
