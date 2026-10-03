package org.example.parcialcavalcanti.seatRequest.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class SeatRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Long tripId;

    private Long passengerId;

    private ZonedDateTime requestedAt;

    @Enumerated(EnumType.STRING)
    private StatusSeat status;
}
