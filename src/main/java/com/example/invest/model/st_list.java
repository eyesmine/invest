package com.example.invest.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class st_list {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_id;

    private String title;

    private long total_investing_amount;

    private String started_at;

    private String finished_at;

}
