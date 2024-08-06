/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasya Galih
 */
class ReservationFactory {
    public static Reservation createReservation(String type, String date, String time, int numberOfPeople) {
        if (type.equalsIgnoreCase("normal")) {
            return new NormalReservation(date, time, numberOfPeople);
        } else if (type.equalsIgnoreCase("special")) {
            return new SpecialReservation(date, time, numberOfPeople);
        } else {
            throw new IllegalArgumentException("Unknown reservation type");
        }
    }
}
