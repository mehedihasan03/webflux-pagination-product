package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor(staticName = "create")
@NoArgsConstructor
@ToString
public class Product {

    @Id
    private int id;

    private String description;

    private int price;
}
