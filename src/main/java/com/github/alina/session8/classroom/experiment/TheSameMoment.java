package com.github.alina.session8.classroom.experiment;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TheSameMoment {
    public static void main(String[] args) {
        LocalDateTime berlinTime = LocalDateTime.of(2025, 8, 27, 12, 0);  // 12:00 la Berlin
        LocalDateTime newYorkTime = LocalDateTime.of(2025, 8, 27, 6, 0); // 06:00 la New York

        ZonedDateTime berlinZoned = berlinTime.atZone(ZoneId.of("Europe/Berlin"));
        ZonedDateTime newYorkZoned = newYorkTime.atZone(ZoneId.of("America/New_York"));

        Instant berlinInstant = berlinZoned.toInstant();
        Instant newYorkInstant = newYorkZoned.toInstant();

        boolean sameMoment = berlinInstant.equals(newYorkInstant);

        System.out.println("Berlin UTC: " + berlinInstant);
        System.out.println("New York UTC: " + newYorkInstant);
        System.out.println("Is the same moment? " + sameMoment);
    }
}
