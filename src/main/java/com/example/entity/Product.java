package com.example.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor(staticName = "create")
@NoArgsConstructor
@ToString
@Builder
@Table
public class Product {

    @Id
    private int id;

    private String description;

    private int price;
}
