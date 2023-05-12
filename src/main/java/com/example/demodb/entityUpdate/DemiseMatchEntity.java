package com.example.demodb.entityUpdate;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;
import org.hibernate.annotations.Cascade;


import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DemiseMatchEntity {
    @Id
    private UUID idDemiseMatch;

    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinColumn(name = "idDemiseMatch", referencedColumnName = "idDemiseMatch")
    private AccountEntity accountid;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinColumn(name = "idDemiseMatch", referencedColumnName = "idDemiseMatch")
    private DemiseEntity demiseid;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinColumn(name = "idDemiseMatch", referencedColumnName = "idDemiseMatch")
    private CityEntity cityid;
    private String name;
    private Kinship kinship;
    //private Demisematchtype type;
    private Boolean notify;
    private LocalDateTime ts;

    @JsonIgnore
   private Lang matchLang;
}
