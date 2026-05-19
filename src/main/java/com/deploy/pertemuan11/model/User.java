package com.deploy.pertemuan11.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name = "User")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String id;
    private String usernama;
    private String password;
    @OneToOne (mappedBy = "User", cascade = CascadeType.ALL)
    private User profile;
}
