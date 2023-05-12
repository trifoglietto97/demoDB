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
public class CountryEntity {

    @Id
    private Integer id;
    private Integer phonecode;
}
