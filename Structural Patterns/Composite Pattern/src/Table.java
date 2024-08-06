class Table implements Reservable {
    private int tableNumber;
    private boolean reserved;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
        this.reserved = false;
    }

    
    public void reserve() {
        if (!reserved) {
            reserved = true;
            System.out.println("Table " + tableNumber + " has been reserved.");
        } else {
            System.out.println("Table " + tableNumber + " is already reserved.");
        }
    }

    
    public void release() {
        if (reserved) {
            reserved = false;
            System.out.println("Table " + tableNumber + " has been released.");
        } else {
            System.out.println("Table " + tableNumber + " is not reserved.");
        }
    }

    
    public boolean isReserved() {
        return reserved;
    }
}
