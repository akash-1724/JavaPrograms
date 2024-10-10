package Tutorial10;
public class HotelRoom {
    private int totalSlots;

    public HotelRoom(int totalSlots) {
        this.totalSlots = totalSlots;
    }

    public void reserveSlots(int slots) throws InvalidReservationException {
        if (slots <= 0) {
            throw new InvalidReservationException("Reservation failed: Invalid number of slots (" + slots + "). Must be greater than zero.");
        }
        if (slots > totalSlots) {
            throw new InvalidReservationException("Reservation failed: Not enough slots available. Only " + totalSlots + " slots left.");
        }
        totalSlots -= slots;
        System.out.println("Reservation successful! Slots reserved: " + slots);
        System.out.println("Remaining slots: " + totalSlots);
    }

    // Custom exception as an inner class
    public static class InvalidReservationException extends Exception {
        public InvalidReservationException(String message) {
            super(message);
        }
    }
}
