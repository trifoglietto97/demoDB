package com.example.demodb.entityUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.hibernate.annotations.Cascade;


import java.util.List;
import java.util.UUID;

@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AgencyEntity {
    @Id
    private UUID agencyid;
    private String name;
    private String address;
    private String logo;

    @JsonIgnore
    private Double similarity;

    @JsonIgnore
    private String email;

    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<DemiseEntity> demises;


    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<AgencyEntity> agencies;



}
