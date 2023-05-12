package com.example.demodb.entityUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;



@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NotificationText {
    @Id
    private Long lang;

    private String text;
}
