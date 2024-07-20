package com.example.dashboard;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DataEntryRepository extends JpaRepository<DataEntry, String> {
    // Custom query methods can be added here
}
