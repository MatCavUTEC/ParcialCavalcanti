package org.example.parcialcavalcanti.trip.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Long routeId;

    private ZonedDateTime departureTime;

    private Integer capacity;

    private Integer availableSeats;

    @Enumerated(EnumType.STRING)
    private StatusTrip status;
}
