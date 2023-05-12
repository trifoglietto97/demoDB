package com.example.demodb.entityUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class PhoneBookSyncEntity {
    @Id
    //TODO fare entità contatti e poi aggiornare
    //@OneToMany
   // private List<ContactEntity> contacts;
    private Integer offset;
    private Integer total;
    private Boolean hasnextchunk;
}
