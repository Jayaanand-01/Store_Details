package com.Sample_Project.Store_Details.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="movie")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    private String name;
    @Column
    private String owner;
}
