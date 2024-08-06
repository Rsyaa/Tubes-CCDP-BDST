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
        Reservation reservation1 = new Reservation.ReservationBuilder()
                .setDate("2024-08-05")
                .setTime("19:00")
                .setNumberOfPeople(4)
                .setSpecialRequests("Window seat")
                .build();

        System.out.println(reservation1);

        Reservation reservation2 = new Reservation.ReservationBuilder()
                .setDate("2024-08-06")
                .setTime("20:00")
                .setNumberOfPeople(2)
                .build();

        System.out.println(reservation2);
    }
}
