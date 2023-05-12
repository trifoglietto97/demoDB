package com.example.demodb.entityUpdate;




import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


import java.util.List;
import java.util.UUID;

@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AccountEntity {

    //cappire se fare DTO o registrazione a db
    @Id
    private UUID accountid;
    private String name;
    private String surname;
    private String email;
    private String prefix;
    private String phone;
    private String phonehashed;
    private Boolean notif;
    @OneToMany
    @Cascade(CascadeType.ALL)
    private List<CityEntity> city;
    private Boolean enabled;
    private String photourl;
    //private Lang lang;
    private String idtoken;
   // private Kinship kinship;
    private String phonebookName;
    //private UserStatus status;
    @JsonIgnore
    private Double similarity;


    public List<CityEntity> getCities() {
        return city;
    }

    public void setCities(List<CityEntity> citiesByAccount) {
        this.city = citiesByAccount;
    }
}
