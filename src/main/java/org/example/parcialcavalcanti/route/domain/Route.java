package org.example.parcialcavalcanti.route.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.parcialcavalcanti.user.domain.User;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private User owner;

    private String origin;

    private String destination;

    @Enumerated(EnumType.STRING)
    private Status status;
}
