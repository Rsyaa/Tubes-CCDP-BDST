/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasya Galih
 */
public class Reservation {
    private String date;
    private String time;
    private int numberOfPeople;
    private String specialRequests;

    private Reservation(ReservationBuilder builder) {
        this.date = builder.date;
        this.time = builder.time;
        this.numberOfPeople = builder.numberOfPeople;
        this.specialRequests = builder.specialRequests;
    }
    
    public static class ReservationBuilder {
        private String date;
        private String time;
        private int numberOfPeople;
        private String specialRequests;

        public ReservationBuilder setDate(String date) {
            this.date = date;
            return this;
        }

        public ReservationBuilder setTime(String time) {
            this.time = time;
            return this;
        }

        public ReservationBuilder setNumberOfPeople(int numberOfPeople) {
            this.numberOfPeople = numberOfPeople;
            return this;
        }

        public ReservationBuilder setSpecialRequests(String specialRequests) {
            this.specialRequests = specialRequests;
            return this;
        }

        public Reservation build() {
            return new Reservation(this);
        }
    }
 @Override
    public String toString() {
        return "Reservation [date=" + date + ", time=" + time + ", numberOfPeople=" + numberOfPeople 
                + ", specialRequests=" + specialRequests + "]";
    }
}
