package com.example.dashboard;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "data_entries")
public class DataEntry {

    @Id
    private String id;
    private String endYear;
    private int intensity;
    private String sector;
    private String topic;
    private String insight;
    private String url;
    private String region;
    private String startYear;
    private String impact;
    private Timestamp added;
    private Timestamp published;
    private String country;
    private int relevance;
    private String pestle;
    private String source;
    private String title;
    private int likelihood;
    private String city;
    private String swot;

    // Getters and setters
    // ...
}
