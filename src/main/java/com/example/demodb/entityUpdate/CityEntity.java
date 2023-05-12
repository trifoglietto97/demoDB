package com.example.demodb.entityUpdate;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;


import java.util.UUID;

@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID cityId;
    private String name;





}
