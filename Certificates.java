package org.example.final_project;

import jakarta.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "Certificates")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class Certificates implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator", sequenceName = "sequence_generator")
    @Column(name = "id")
    private Long id;

    @Column(name = "image_Certificate")
    private String imageCertificatePath;

    @Column(name = "description")
    private String description;

    @OneToMany(targetEntity = MaterialsLearned.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ml_fk", referencedColumnName = "id")
    private Set<MaterialsLearned> materialsLearned = new HashSet<>();

    @Column(name = "enrolled_date")
    private LocalDate enrolled_date;

    @Column(name = "completion_date")
    private LocalDate completion_date;

    @Column(name = "expiration_date")
    private LocalDate expiration_date;

    @Column(name = "is_expired")
    private Boolean is_expired;



}
