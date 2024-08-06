/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasya Galih
 */
class NormalReservation extends Reservation {
    public NormalReservation(String date, String time, int numberOfPeople) {
        super(date, time, numberOfPeople);
    }

    @Override
    String book() {
        return "Normal Reservation booked for " + numberOfPeople + " people on " + date + " at " + time;
    }

}
