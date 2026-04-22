public class SlotConverter {

    // Method to convert slot to row and column
    public static int[] convertSlotToPosition(int slot) {

        int row = (slot - 1) / 3;
        int column = (slot - 1) % 3;

        // Return row and column as array
        return new int[]{row, column};
    }

    public static void main(String[] args) {

        int slot = 5;

        int[] position = convertSlotToPosition(slot);

        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}