/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasya Galih
 */
abstract class Reservation {
    protected String date;
    protected String time;
    protected int numberOfPeople;

    public Reservation(String date, String time, int numberOfPeople) {
        this.date = date;
        this.time = time;
        this.numberOfPeople = numberOfPeople;
    }

    abstract String book();
}

