/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasya Galih
 */
public class Main {
    public static void main(String[] args) {
        Reservation normalReservation = ReservationFactory.createReservation("normal", "2024-08-05", "19:00", 4);
        System.out.println(normalReservation.book());

        Reservation specialReservation = ReservationFactory.createReservation("special", "2024-08-06", "20:00", 2);
        System.out.println(specialReservation.book());
    }
}