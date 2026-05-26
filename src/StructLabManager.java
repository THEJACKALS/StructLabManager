import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StructLabManager {
    private static final List<String> DEFAULT_ANIMALS = Arrays.asList(
            "sapi",
            "kelinci",
            "kambing",
            "unta",
            "domba"
    );

    private static final List<String> DEFAULT_REMOVALS = Arrays.asList(
            "kelinci",
            "kambing",
            "unta"
    );

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            runApplication(scanner);
        }
    }

    private static void runApplication(Scanner scanner) {
        ArrayList<String> animals = createAnimals();
        ArrayList<String> removals = createRemovals();
        boolean isRunning = true;

        while (isRunning) {
            printHeader();
            printMenu();

            int choice = readMenuChoice(scanner, 0, 4);
            System.out.println();

            switch (choice) {
                case 1:
                    printList("Data hewan awal", animals);
                    pause(scanner);
                    break;
                case 2:
                    printList("Daftar hewan yang akan dihapus", removals);
                    pause(scanner);
                    break;
                case 3:
                    processRemoval(animals, removals);
                    pause(scanner);
                    break;
                case 4:
                    animals = createAnimals();
                    removals = createRemovals();
                    System.out.println("Data telah direset ke kondisi awal.");
                    pause(scanner);
                    break;
                case 0:
                    isRunning = false;
                    System.out.println("Keluar dari StructLab Manager. Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    pause(scanner);
                    break;
            }
        }
    }

    private static ArrayList<String> createAnimals() {
        return new ArrayList<>(DEFAULT_ANIMALS);
    }

    private static ArrayList<String> createRemovals() {
        return new ArrayList<>(DEFAULT_REMOVALS);
    }

    private static void processRemoval(List<String> animals, List<String> removals) {
        System.out.println("Sebelum dihapus: " + animals);
        System.out.println("Hewan yang dihapus: " + removals);

        animals.removeAll(removals);

        System.out.println("Output: " + animals);
        System.out.println();
        System.out.println("Proses penghapusan selesai menggunakan ArrayList.removeAll().");
    }

    private static void printList(String title, List<String> items) {
        System.out.println(title + ":");
        if (items.isEmpty()) {
            System.out.println("- (data kosong)");
            return;
        }

        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }

    private static void printHeader() {
        System.out.println("========================================");
        System.out.println(" StructLab Manager");
        System.out.println(" Modular Data Structure Practice System");
        System.out.println("========================================");
    }

    private static void printMenu() {
        System.out.println("1. Lihat data hewan awal");
        System.out.println("2. Lihat daftar hewan yang akan dihapus");
        System.out.println("3. Jalankan proses penghapusan");
        System.out.println("4. Reset data ke awal");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu (0-4): ");
    }

    private static int readMenuChoice(Scanner scanner, int min, int max) {
        while (true) {
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.print("Input tidak boleh kosong. Pilih menu (" + min + "-" + max + "): ");
                continue;
            }

            try {
                int choice = Integer.parseInt(input);
                if (choice < min || choice > max) {
                    System.out.print("Pilihan harus di antara " + min + " dan " + max + ". Coba lagi: ");
                    continue;
                }
                return choice;
            } catch (NumberFormatException exception) {
                System.out.print("Input harus berupa angka. Coba lagi: ");
            }
        }
    }

    private static void pause(Scanner scanner) {
        System.out.print("Tekan Enter untuk kembali ke menu...");
        scanner.nextLine();
        System.out.println();
    }
}
