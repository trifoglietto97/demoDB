package com.example.demodb.entityUpdate;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DemiseEntity {

    @Id
    private UUID idDemise;
    private String name;
    private String surname;
    private String photourl;
    private LocalDate date;
    private String obituary;
    private LocalDateTime wakets;
    private String wakeaddress;
    private LocalDateTime funeralts;
    private String funeraladdress;
    private String cityname;
    private String phonenumber;
    private String phoneprefix;
    private Integer age;
    private String agencylogo;
    private String title;
    private String phonehash;
    private String wakenotes;
    private String funeralnotes;

    private String kinshipdesc;

    private LocalDateTime ts;

    private Boolean read;

    private Kinship kinship;
    private UUID accountid;

   /* @OneToOne
    @Cascade(CascadeType.ALL)
    @JoinColumn(name = "idDemise", referencedColumnName = "idDemise")
    private AccountEntity relative;

    */

    private String relativename;

    @OneToMany
    @Cascade(CascadeType.ALL)
    @JoinColumn(name = "idDemise", referencedColumnName = "idDemise")
    private List<DemiseRelative> relatives;

   // @JsonIgnore
    //private Demisematchtype demisematchtype;

    @ManyToOne
    @JsonIgnore
    private DemiseMatchEntity match;

    @OneToMany
    @Cascade(CascadeType.ALL)
    private List<CityEntity> cities;

    @OneToOne
    @Cascade(CascadeType.ALL)
    private CityEntity city;


}





