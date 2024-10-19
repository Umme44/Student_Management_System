package org.example.final_project;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MaterialsLearned {
    @Id
    private Long id;
    private String materials_learned;
}
