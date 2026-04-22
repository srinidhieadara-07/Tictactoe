import java.util.Scanner;

public class UserInputUC3 {

    // Method to read slot number
    public static int getUserSlot() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");

        int slot = scanner.nextInt();

        return slot; // Return the slot value
    }

    public static void main(String[] args) {

        int slotNumber;

        // Call method to get user input
        slotNumber = getUserSlot();

        // Display entered slot
        System.out.println("You selected slot: " + slotNumber);
    }
}