package Tutorial10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelRoom room = new HotelRoom(10);

        System.out.print("Enter number of slots to reserve: ");
        int slots = sc.nextInt();

        try {
            room.reserveSlots(slots);
        } catch (HotelRoom.InvalidReservationException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

