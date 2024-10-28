package com.volunteer.volunteer.platform.domain;

import com.volunteer.volunteer.platform.enumclass.UsserType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.usertype.UserType;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private UsserType userType;

}
