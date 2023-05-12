package com.example.demodb.entityUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


import java.util.UUID;

@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ContactEntity {
    @Id
    private UUID contactid;
    private String num;
    private String name;
    private String phonehash;
    private String prefix;

}
