import java.util.ArrayList;
import java.util.List;

interface TableAssignmentStrategy {
    Table assignTable(Reservation reservation, List<Table> tables);
}

class FirstAvailableTableStrategy implements TableAssignmentStrategy {
    @Override
    public Table assignTable(Reservation reservation, List<Table> tables) {
        for (Table table : tables) {
            if (!table.isReserved()) {
                table.reserve(reservation);
                return table;
            }
        }
        return null;
    }
}

class ClosestToEntranceTableStrategy implements TableAssignmentStrategy {
    @Override
    public Table assignTable(Reservation reservation, List<Table> tables) {
        for (Table table : tables) {
            if (!table.isReserved()) {
                table.reserve(reservation);
                return table;
            }
        }
        return null;
    }
}

class Table {
    private int number;
    private boolean isReserved;
    private Reservation reservation;

    public Table(int number) {
        this.number = number;
        this.isReserved = false;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void reserve(Reservation reservation) {
        this.isReserved = true;
        this.reservation = reservation;
        System.out.println("Table " + number + " reserved for " + reservation.getCustomerName());
    }

    public Reservation getReservation() {
        return reservation;
    }
}

class Reservation {
    private String customerName;

    public Reservation(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }
}

class ReservationSystem {
    private TableAssignmentStrategy strategy;
    private List<Table> tables;

    public ReservationSystem(TableAssignmentStrategy strategy) {
        this.strategy = strategy;
        this.tables = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            tables.add(new Table(i));
        }
    }

    public void setStrategy(TableAssignmentStrategy strategy) {
        this.strategy = strategy;
    }

    public void makeReservation(Reservation reservation) {
        Table table = strategy.assignTable(reservation, tables);
        if (table != null) {
            System.out.println("Reservation successful for " + reservation.getCustomerName());
        } else {
            System.out.println("No available table for " + reservation.getCustomerName());
        }
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem(new FirstAvailableTableStrategy());
        Reservation reservation1 = new Reservation("Alfi Aditya Zufar");
        reservationSystem.makeReservation(reservation1);

        reservationSystem.setStrategy(new ClosestToEntranceTableStrategy());
        Reservation reservation2 = new Reservation("Zufar Aditya");
        reservationSystem.makeReservation(reservation2);
    }
}
