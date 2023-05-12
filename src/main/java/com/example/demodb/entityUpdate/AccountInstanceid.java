package com.example.demodb.entityUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;



@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AccountInstanceid {
    @Id
    String instanceId;

    @OneToOne
   AccountEntity account;

}
