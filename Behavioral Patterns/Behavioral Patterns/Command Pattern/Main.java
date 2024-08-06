import java.util.Stack;

interface Command {
    void execute();
    void undo();
}

class Table {
    private int number;
    private boolean isReserved;
    private String reservedBy;

    public Table(int number) {
        this.number = number;
        this.isReserved = false;
        this.reservedBy = null;
    }

    public void reserve(String customer) {
        if (!isReserved) {
            isReserved = true;
            reservedBy = customer;
            System.out.println("Table " + number + " reserved for " + customer);
        }
    }

    public void cancelReservation() {
        if (isReserved) {
            System.out.println("Reservation for " + reservedBy + " at table " + number + " cancelled");
            isReserved = false;
            reservedBy = null;
        }
    }
}

class ReserveTableCommand implements Command {
    private Table table;
    private String customer;

    public ReserveTableCommand(Table table, String customer) {
        this.table = table;
        this.customer = customer;
    }

    @Override
    public void execute() {
        table.reserve(customer);
    }

    @Override
    public void undo() {
        table.cancelReservation();
    }
}

class CancelReservationCommand implements Command {
    private Table table;

    public CancelReservationCommand(Table table) {
        this.table = table;
    }

    @Override
    public void execute() {
        table.cancelReservation();
    }

    @Override
    public void undo() {
        // We would need to re-reserve, this is simplified for demo purposes
    }
}

class Invoker {
    private Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undoCommand() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
        }
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Table table1 = new Table(1);
        String customer = "Alfi Aditya Zufar";

        ReserveTableCommand reserveCommand = new ReserveTableCommand(table1, customer);
        invoker.executeCommand(reserveCommand);

        // Undo the reservation
        invoker.undoCommand();
    }
}
