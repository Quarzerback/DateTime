package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        // Step 1: Output the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + formatDateTime(currentDateTime));

        // Step 2: Add a timespan of 2 weeks and output the new date
        LocalDateTime newDateTime = currentDateTime.plusWeeks(2);
        System.out.println("New Date after 2 weeks: " + formatDateTime(newDateTime));

        // Step 3: Compare current date with a specified future date
        LocalDateTime specifiedFutureDate = LocalDateTime.of(2024, 1, 16, 6, 33); // Example future date
        compareDates(currentDateTime, specifiedFutureDate);

        // Step 4: Calculate the difference in days between two arbitrary dates and output the result.
        long daysDifference = ChronoUnit.DAYS.between(specifiedFutureDate, currentDateTime);
        System.out.println("Difference in days between specifiedFutureDate and now: " + daysDifference);
    }

    // Helper method to format LocalDateTime to a readable string
    private static String formatDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd-MM-yy HH:mm:ss");
        return dateTime.format(formatter);
    }

    // Helper method to compare two LocalDateTime instances
    private static void compareDates(LocalDateTime date1, LocalDateTime date2) {
        if (date1.isBefore(date2)) {
            System.out.println("Current date is before the specified future date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("Current date is after the specified future date.");
        } else {
            System.out.println("Current date is equal to the specified future date.");
        }
    }
}