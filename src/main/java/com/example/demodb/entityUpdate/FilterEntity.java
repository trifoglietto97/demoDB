package com.example.demodb.entityUpdate;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

import java.util.List;
import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class FilterEntity {

    //TODO fare classe cities e aggiornare

    @Id
    private UUID idFilter;

    @OneToMany( cascade = CascadeType.ALL)
    @JoinColumn(name = "idFilter", referencedColumnName = "idFilter")
    private List<CityEntity> cities;

    //private SearchSorting sorting;
    private int offset;
    private int limit;
}
