import java.util.ArrayList;
import java.util.List;

class ReservationStatus {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String status) {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}

interface Observer {
    void update(String status);
}

class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println("Customer " + name + ": Reservation status updated to " + status);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        ReservationStatus status = new ReservationStatus();

        Customer customer1 = new Customer("Alfi Aditya Zufar");
        Customer customer2 = new Customer("Zufar Aditya");

        status.addObserver(customer1);
        status.addObserver(customer2);

        // Simulate status change
        status.notifyObservers("Confirmed");
        status.notifyObservers("Cancelled");
    }
}
