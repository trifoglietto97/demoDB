package com.example.demodb.entityUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ServerinfoEntity {
    @Id
    UUID serverid;

    //TODO se serve fare entity o dto server status
    //private Serverstus status;
}
