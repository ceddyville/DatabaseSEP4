package org.SEP4_Data.service.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "Account")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull private String username;

    @NonNull private String password;
}
